package com.softserve.homework.task7.passengers;

public class Liner extends WaterVehicle {
    private int floors;
    Liner(){
    }

    @Override
    public void isSailing() {

    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(int floors){
        this.floors=floors;
    }
}
