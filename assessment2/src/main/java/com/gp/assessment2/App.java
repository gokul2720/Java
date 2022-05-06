package com.gp.assessment2;

import java.util.Scanner;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("WELCOME TO THE FACTORY");
		System.out.println("Press 1 for Registration");
		System.out.println("Press 2 for Login");
		int x = in.nextInt();
		switch (x) {
		case 1:
			Register.register();
			break;
		case 2:
			Login.login();
			break;
		default:
			System.out.println("enter valid data");
		}
	}

}
