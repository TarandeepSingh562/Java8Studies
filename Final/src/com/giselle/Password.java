package com.giselle;

public class Password {
	private static final int key = 78541223;
	private final int encryptedPassword;
	
	public Password(int password){
		this.encryptedPassword = encryptDecrypt(password);
	}
	
	private int encryptDecrypt(int password){
		return password ^ key;
	}
	
	public final void storedPassword(){
		System.out.println("Saving password as " + this.encryptedPassword);
	}
	
	public boolean letMeIn(int password){
		if(encryptDecrypt(password) == this.encryptedPassword){
			System.out.println("welcome");
			return true;
		} else {
			System.out.println("nope, you cannot come in");
			return false;
		}
	}
}
