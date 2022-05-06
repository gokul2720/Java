package com.gp.assessment2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Leave_info")
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serial_number")
	private int sNum;
	@Column(name = "Employee_Id")
	private int empId;
	@Column(name = "Leave_date")
	private String date;
	@Column(name = "Leave_status")
	private String status;

}
