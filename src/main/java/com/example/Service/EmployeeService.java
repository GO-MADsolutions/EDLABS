package com.example.Service;

import java.util.List;

import com.example.Model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee findOneByEmailid(String email);

}
