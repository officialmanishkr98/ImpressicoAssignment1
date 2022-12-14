package com.assignment1.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDepartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departmentID;
	
	private String departmentName;
	
}
