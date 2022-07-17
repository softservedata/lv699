package com.softserve.hw05;

import com.softserve.hw05.dao.MyIn;
import com.softserve.hw05.dao.MyOut;
import com.softserve.hw05.serv.BusLogic;

public class AppThird_task {
    public static void main(String[] args) {
        new BusLogic(new MyIn(), new MyOut()).intNumbers();
    }
    //    3 Enter 5 integer numbers. Find
//    position of second positive number;
//    minimum and its position in the array.
//    Count the product of all entered even numbers.
//  4  Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//    certain model year  (enter year in the console);
//    ordered by the field year.
}
