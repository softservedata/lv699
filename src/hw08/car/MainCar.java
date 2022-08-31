package hw08.car;

import java.time.LocalDate;

public class MainCar {
    public static void main(String[] args) {
        Car car00 = Car.getCar()
                .addModel("Fusion")
                .addColor("black")
                .addDataOfProduction(LocalDate.parse("2011-08-03"))
                .addEngineCapacity(1.4)
                .addPassengerCapacity(5)
                .setIsAirConditioning(true)
                .build();

        Car car01 = Car.getCar()
                .addModel("Astra")
                .addColor("red")
                .addDataOfProduction(LocalDate.parse("2008-10-11"))
                .addEngineCapacity(1.8)
                .addPassengerCapacity(5)
                .setIsAirConditioning(true)
                .build();

        Car car02 = Car.getCar()
                .addModel("Slavuta")
                .addColor("rea")
                .addDataOfProduction(LocalDate.parse("2002-01-22"))
                .addEngineCapacity(1.2)
                .addPassengerCapacity(5)
                .setIsAirConditioning(false)
                .build();
        System.out.printf("%s\n%s\n%s", car00, car01, car02);

    }
}
