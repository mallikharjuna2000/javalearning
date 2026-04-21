package com.codegnan.oopprogramming;

public class Human implements Workable, Eatable, Sleepable {
	private String name;
	private boolean isAwake;
	private boolean isWorking;
	private int energyLevel;

	public Human(String name) {
		super();
		this.name = name;
		this.isAwake = true;
		this.isWorking = false;
		this.energyLevel = 100;
	}

	// workable interface methods
	@Override
	public void work() {
		if (isAwake && energyLevel > 20) {
			isWorking = true;
			energyLevel = -20;
			System.out.println(name + " is working. Energy Level : " + energyLevel);
		} else {
			System.out.println(name + " is too tired to work!");
		}
	}

	@Override
	public void takeBreak() {
		if (isWorking) {
			isWorking = false;
			energyLevel += 10;
			System.out.println(name + " is taking a break. Energy Level : " + energyLevel);
		}

	}

// eatable interface methodss
	@Override
	public void eat() {
		energyLevel += 30;
		if (energyLevel > 100) {
			energyLevel = 100;
			System.out.println(name + " is eating. Energy Level : " + energyLevel);
		}
	}

	@Override
	public void digest() {
		System.out.println(name + " is diagesting food");

	}

	@Override
	public void sleep() {
		isAwake = false;
		isWorking = false;
		energyLevel = 100;
		System.out.println(name + " is Sleeeping Eneregy Restored to " + energyLevel);

	}

	@Override
	public void wakeUp() {
		isAwake = true;
		System.out.println(name + " wake up refreshed");

	}

	public void showStatus() {
		System.out.println("====" + name + "=== status ");
		System.out.println("Awake : " + isAwake);
		System.out.println("Working  : " + isWorking);
		System.out.println("Energy : " + energyLevel);
		System.out.println();
	}

}
