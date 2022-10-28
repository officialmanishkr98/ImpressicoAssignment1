package com.assignment1.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.app.entity.EmpData;
import com.assignment1.app.entity.EmpDepartment;
import com.assignment1.app.entity.Employee;
import com.assignment1.app.repository.EmpDepRepository;
import com.assignment1.app.repository.EmpRepository;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Service
@Data
@Getter
@Setter
public class EmpServices {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private EmpDepRepository empDepRepository;
	
	
	
	public Employee addEmployee( EmpData empData ) {
	
		Employee employee = new Employee();
		EmpDepartment empDepartment = new EmpDepartment();
		
		employee.setName(   empData.getName()    );
		employee.setAge(    empData.getAge()     );
		
		empDepartment.setDepartmentName( empData.getDepartmentName() );
		
		EmpDepartment dep = empDepRepository.save(empDepartment);
		
		employee.setEmpDepartment(dep);
		
		Employee emp = empRepository.save(employee);

		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}
	
	public String updateEmployee( Employee emp , Integer id) {
		
		Optional<Employee>  temp = empRepository.findById(id);
		temp.get().setAge(  emp.getAge()  );
		temp.get().setName( emp.getName() );
		
		empRepository.save( temp.get() );

		return "Employee with id: "+ id + " Updated Successfully";
		
	}
	
	public String deleteEmployee( Integer id) {
		empRepository.deleteById(id);
		return "All Employes with id: "+ id + " Deleted Successfully";
	}

}
