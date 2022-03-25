package com.gp.day6.exercise;

import java.util.*;



public class Exercise {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the first number");
			int number1= scan.nextInt();
			System.out.println("enter the second number");
			int number2=scan.nextInt();
			int res=0;
			res= number1/ number2;
			
			int a[];
			a= new int[res];
			a[4]= 20;
			
			System.out.println(a[4]);
			System.out.println(a[res]);
			
			
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this index is not present in the array");
		}catch (ArithmeticException e) {
			System.out.println("enter the denominator > 0");
		}
		
//		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//			if (e instanceof ArrayIndexOutOfBoundsException ) {
//				System.out.println("enter valid index");
//		
//			}if (e instanceof ArithmeticException) {
//				System.out.println("enter valid denom");
//			}
//		}
		
		System.out.println("end of program");

	}
	
	

}
