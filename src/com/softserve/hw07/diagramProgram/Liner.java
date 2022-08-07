package com.softserve.hw07.diagramProgram;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
        floors = 1;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
