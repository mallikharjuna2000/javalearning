package com.codegnan.oopprogramming;

public class Fortuner implements Car {

	@Override
	public void turnDirection(String dir) {
		if (dir.equalsIgnoreCase("left")) {
			System.out.println("Fortuner is turning left");
		}
		if (dir.equalsIgnoreCase("Right")) {
			System.out.println("Fortuner is turning Right");
		}
	}

	@Override
	public void accelerate(int points) {
		if (points <= 140 && points >= 0) {
			System.out.println("Fortuner Speed is : " + points);
		}

	}

	@Override
	public void stop() {
		System.out.println("Fortuneer has stopped");
	}

	public void fourWheel() {
		System.out.println("Fortuner engagged with Four wheel Drive");
	}

}
