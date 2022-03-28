package com.gp.day7.exception;

import java.util.Scanner;

public class License {
	
	public String name;
	public int age;
	
	public String name() {
		return name;
		
	}
	
	public int age() {
		return age;
	}
	
	public void eligibility() {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the age");
		age=scan.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible for applying License");
		}else {
			try{
				throw new AgeCriteriaNotMetException(18);
		}catch(AgeCriteriaNotMetException e) {
			System.out.println(e);
			System.out.println("not eligible for applying license");
		}
		}
		
	}
	

}
