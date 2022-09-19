package com.softserve.hw06.practical_tasks.first;

public abstract class Car {
private String model;
private int maxSpeed;
private int yearOfmanufacture;
public Car() {
	
	model = "";
	maxSpeed = 0;
	yearOfmanufacture = 0;
}
public Car(String model, int maxSpeed, int yearOfmanufacture) {
	super();
	this.model = model;
	this.maxSpeed = maxSpeed;
	this.yearOfmanufacture = yearOfmanufacture;
}
abstract void run();
abstract void stop();
@Override
public String toString() {
	return "\nCar [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfmanufacture=" + yearOfmanufacture + "]";
}

}
