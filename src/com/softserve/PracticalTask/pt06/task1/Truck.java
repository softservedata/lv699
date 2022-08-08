package com.softserve.PracticalTask.pt06.task1;
import java.lang.String;

public class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String run() {
        return "Truck run "+"Model: "+model+"; maxSpeed: "+maxSpeed+"; yearOfManufacture: "+yearOfManufacture+".";
    }

    @Override
    public String stop() {
        return "Truck stop ";//+"Model: "+model+"; maxSpeed: "+maxSpeed+"; yearOfManufacture: "+yearOfManufacture+".";
    }
}
