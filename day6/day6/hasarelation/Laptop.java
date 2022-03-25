package com.gp.day6.hasarelation;

public class Laptop {

	String brand;
	Ram ram;
	Battery battery;
	Screen screen;
	double price;

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", battery=" + battery + ", screen=" + screen + ", price="
				+ price + "]";
	}

}
