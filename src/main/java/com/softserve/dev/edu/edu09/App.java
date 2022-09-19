package com.softserve.dev.edu.edu09;

import com.softserve.dev.edu.edu09.dao.In;
import com.softserve.dev.edu.edu09.dao.MyIn;
import com.softserve.dev.edu.edu09.dao.MyOut;
import com.softserve.dev.edu.edu09.serv.BusLogic;

public class App {

    public static void main(String[] args) {
        In myIn = new MyIn();
        new BusLogic(myIn, new MyOut()).addInt();
        new BusLogic(myIn, new MyOut()).addFloat();
        //new BusLogic(myIn, new MyOut()).addInt();
        myIn.close();
    }
}
