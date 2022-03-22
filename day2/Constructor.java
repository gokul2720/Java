package com.gp.day2;

public class Constructor {
	Constructor() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Constructor a = new Constructor();
		Method.mul(3, 6, 1);

		Method i = new Method();
		Method.mul(4, 6, 8);
		System.out.println(i.c);
		Method.mul(8, 7);

	}

}
