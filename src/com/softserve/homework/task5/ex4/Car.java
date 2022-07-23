package com.softserve.homework.task5.ex4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Car implements Comparable<Car> {
    private String type;
    private int yearOfProd;
    private double engineCapacity;
    int yearSame = 0;

    public Car(String type) {
        this.type = type;
    }

    public Car(String type, int yearOfProd, double engineCapacity) {
        this.type = type;
        this.yearOfProd = yearOfProd;
        this.engineCapacity = engineCapacity;
    }

    public Car(String type, int yearOfProd) {
        this.type = type;
        this.yearOfProd = yearOfProd;
    }

    public Car() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProd == car.yearOfProd && engineCapacity == car.engineCapacity && type.equals(car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProd, engineCapacity);
    }

    @Override
    public String toString() {
        return "\n Car{" +
                "type='" + type + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
    @Override
    public int compareTo(Car cars) {
        //return type.compareTo(cars.getType());
        return yearOfProd- cars.getYearOfProd();
    }




    public static void main(String[] args) {
        Car[] cars=new Car[4];
        cars[0] = new Car("type1", 1988, 1.9);
        cars[1] = new Car("type2", 1978, 1.2);
        cars[2] = new Car("type3", 2012, 1.3);
        cars[3] = new Car("type4", 2022, 1.8);
        System.out.println("Enter year of car:");
        Scanner scanner = new Scanner(System.in);
        int yearCar = scanner.nextInt();
        scanner.close();
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++)
            if (yearCar==cars[i].getYearOfProd()) {

            } System.out.println("It is a car with a same year:"+yearCar);

    }


}