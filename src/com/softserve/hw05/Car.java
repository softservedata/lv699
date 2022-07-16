package com.softserve.hw05;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    //Create class Car with fields type, year of production and engine capacity.
    String name;
    String type;
    int year;
    double engineCapacity;
    static int y=0;
    static boolean nocar = true;

        public Car(String name, String type, int year, double engineCapacity) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void modelYearFromConsole() {
        if (getYear() == (y)) {
            nocar = false;
            System.out.println("Your model:" + getName() + " " + getType() + " " + getYear() + " " + getEngineCapacity());
        }

    }
    //Display cars certain model year  (enter year in the console);

        public static void main(String[] args) {
            // Create and initialize four instances of class Car.
            Car audi = new Car("Audi", "Sedan", 2015, 1.6);
            Car mazda = new Car("Mazda", "Sport Car", 2018, 2.0);
            Car kia = new Car("KIA", "Universal", 2013, 1.9);
            Car toyota = new Car("Toyota", "Sport Car", 2021, 2.0);
            Car car = new Car();
            Scanner sc = new Scanner(System.in);
            //Display cars certain model year  (enter year in the console); ordered by the field year.
            System.out.println("Input year ");
            y= sc.nextInt();


           audi.modelYearFromConsole();
            mazda.modelYearFromConsole();
           kia.modelYearFromConsole();
           toyota.modelYearFromConsole();
if (nocar == true) {
        System.out.println("No car from this year");
}
            String arName [] = new String [] {audi.getName(), mazda.getName(), kia.getName(), toyota.getName()};
            String arType [] = new String [] {audi.getType(), mazda.getType(), kia.getType(), toyota.getType()};
            int arYear[] = new int[] {audi.getYear(), mazda.getYear(), kia.getYear(), toyota.getYear()};
            double arCapacity [] = new double [] {audi.getEngineCapacity(), mazda.getEngineCapacity(), kia.getEngineCapacity(), toyota.getEngineCapacity()};

            //ordered by the field year.
            boolean isSorted = true;
            int tmp;
            String tmp1;
            String tmp2;
            double tmp3;
            for (int i=0; i < arYear.length-1; i++) {
                isSorted = true;
                for (int j = 0; j<arYear.length-1-i; j++) {
                    if (arYear[j] > arYear[j+1]) {
                        tmp = arYear[j];
                        arYear[j] = arYear[j+1];
                        arYear[j+1] = tmp;

                        tmp1 = arName[j];
                        arName[j] = arName[j+1];
                        arName[j+1] = tmp1;

                        tmp2 = arType[j];
                        arType[j] = arType[j+1];
                        arType[j+1] = tmp2;

                        tmp3 = arCapacity[j];
                        arCapacity[j] = arCapacity[j+1];
                        arCapacity[j+1] = tmp3;

                        isSorted = false;
                    }
                }
           if (isSorted == true) {
               break;
           }

            }
            System.out.println( "Year\tName\tType\tCapacity");

            for (int i : arYear) {
                System.out.print( i + "\t\t" );

            }
            System.out.println(" ");
            for (String i : arName) {
                System.out.print( i+ "\t\t" );

            }
            System.out.println(" ");
            for (String i : arType) {
                System.out.print(i+ "\t\t");

            }
            System.out.println(" ");
            for (double i : arCapacity) {
                System.out.print( i + "\t\t");

            }
            System.out.println("");

    }

   // 5.  Add Unit Tests to each task, publish code on GitHub



}
