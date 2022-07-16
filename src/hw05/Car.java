package hw05;

import java.util.Scanner;

public class Car {
    private int yearProduction;
    private double engineCapacity;

    public Car() {
        yearProduction = 0;
        engineCapacity = 0.0;
    }

    public Car(int yearProduction, double engineCapacity) {
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String display() {
        return yearProduction + " year of production, engine capacity: " + engineCapacity + "\n";
    }

    public static void main(String[] args) {
        Car[] carArray = new Car[4];
        carArray[0] = new Car(2008, 1.6);
        carArray[1] = new Car(2012, 1.4);
        carArray[2] = new Car(2009, 2.0);
        carArray[3] = new Car(2012, 1.6);

        Car answer = new Car();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:\n>");
        int year = scan.nextInt();

        System.out.print(answer.findCarByYearOfManufacture(year, carArray));


        answer.getSortingYear(carArray);
        System.out.println("\r\nOrdered by the year: ");
        for (int i = 0; i < carArray.length; i++) {
            System.out.print(carArray[i].display());
        }

    }

    public String findCarByYearOfManufacture(int year, Car[] array) {
        int count = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (year == array[i].getYearProduction()) {
                result += array[i].display();
                count++;
            }
        }
        if (count == 0) {
            result = "This " + year + " year no production\n";
        }
        return result;
    }

    public void getSortingYear(Car[] carArray) {
        int tmpYearProduction;
        double tmpEngineCapacity;
        for (int i = 0; i < carArray.length; i++) {
            for (int j = 0; j < carArray.length; j++) {
                if (carArray[i].getYearProduction() < carArray[j].getYearProduction()) {
                    tmpYearProduction = carArray[i].getYearProduction();
                    carArray[i].setYearProduction(carArray[j].getYearProduction());
                    carArray[j].setYearProduction(tmpYearProduction);
                    tmpEngineCapacity = carArray[i].getEngineCapacity();
                    carArray[i].setEngineCapacity(carArray[j].getEngineCapacity());
                    carArray[j].setEngineCapacity(tmpEngineCapacity);
                }
            }
        }
    }
}
