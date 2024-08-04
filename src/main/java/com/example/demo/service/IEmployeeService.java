package com.example.demo.service;


import com.example.demo.entities.Employee;

public interface IEmployeeService {

	 void AddEmployee(Employee employee);
	 
	 Employee getEmployeeById(long employeeId);
	 
     void updateEmployee(Employee employee);
     
     void deleteEmployee(long employeeId);
}
