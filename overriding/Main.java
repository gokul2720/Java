package com.gp.overriding;

public class Main {
	
	
	public static void main(String[] args) {
		Test t= new Test();
		t.brake();
		t.drive();
		t.horn();
	 
		System.out.println("===========");
		
		Audi a= new Audi();
		a.brake();
		a.drive();
		a.horn();
	}

}
