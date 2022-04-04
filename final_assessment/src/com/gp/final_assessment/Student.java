package com.gp.final_assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	String course;
	double mark;

	static ArrayList<Student> arrayList = new ArrayList<Student>();

	public Student(int id, String name, String course, double mark) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.mark = mark;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", mark=" + mark + "]";
	}

	public static Student addStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter student details: \n (1)id \n (2)name \n (3)course \n (4)marks ");
		Student student = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
		return student;
	}

}
