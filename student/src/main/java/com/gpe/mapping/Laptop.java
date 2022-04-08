package com.gpe.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	private String brand;
	private String baterry;
	private String rom;

//	@OneToOne						// this will give trainee id in laptop table
//	private Trainee trainee;

	@OneToOne(mappedBy = "laptop",cascade = CascadeType.ALL) // this will not give trainee id in laptop
	private Trainee trainee;

	public Laptop(int id, String brand, String baterry, String rom) {
		super();
		this.id = id;
		this.brand = brand;
		this.baterry = baterry;
		this.rom = rom;
	}

	public Laptop() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBaterry() {
		return baterry;
	}

	public void setBaterry(String baterry) {
		this.baterry = baterry;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

}
