package com.assignment1.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment1.app.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee , Integer>{

}
