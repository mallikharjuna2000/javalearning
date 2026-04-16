package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DoctorAppointment extends Appointment {
	public void schedule() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Specialization : ");
		String specialization = sc.nextLine();
		System.out.println("Doctor appointment scheduled for " + specialization);
	}
}
