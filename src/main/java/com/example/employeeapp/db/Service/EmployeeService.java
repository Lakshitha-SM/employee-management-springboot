package com.example.employeeapp.db.Service;

import java.util.List;

import com.example.employeeapp.db.Entity.Employee;



public interface EmployeeService {
	
    Employee createEmployee(Employee employee);
     List<Employee> getEmployee();
     String updateEmployee(Employee employee, Long employeeId);   
     
    String deleteMethod(Long employeeId);
    
    
    
    
}
