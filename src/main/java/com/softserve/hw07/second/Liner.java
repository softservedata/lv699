package com.softserve.hw07.second;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner() {
        floors=0;
    }

    @Override
    void isSailing() {
        System.out.println("sailing a Liner");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
