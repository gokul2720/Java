package com.gp.day5.accessspecifiers;

public class Demo {
	public int x=10;		//can be accessed anywhere
	protected int y=20;		//can be accessed when the classes are connected or in the same package
	int z=30;				//can be accessed inside a package
	private int a=25;		//can be accessed only inside the class

	 public void m() {
		System.out.println(x+ " is public");  
	}
	
	protected void m1() {
		System.out.println(y + " is protected");
	}
	
	 void m2() {
		System.out.println(z+ " is default");
	}
	
	private void m3() {
		System.out.println(a+ " is private");
	}
}
