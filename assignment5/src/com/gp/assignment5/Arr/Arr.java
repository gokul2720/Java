package com.gp.assignment5.Arr;

import java.util.*;

public class Arr {

	int a[];
	int b[];

	public void arr() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the array length");

			int x = scan.nextInt();
			int a[] = new int[x];
			for (int i = 0; i < x; i++) {
				System.out.println("enter the number " + (i + 1));
				a[i] = scan.nextInt();
			}
			int b[] = new int[2];
			if (x >= 2) {
				for (int i = 0; i < 2; i++) {
					b[i] = a[i];
				}
			}else {
				b[0]=a[0];
			}
			System.out.println(Arrays.toString(b));
		} catch (Exception e) {
			System.out.println(Arrays.toString(b));
		}
	}

}
