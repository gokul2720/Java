package com.gp.day7.exception;

public class AgeCriteriaNotMetException extends Exception{
	
	public int age;

	public AgeCriteriaNotMetException(int age) {
		super();
		this.age = age;
	}
	
	

}
