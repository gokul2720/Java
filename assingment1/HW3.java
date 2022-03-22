package assingment1;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("enter the limit value");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = 0; j <= i; j++) {
				sum = (int) (sum + (Math.pow(2, j)) * b);
			}
			System.out.print(a + sum + ",");
		}
	}
}
