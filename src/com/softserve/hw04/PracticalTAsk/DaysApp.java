package com.softserve.hw04.PracticalTAsk;

public class DaysApp {
    public static void main(String[] args) {
        //Enter the number of the day of the week. Display the name in three languages.
Days d = Days.DAY1;
System.out.println("d.toString() = "+ d);
        System.out.println("d.name() = "+ d.name());
        for (Days current : Days.values()) {
            System.out.println("current = " + current); // current.toString()
        }

    }

}
