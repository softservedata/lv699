package com.softserve.hw04.Task01;

public enum Month {
    January("January",31 ),
    February ("February",28),
    March ("March",31),
    April ("April",30),
    May ("May",31),
    June ("June",30),
    July ("July",31),
    August ("August",31),
    September ("September",30),
    October ("October",31),
    November ("November",30),
    December ("December",31);

    private String name;
    private int days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    Month(String name, int days) {
       this.name = name;
       this.days = days;
    }
}
