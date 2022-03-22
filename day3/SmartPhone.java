package com.gp.day3;

public class SmartPhone extends Phone {

	int camera;
	int cameracount;
	String brand;

	public SmartPhone(int p, int r, int c, int cam) {
		super(p, r);
		camera = c;
		cameracount = cam;

		System.out.println("this is from subclass SmartPhone");
	}
	
	public SmartPhone(int p, int r) {
		super(p);
		ram= r;
				}

	

	public void game() {
		System.out.println("playing PUBG");
	}

	public void selfie() {
		System.out.println("take selfie with front camera ");
	}

}
