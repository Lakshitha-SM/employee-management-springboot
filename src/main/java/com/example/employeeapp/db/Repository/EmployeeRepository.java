package com.example.employeeapp.db.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeapp.db.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
