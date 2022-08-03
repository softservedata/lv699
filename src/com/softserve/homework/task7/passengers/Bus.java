package com.softserve.homework.task7.passengers;

public class Bus extends GroundVehicle{
    private String rout;
    Bus(){}

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    @Override
    public void drive() {

    }
}
