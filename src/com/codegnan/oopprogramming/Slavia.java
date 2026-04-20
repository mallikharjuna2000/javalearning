package com.codegnan.oopprogramming;

public class Slavia implements Car {
	@Override
	public void turnDirection(String dir) {
		if (dir.equalsIgnoreCase("left")) {
			System.out.println("Slavia is turning left");
		}
		if (dir.equalsIgnoreCase("Right")) {
			System.out.println("Slavia is turning Right");
		}
	}

	@Override
	public void accelerate(int points) {
		if (points <= 140 && points >= 0) {
			System.out.println("Slavia Speed is : " + points);
		}

	}

	@Override
	public void stop() {
		System.out.println("Slavia has stopped");
	}

	public void sunRoof() {
		System.out.println("Slavia has contained sunroof");
	}
}
