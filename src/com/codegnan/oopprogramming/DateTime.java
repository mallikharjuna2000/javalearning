package com.codegnan.oopprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.printf("Formatted Date : %d-%d-%d", dd, mm, yy);
		System.out.println();
		LocalTime time = LocalTime.now();
		System.out.println("CXurrent Timee : " + time);
		// Extract individual components: hours, minutes, seconds, nanoseconds
		int h = time.getHour(); // Hour of the day (0-23)
		int m = time.getMinute(); // Minute of the hour (0-59)
		int s = time.getSecond(); // Second of the minute (0-59)
		int n = time.getNano(); // Nanosecond of the second (0-999,999,999)

		// Print the time components using formatted output
		System.out.printf("%d:%d:%d:%d\n", h, m, s, n);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Date And Timee : " + dt);
		LocalDateTime dt1 = LocalDateTime.of(2000, Month.MAY, 23, 12, 45, 57);
		System.out.println("Our setting dateTime is : " + dt1);
		System.out.println("After 6 months : "+dt1.plusMonths(6));
		System.out.println("bEFORE 6 mONTHS : "+dt1.minusMonths(6));
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println("Default Time Zone: "+zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println(zt);
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(2000, 5, 23);
		Period p=Period.between(birthday, today);
		System.out.printf("My Age is %d years,%dmonths,and%d days%n"
				,p.getYears(),p.getMonths(),p.getDays());
		
	}
}
