package com.giselle;

public class Main {

	public static void main(String[] args) {
		Account giselleAccount = new Account("Giselle");
		giselleAccount.deposit(5000000);
		giselleAccount.withdraw(500);
		giselleAccount.withdraw(-200);
		giselleAccount.deposit(-20);
		giselleAccount.calculateBalance();
		//giselleAccount.balance = 6000000; //it's not good permit it
		
		System.out.println("Balance on account is " + giselleAccount.getBalance());
		//giselleAccount.transactions.add(5200042);
		giselleAccount.calculateBalance();
	}

}
