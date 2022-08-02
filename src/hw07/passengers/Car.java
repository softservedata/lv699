package hw07.passengers;

public class Car extends GroundVehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        setModel("Ford Focus");
        setPassengers(3);
        System.out.printf("\nThere are %s passengers in the %s car\n", getPassengers(), getModel());
    }
}
