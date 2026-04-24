package com.codegnan.service;

import java.util.List;

import com.codegnan.beans.Employee;
import com.codegnan.dao.EmployeeDao;
import com.codegnan.dao.EmployeeDaoImpl;
import com.codegnan.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
private EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.save(employee);
		System.out.println("Employee Added : "+employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		
		return employeeDao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		
		return employeeDao.update(employee);
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		employeeDao.deleeteById(id);
		
	}

}
