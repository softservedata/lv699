package com.softserve.hw06.practical_tasks.first;

public class Truck extends Car {

	public Truck() {
		super();
	}

	public Truck(String model, int maxSpeed, int yearOfmanufacture) {
		super(model, maxSpeed, yearOfmanufacture);
	}

	@Override
	void run() {
		
		System.out.println("Truck run");
	}

	@Override
	void stop() {
		
		System.out.println("Truck stop");
	}

}
