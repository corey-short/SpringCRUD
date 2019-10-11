package com.coreyshort.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreyshort.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}