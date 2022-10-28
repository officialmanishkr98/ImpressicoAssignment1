package com.assignment1.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment1.app.entity.EmpDepartment;


@Repository
public interface EmpDepRepository extends JpaRepository<EmpDepartment , Integer>{

}
