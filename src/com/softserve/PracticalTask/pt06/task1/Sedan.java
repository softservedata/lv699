package com.softserve.PracticalTask.pt06.task1;
import java.lang.String;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String run() {

        return "Sedan run "+"Model: "+model+"; maxSpeed: "+maxSpeed+"; yearOfManufacture: "+yearOfManufacture+".";
    }

    @Override
    public String stop() {
        return "Sedan stop ";//+"Model: "+model+"; maxSpeed: "+maxSpeed+"; yearOfManufacture: "+yearOfManufacture+".";
    }
}
