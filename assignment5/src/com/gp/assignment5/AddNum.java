package com.gp.assignment5;

import java.util.*;

public class AddNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int x = scan.nextInt();
		int a[] = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.println("enter the number " + (i + 1));
			a[i] = scan.nextInt();
		}
		System.out.println("the numbers are: " + Arrays.toString(a));

	}

}
