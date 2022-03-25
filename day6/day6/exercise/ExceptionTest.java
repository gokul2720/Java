package com.gp.day6.exercise;

public class ExceptionTest {
	
	public static void main(String[] args) {
		System.out.println("program started");
		try {
			throw new ArithmeticException();
			}catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("program end");
	}

}
