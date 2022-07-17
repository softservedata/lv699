package com.softserve.hw05.serv;

public class Month {

    public int Number(int arg0) {
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31} ;
int number=0;
    for (int i=0; i<monthDays.length;i++) {
        if (arg0 == i) {
            number = monthDays[i];
        }
    }
        return number;
    }

}
