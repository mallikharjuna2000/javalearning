package com.codegnan;

import java.util.Scanner;

public class Car {
	private String model;
	private int year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Car rentalCar=new Car();
		System.out.println("Enter Car Model ");
		String userEnteredModel=scanner.nextLine();
		System.out.println("Enter Car manfacured Year");
		int userEnteredYear=scanner.nextInt();
		rentalCar.setModel(userEnteredModel);
		rentalCar.setYear(userEnteredYear);
		System.out.println("Model : "+rentalCar.getModel());
		System.out.println("Year : "+rentalCar.getYear());
	}
}
