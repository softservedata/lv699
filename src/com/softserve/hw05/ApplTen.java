package com.softserve.hw05;

import com.softserve.hw05.dao.MyIn;
import com.softserve.hw05.dao.MyOut;
import com.softserve.hw05.serv.BusLogic;

public class ApplTen {
    public static void main(String[] args) {
        new BusLogic(new MyIn(), new MyOut()).calcMas();
    }
    //    2 Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.

}
