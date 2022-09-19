package com.softserve.hw05.Task04;

public class Car implements Comparable<Car> {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
        type = "";
        yearOfProduction = 0;
        engineCapacity = 0;
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(int yearOfProduction, int engineCapacity) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void getDisplay() {
        System.out.println("Type of this car is: " + getType() + ". Year of production is: "
                + getYearOfProduction() + ". Engine Capacity is: " + getEngineCapacity());
    }

    @Override
    public int compareTo(Car o) {
        return yearOfProduction - o.yearOfProduction;
    }
}
