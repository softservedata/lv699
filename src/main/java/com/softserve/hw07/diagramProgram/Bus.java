package com.softserve.hw07.diagramProgram;

public class Bus extends GroundVehicle{
    private String route;

    public Bus() {
        route = "";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }
}
