package com.gp.operators;

public class Exercise {
	public static void main(String[] args) {
		int a= 20;
		int b= 30;
		int c= 40;
		
		System.out.println(a>b && ++c>b); 		//false
		System.out.println(a++<b || ++c < b); 	//true
		System.out.println(a++<b || ++c < b++); //true
		
		System.out.println(c); //40
		System.out.println(b); //30
		System.out.println(a); //22
		
	}

	

}
