package com.example.employeeapp.db.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeapp.db.Service.EmployeeService;
import com.example.employeeapp.db.Entity.Employee;
import com.example.employeeapp.db.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        Optional<Employee> byId = employeeRepository.findById(employee.getEmployeeId());

        if (byId.isPresent()) {
            throw new RuntimeException("Employee already exists with ID: " + employee.getEmployeeId());
        }

        return employeeRepository.save(employee);
        //insert into employee
    }

    @Override
    public List<Employee> getEmployee() {
        return (List<Employee>) employeeRepository.findAll();
        //select * from 
        
    }
    
    
    //update
    
    
    

    @Override
    public String updateEmployee(Employee employee, Long employeeId){
    	
        Optional<Employee> existing = employeeRepository.findById(employeeId);

        if (existing.isPresent())
        {
            employee.setEmployeeId(employeeId); 
            employeeRepository.save(employee);
            return "Employee updated successfully: " + employeeId;
        }

        return "Employee not found with ID: " + employeeId;
    }
    
    
    

    @Override
    public String deleteMethod(Long employeeId) {
        if (employeeRepository.existsById(employeeId)) {
            employeeRepository.deleteById(employeeId);
            return "Employee deleted successfully: " + employeeId;
        }

        return "Employee not found with ID: " + employeeId;
    }
}
