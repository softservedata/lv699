package com.softserve.hw06.practical_tasks.first;

import java.util.Arrays;

public class AppCar {
public static void main(String[] args) {
	Car [] cars=new Car[6];
	cars[0]=new Truck("Chevrolet Silverado 2500 HD",130,1997);
	cars[1]=new Sedan("Honda City",180,2008);
	cars[2]=new Truck("Chevrolet Montana",140,2015);
	cars[3]=new Sedan("v90",120,1997);
	cars[4]=new Sedan("v90",120,1997);
	cars[5]=new Truck("Dacia Duster Pick-Up",160,2012);
	System.out.println(Arrays.toString(cars));
}
}
//Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
//Develop classes Truck and Sedan which extend class Car.
//In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it
