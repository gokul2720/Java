package com.gp.day5;

public abstract class Abstract {

	int x;
	static int y;

	public Abstract(int x) {
		this.x = x;
	}

	abstract void m1();

	public void m2() {
		System.out.println("this is a method" + x);
	}

}
