package com.gp.day3;

public class Samsung extends SmartPhone {

	public Samsung(int p, int r) {
		super(p, r);
	
	}

	public static void main(String[] args) {
		
		
		String modelName= "S20";
		String specialfeature= "flagship";
		Samsung samsung= new Samsung(12000,4);
		
		samsung.call();
		samsung.game();
		samsung.message("poda venna");
		
		

	}

}
