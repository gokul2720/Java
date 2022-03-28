package com.gp.assignment5.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public void a() {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(b);
	}

}
