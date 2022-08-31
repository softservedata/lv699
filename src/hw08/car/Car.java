package hw08.car;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;     // дані про виробництво
    private double engineCapacity;          // об'єм двигуна
    private String color;
    private int passengerCapacity;          // пасажиромісткість
    private boolean isAirConditioning;      // є Кондиціонер

    private Car() {
    }

    public static CarBuilder getCar() {
        return new Car().new CarBuilder();
    }

    public class CarBuilder {
        private Car car;

        public CarBuilder() {
            car = new Car();
        }

        public CarBuilder(Car _car) {
            this.car = _car;
        }

        public CarBuilder addModel(String _model) {
            car.model = _model;
            return this;
        }

        public CarBuilder addColor(String _color) {
            car.color = _color;
            return this;
        }

        public CarBuilder addDataOfProduction(LocalDate _dataOfProduction) {

            car.dataOfProduction = _dataOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double _engineCapacity) {
            car.engineCapacity = _engineCapacity;
            return this;
        }

        public CarBuilder addPassengerCapacity(int _passengerCapacity) {
            car.passengerCapacity = _passengerCapacity;
            return this;
        }

        public CarBuilder setIsAirConditioning(boolean _isAirConditioning) {
            car.isAirConditioning = _isAirConditioning;
            return this;
        }

        public Car build() {
            return this.car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model= '" + model + '\'' +
                ", dataOfProduction= " + dataOfProduction +
                ", engineCapacity= " + engineCapacity +
                ", color= '" + color + '\'' +
                ", passengerCapacity= " + passengerCapacity +
                ", isAirConditioning= " + ((isAirConditioning) ? "Yes, it has" : "No, it doesn't" ) +
                '}';
    }
}


