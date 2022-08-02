package hw07.passengers;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    @Override
    public void fly() {
        weight = 518;
        maxHeight = 1000;
        setPassengers(4);
        System.out.printf("\nThe maximum flight height was %s m. There were %s passengers in the helicopter\n",
                maxHeight, getPassengers());
    }

    @Override
    public void land() {
        System.out.printf("The helicopter landed with a weight of %S\n", weight);
    }
}
