package com.softserve.hw07.second;

public class Boat extends WaterVehicle{
private int volume;

    public Boat() {
        volume=0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        setVolume(20);
        System.out.println("sailing a boat");
    }

}
