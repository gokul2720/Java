package com.gp.day2;

public class Method {
	int c = 20;
	int b = 30;
//	static int mul(int x, int y) {
//		int mul=x*y;
//		return mul;
//		
//	}
//	public static void main(String[] args) {
//		int result= Method.mul(4, 5);
//		System.out.println(result);
//		int result1= Method.mul(20,15 );
//		System.out.println(result1);
//		 
//		
//
//	}
	// method overloading

	static void mul(int x, int y) {
		int mul = x * y;
		System.out.println(mul);

	}

	static void mul(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	static void mul(double x, double y) {
		System.out.println(x * y);

	}

	static void mul(double y, int x) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Method.mul(4, 3);

	}
}
