package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Model.Employee;
import com.example.Model.EmployeeRepo;

public class EmployeeSerivceImpl implements EmployeeService {


	@Autowired
	private EmployeeRepo employeerepo;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = new ArrayList<>();
		Iterable<Employee> emp = employeerepo.findAll();
		for(Employee e : emp)
		{
			employee.add(new Employee(e.getEmailid(),e.getFirstname(),e.getLastname(),e.getPassword(),e.getSalary(),e.getJobrole(),e.getEmployeetype()));
		}
		return employee;
	}
	@Override
	public Employee findOneByEmailid(String email) {
		return employeerepo.findOneByEmailid(email);
	}
	

}
