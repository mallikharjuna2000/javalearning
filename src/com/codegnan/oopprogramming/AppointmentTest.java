package com.codegnan.oopprogramming;

public class AppointmentTest {
	public static void main(String[] args) {
		Appointment genericAppointment = new Appointment();
		genericAppointment.schedule();
		genericAppointment = new DoctorAppointment();
		genericAppointment.schedule();
		genericAppointment = new DentistAppointment();
		genericAppointment.schedule();
	}
}
