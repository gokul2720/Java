package com.gp.overriding;

public class Audi extends Test {
	@Override
	public void brake() {
		System.out.println("new brakes installed");
	}

}
