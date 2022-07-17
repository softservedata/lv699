package com.softserve.PracticalTask.pt04;

import java.io.BufferedReader;

public enum Continents {
    ASIA("china","japan"){
        public Continents returnContinents(){ return ASIA;}
    },
    AFRICA("nigeria","egypt","algeria"){
        public Continents returnContinents(){ return AFRICA;}
    },
    EUROPE("ukraine","germany","spain","italy"){
        public Continents returnContinents(){ return EUROPE;}
    },
    NORTH_AMERICA("honduras", "dominica", "cayman islands"){
        public Continents returnContinents(){ return NORTH_AMERICA;}
    },
    SOUTH_AMERICA("colombia", "uruguay", "brazil"){
        public Continents returnContinents(){ return SOUTH_AMERICA;}
    },
    AUSTRALIA("new zealand", "guinea", "australia") {
        public Continents returnContinents(){ return AUSTRALIA;}
    };

    private String name;

    Continents(String...name) {
    }

    public abstract Continents returnContinents();


}