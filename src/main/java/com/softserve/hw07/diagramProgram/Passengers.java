package com.softserve.hw07.diagramProgram;

public abstract class Passengers {
    private int passengers;

    public Passengers () {
        passengers = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
