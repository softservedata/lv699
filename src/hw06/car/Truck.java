package hw06.car;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture, int yearOfManufactureStop) {
        super(model, maxSpeed, yearOfManufacture, yearOfManufactureStop);
    }

    @Override
    public void run() {
        System.out.println("\nTruck model " + model + " of " + yearOfManufacture +
                " manufacture year runs with max speed: " + maxSpeed);
    }

    @Override
    public void stop() {
        System.out.println("Truck model " + model + " of " + yearOfManufactureStop + " manufacture year is stopped");
    }
}
