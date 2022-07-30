package com.softserve.hw07.second;

public class Bus extends GroundVehicle{
   private String route;

    public Bus() {
        route="";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("drive a Bus");
    }
}
