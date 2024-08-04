package com.example.demo.serviceImpl;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	 private  EmployeeRepository employeeRepository;

	public EmployeeService() {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee getEmployeeById(long employeeId) {
		
//		Employee obj = employeeRepository.findByEmployeeId(employeeId);
		Employee obj = null;

		return obj;
		
	}

	@Override
	public void AddEmployee(Employee employee) {
//		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
//		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(long employeeId) {
//		employeeRepository.deleteById(employeeId);

	}
	
}
