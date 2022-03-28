package com.gp.day7.exception;

public class User {
	
	public static void main(String[] args) {
		
		Bank bank= new Bank();
		System.out.println(bank.getBalance());
		bank.deposit(1000);
		bank.withdraw(500);
		bank.withdraw(600);
	}

}
