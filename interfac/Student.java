package com.gp.day5.interfac;

public class Student {

	public static void main(String[] args) {
		
		Calculator cal= new Casio();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(5, 3));
		System.out.println(cal.mul(3, 8));
		System.out.println(cal.div(6, 4));
		
	}

}
