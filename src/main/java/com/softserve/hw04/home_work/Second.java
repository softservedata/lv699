package com.softserve.hw04.home_work;

import com.softserve.hw04.home_work.dao.MyIn;
import com.softserve.hw04.home_work.dao.MyOut;
import com.softserve.hw04.home_work.serv.BusLogic;

public class Second {

    public static void main(String[] args) {
        new BusLogic(new MyIn(), new MyOut()).search();
    }
}
