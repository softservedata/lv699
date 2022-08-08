package com.softserve.PracticalTask.pt06.task1;

import com.softserve.HomeWork.hw06.task1.*;

public class AppCar {

    public static void main(String[] args) {
        Car[] carArrey = {
                new Truck("Ford", 220, 2008),
                new Sedan("Mazda", 250, 2020),

        };

        System.out.println(carArrey[0].run());
        System.out.println(carArrey[1].run());
        System.out.println(carArrey[0].stop());
        System.out.println(carArrey[1].stop());
    }

}

