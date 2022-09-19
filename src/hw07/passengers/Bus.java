package hw07.passengers;

public class Bus extends GroundVehicle {
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        setPassengers(12);
        setRoute("London");
        System.out.printf("\nThere are %s passengers in the bus and the direction of the route %s\n",
                getPassengers(), getRoute());
    }
}
