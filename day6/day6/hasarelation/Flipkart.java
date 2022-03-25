package com.gp.day6.hasarelation;

public class Flipkart {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();

		Battery battery = new Battery();
		battery.brand = "Shiangxou";
		battery.capacity = 99;
		battery.type = "lithium-ion";

		Ram ram = new Ram();
		ram.brand = "Corsair";
		ram.clockSpeed = 3200;
		ram.size = 16;

		Screen screen = new Screen();
		screen.brand = "Samsung";
		screen.resolution = 1440;
		screen.type = "oled";

		laptop.brand = "hp";
		laptop.price = 70000;
		laptop.battery = battery;
		laptop.ram = ram;
		laptop.screen = screen;

		System.out.println(laptop);

	}

}
