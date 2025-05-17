package com.example.employeeapp.db.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employeeapp.db.Service.EmployeeService;
import com.example.employeeapp.db.Entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @PutMapping("/update/{empid}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable("empid") Long employeeId) {
        return employeeService.updateEmployee(employee, employeeId);
    }

    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam("empid") Long employeeId) {
        return employeeService.deleteMethod(employeeId);
    }
}
