package com.gp.day5.interfac;

public class Avengers implements Calculator{

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
	
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y;
	}

}