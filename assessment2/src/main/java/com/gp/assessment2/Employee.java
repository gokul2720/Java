package com.gp.assessment2;



import java.util.List;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Employee_Info")
public class Employee {
	@Id
	@Column(name = "Employee_id")
	private int id;
	@Column(name = "Employee_Name", length = 50)
	private String name;
	@Column(name = "Employee_Type", length = 50)
	private String typeOfEmp;
	@Column(name = "Email", length = 100, unique = true)
	private String mailId;
	@Column(name = "password", length = 50)
	private String password;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Leave> leave;
	 
	
	

}

