package com.gp.operators;

public class Operators {

	public static void main(String[] args) {
		int a= 10;
		// unary operators
		System.out.println(a);		//10
		System.out.println(a++);	//10
		System.out.println(++a);	//12
		System.out.println(a--);	//12
		System.out.println(a); 		//11
		
		// Arithmetic operators
		
		float b= 20;
		float c= 30;
		System.out.println(b+c); 	//50
		System.out.println(b-c); 	//-10
		System.out.println(b*c); 	//600
		System.out.println(b/c); 	//0.667
		System.out.println(b%c); 	//20
		
		// Relational operators
		
		a= 5; 	//re-assigning the value
		b= 10; 	//re-assigning the value
		System.out.println(a<b); 	//true
		System.out.println(a>b); 	//false
		System.out.println(a<=b);	//true
		System.out.println(a!=b); 	//true
		System.out.println(a>=b); 	//false
		System.out.println(a==b); 	//false
		
		// Logical operators
		
		c= 20; //re-assigning the value
		System.out.println(c<a && c>b); 	//false
		System.out.println(c<a || c>b); 	//true
		
		
		
	}

}
