package com.example.Model;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	public Employee findOneByEmailid(String email);

}
