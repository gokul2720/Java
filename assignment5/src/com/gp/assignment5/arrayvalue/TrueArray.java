package com.gp.assignment5.arrayvalue;

import java.util.Arrays;
import java.util.Scanner;

public class TrueArray {
	public boolean array(int a[]) {
		int count = 0;
		int i;
		for (i = 0; i < a.length-1; i++) {
			if (a[i] == 3) {
				count++;
			}

			if (a[i] == 3 && a[i + 1] == 3) {
				return false;
			}
		}

		if (count == 3) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the array length:");
			int x = scan.nextInt();
			int a[] = new int[x];

			for (int i = 0; i < a.length; i++) {
				System.out.println("enter the number " + (i + 1));
				a[i] = scan.nextInt();
			}
			scan.close();

			TrueArray condition = new TrueArray();
			System.out.println(condition.array(a));
			System.out.println(Arrays.toString(a));

	}

}
