package hw07.passengers;

public class Main {
    public static void main(String[] args) {

        Passengers[] passengers = {new Liner(), new Boat(), new Plane(), new Helicopter(),
                new Bus(), new Motorcycle(), new Car()
        };

        for (Passengers current : passengers) {
            if (current instanceof Liner)
                ((Liner) current).isSailing();
            if (current instanceof Boat)
                ((Boat) current).isSailing();
            if (current instanceof Plane) {
                ((Plane) current).fly();
                ((Plane) current).land();
            }
            if (current instanceof Helicopter) {
                ((Helicopter) current).fly();
                ((Helicopter) current).land();
            }
            if (current instanceof Bus)
                ((Bus) current).drive();
            if (current instanceof Motorcycle)
                ((Motorcycle) current).drive();
            if (current instanceof Car)
                ((Car) current).drive();
        }


    }
}
