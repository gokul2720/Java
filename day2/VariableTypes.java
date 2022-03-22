package com.gp.day2;

public class VariableTypes {
		static int a= 20;
			   int b= 30;
	public static void main(String[] args) {
		int c= 10;
		System.out.println(c);				//local variable
		System.out.println(VariableTypes.a); //static variable
		
		VariableTypes x= new VariableTypes();//object creation
		System.out.println(x.b);			//instance variable
		
		
	}

}
