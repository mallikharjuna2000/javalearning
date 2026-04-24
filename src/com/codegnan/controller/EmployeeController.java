package com.codegnan.controller;

import java.util.List;
import java.util.Scanner;

import com.codegnan.beans.Employee;
import com.codegnan.exceptions.EmployeeNotFoundException;
import com.codegnan.service.EmployeeService;
import com.codegnan.service.EmployeeServiceImpl;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("====== Employee Management System==============");
			System.out.println("||===== 1. Add Employee ======================||");
			System.out.println("||===== 2. view All Employee =================||");
			System.out.println("||===== 3. Get Employee By ID=================||");
			System.out.println("||===== 4. Update Employee =================||");
			System.out.println("||===== 5. Delete Employee =================||");
			System.out.println("||===== 6. exit =================||");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Name : ");
				String name = scanner.nextLine();
				System.out.print("Enter Salary : ");
				double salary = scanner.nextDouble();
				service.addEmployee(new Employee(id, name, salary));
				break;
			case 2:
				System.out.println("=== All Employees====");
				List<Employee> employees = service.getAllEmployee();
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;
			case 3:
				System.out.print("Enter Employee Id : ");
				int searchId = scanner.nextInt();
				try {
					Employee emp = service.getEmployeeById(searchId);
					System.out.println("Found : " + emp);
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.print("Enter ID to Update: ");
				int updateId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Name : ");
				String newName = scanner.nextLine();
				System.out.print("Enter Salary : ");
				double newSalary = scanner.nextDouble();
				try {
					Employee updatedemp = service.updateEmployee(new Employee(updateId, newName, newSalary));
					System.out.println("Employee Updated succesfully " + updatedemp);
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.print("Enter ID to Delete: ");
				int deleteId = scanner.nextInt();
				try {
					service.deleteEmployee(deleteId);
					System.out.println("Employee deleted succesfully ");
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Existing program");
				break;
			default:
				System.out.println("Invalid Choice! Try Again");
			}
		} while (choice != 6);
		scanner.close();

	}
}
