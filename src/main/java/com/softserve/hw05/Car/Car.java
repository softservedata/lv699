package com.softserve.hw05.Car;

import java.util.Calendar;

public class Car {
    private static int availableCars = 0;
    private String type;
    private int year;
    private double engine;

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public static int getAvailableCars() {
        return availableCars;
    }

    public static void setAvailableCars(int availableCars) {
        Car.availableCars = availableCars;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car " +
                "type = " + type +
                ", year = " + year +
                ", engine = " + engine;
    }

    public static String yearCheck(int year) {
        String output;
        if (year < 1886) {
            output = "Cars where not invented yet. Please try again.";
            availableCars = -1;
        } else if (year >= Calendar.getInstance().get(Calendar.YEAR)) {
            output = "The year you've entered is yet to come. Please, try again.";
            availableCars = -1;
        } else {
            output = "Checking...";
        }
        return output;
    }

    public String getCarByYear(int year) {
        String output = null;
        if (year > 1885 && year <= Calendar.getInstance().get(Calendar.YEAR)) {
            if (year == getYear()) {
                output = toString();
                availableCars++;
            }
        }
        return output;
    }
}
