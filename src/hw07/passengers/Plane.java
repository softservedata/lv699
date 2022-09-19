package hw07.passengers;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    @Override
    public void fly() {
        setMaxDistance(7700);

        System.out.printf("\nThe maximum range of a private jet is %s nautical miles\n", getMaxDistance());
    }

    @Override
    public void land() {
        System.out.printf("A private flight with %s passengers has arrived\n", getPassengers());
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
