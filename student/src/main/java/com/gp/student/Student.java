package com.gp.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Stud_info")
public class Student {

	@Id
	private int id;
	@Column(name = "stud_name", nullable = false, length = 20)
	private String name;
	private String department;
	private double mark;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", mark=" + mark + "]";
	}

	public Student() {

	}

	public Student(int id, String name, String department, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

}
