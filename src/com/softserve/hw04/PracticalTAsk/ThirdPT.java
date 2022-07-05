package com.softserve.hw04.PracticalTAsk;

public enum ThirdPT {
    ASIA("Asia"),
    AFRICA("Africa"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    ANTARCTICA("Antarctica"),
    EUROPE("Europe"),
    AUSTRALIA ("Australia");

    private String name;


    private ThirdPT(String name) {
        this.name= name;

    }

    @Override
    public String toString() {
        return "The name of continent is: " + name;
    }

}
