package com.assignment1.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpDepRepository extends JpaRepository<EmpDepartment , Integer>{

}
