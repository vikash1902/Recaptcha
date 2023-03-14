package com.app.service;

import java.util.Set;

import com.app.model.Employee;

public interface EmployeeService {
	void add(Employee employee);
	
	Set<Employee> employees();
}
