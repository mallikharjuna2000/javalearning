package com.codegnan.dao;

import java.util.List;

import com.codegnan.beans.Employee;
import com.codegnan.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	public void save(Employee employee);

	public List<Employee> findAll();

	public Employee findById(int id) throws EmployeeNotFoundException;

	public Employee update(Employee employee) throws EmployeeNotFoundException;

	public void deleeteById(int id) throws EmployeeNotFoundException;

}
