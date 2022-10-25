package com.assignment1.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	public String tempEmployee() {
		Employee temp = new Employee();
		temp.setName("TempName");
		temp.setAge("0000");	
		empRepository.save(temp);
		
		return "Temp employee is Created";
	}
	
	public String addEmployee( Employee emp ) {
		empRepository.save(emp);
		return "Employee Added Successfully";
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
