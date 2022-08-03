package com.softserve.homework.task7.passengers;

public class Boat extends WaterVehicle{
    private int volume;
    Boat(){
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }
}
