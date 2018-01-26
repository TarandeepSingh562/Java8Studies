package com.giselle;

public class SIBTest {
	public static final String owner;
	
	static {
		owner = "Giselle";
		System.out.println("SIBTest static initialization block called");
	}
	
	public SIBTest(){
		System.out.println("SIB construct called");
	}
	
	static {
		System.out.println("2nd initialization block called");
	}
	
	public void someMethod(){
		System.out.println("someMethod called");
	}
}
