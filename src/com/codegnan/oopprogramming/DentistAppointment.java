package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DentistAppointment extends Appointment {
	public void schedule() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dental Procedure : ");
		String procedure = sc.nextLine();
		System.out.println("Dentist appointment scheduled for " + procedure);
	}
}
