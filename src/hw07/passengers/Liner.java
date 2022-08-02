package hw07.passengers;

public class Liner extends WaterVehicle {
    private int floors;

    @Override
    public void isSailing() {
        setPassengers(200);
        System.out.printf("Now there are %s passengers in the liner\n", getPassengers());
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
