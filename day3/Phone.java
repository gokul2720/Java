package com.gp.day3;

public class Phone {
	int price;
	int ram;
	String brand;
	
	
	public Phone(int p, int r) {
		 price= p;
		 ram= r;
		
	}
	
	public Phone(int p) {
		price=p;
	}

	
	
	public void call() {
		System.out.println("sasi is calling his gf");
	}
	
	public void radio() {
		System.out.println("playing edho ondru ennai thaaka in radio");
	}
	
	public void message(String msg) {
		System.out.println(msg);
	}



}
