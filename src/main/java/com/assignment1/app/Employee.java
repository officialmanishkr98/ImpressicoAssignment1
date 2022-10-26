package com.assignment1.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "emp_id")
	private Integer id;
	
	private String name;
	
	private String age;
	
	@OneToOne( cascade = CascadeType.ALL )
	@JoinColumn(name = "dep_id")
	public EmpDepartment empDepartment;
	
	public Employee(EmpData empData ){
		this.name=empData.getName();
	}
}
