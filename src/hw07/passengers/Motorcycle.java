package hw07.passengers;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        setMaxSpeed(160);
        System.out.printf("\nThis motorcycle has maximum speed : %s km/h\n", getMaxSpeed());
    }
}
