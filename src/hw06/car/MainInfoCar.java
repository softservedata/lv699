package hw06.car;

public class MainInfoCar {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Ford Focus", 160, 2011, 2015),
                new Sedan("Toyota Camry", 180, 2014, 2016),
                new Truck("Opel Bedford Blitz", 150, 1985, 1990),
                new Truck("Volkswagen Constellation", 130, 2005, 2010)
        };

        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
            cars[i].stop();
        }
    }
}
