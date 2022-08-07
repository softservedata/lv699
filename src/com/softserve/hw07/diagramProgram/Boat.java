package com.softserve.hw07.diagramProgram;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
        volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }
}
