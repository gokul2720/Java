package com.gpe.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	private String designation;
	@OneToOne
	private Laptop laptop;

	public Trainee() {

	}

	public Trainee(int id, String name, double salary, String designation, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", laptop=" + laptop + "]";
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
