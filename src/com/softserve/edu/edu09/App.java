package com.softserve.edu.edu09;

import com.softserve.edu.edu09.dao.MyIn;
import com.softserve.edu.edu09.dao.MyOut;
import com.softserve.edu.edu09.serv.BusLogic;

public class App {

    public static void main(String[] args) {
        new BusLogic(new MyIn(), new MyOut()).add();
    }
}
