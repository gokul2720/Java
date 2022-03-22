package com.gp.day3;

public class Child extends ThisandSuper{
	int c;
	int d;
	int x;
	int y;
	int z;
	
	public Child(int a, int b, int c ) {
		super(a,b);
		this.c=c;
		System.out.println("from child 3 parameters");
		
	}
	
	public Child(int a, int b, int c,int d,int x ) {
		this(a,b,c);
		this.d=d;
		this.x=x;
		System.out.println("from child 5 parameters");
		
	}
	
	public Child(int a, int b, int c,int d,int x ,int y, int z) {
		this(a,b,c,d,x);
		this.y=y;
		this.z=z;
		System.out.println("from child 7 parameters");
		
	}
	
	
	
	
	

}
