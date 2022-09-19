package com.softserve.hw06.practical_tasks.first;

public class Sedan extends Car {

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(String model, int maxSpeed, int yearOfmanufacture) {
		super(model, maxSpeed, yearOfmanufacture);
	}

	@Override
	void run() {
	
		System.out.println("Sedan run");
	}

	@Override
	void stop() {
		
		System.out.println("Sedan stop");
	}

}
