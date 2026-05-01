package com.codegnan.java8;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplieerExample {

	public static void main(String[] args) {
		Supplier<String> message = () -> "Hello from supplier";
		System.out.println(message.get());
		Supplier<LocalTime> time = () -> LocalTime.now();
		System.out.println(time.get());
	}

}
