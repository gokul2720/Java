package com.gp.assignment4.hw2;

public class Area extends Shape {

	@Override
	double RectangleArea(int l, int b) {
		System.out.println(l * b);

		return 0;
	}

	@Override
	double SquareArea(int a) {
		System.out.println(Math.pow(a, 2));

		return 0;
	}

	@Override
	double CircleArea(int r) {
		System.out.println(3.14 * Math.pow(r, 2));
		return 0;
	}

}
