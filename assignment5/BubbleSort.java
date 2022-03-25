package com.gp.day6.exercise;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int a[];
		int y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		y = scan.nextInt();
		a = new int[y];
		int x, i, j;

		for (i = 0; i < a.length; i++) {
			System.out.println("enter " + (i + 1) + " number");
			a[i] = scan.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
