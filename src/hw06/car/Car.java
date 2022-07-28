package hw06.car;

public abstract class Car {
     String model;
     int maxSpeed;
     int yearOfManufacture;
     int yearOfManufactureStop;

    public Car(String model, int maxSpeed, int yearOfManufacture, int yearOfManufactureStop) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.yearOfManufactureStop = yearOfManufactureStop;
    }

    public abstract void run();
    public abstract void stop();
}
