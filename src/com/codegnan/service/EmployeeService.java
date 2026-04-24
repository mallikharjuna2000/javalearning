package com.codegnan.service;

import java.util.List;

import com.codegnan.beans.Employee;
import com.codegnan.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id) throws EmployeeNotFoundException;

	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

	public void deleteEmployee(int id) throws EmployeeNotFoundException;
}
