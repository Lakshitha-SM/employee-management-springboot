package com.example.employeeapp.db.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="employee")
public class Employee {
	
	
	
	
	@Column(name="employeeeid")
	@Id //primary key
    private Long employeeId;
	
	@Column(name="employeename")
    private String employeeName;
	
	@Column(name="email", unique=true)
    private String email;
	
	@Column(name="salary")
    private Long salary;

    public Employee() {
    	super();        //default constructor
    }

    public Employee(Long employeeId, String employeeName, String email, Long salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.salary = salary;
        
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    
    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public String getEmail() {
        return email;
    }
    
    

    public void setEmail(String email) {
        this.email = email;
    }
    

    public Long getSalary() {   // <-- Make sure this exists
        return salary;
    }

    public void setSalary(Long salary) {  // <-- And this
        this.salary = salary;
    }
}
