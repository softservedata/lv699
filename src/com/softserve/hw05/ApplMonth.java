package com.softserve.hw05;

import com.softserve.hw05.dao.MyIn;
import com.softserve.hw05.dao.MyOut;
import com.softserve.hw05.serv.BusLogic;

public class ApplMonth {
    public static void main(String[] args) {
        new BusLogic(new MyIn(), new MyOut()).searchMonth();
    }
//    1 Ask user to enter the number of month. Read the value and write the number of days in this month (create array with amount days of each month).


}
