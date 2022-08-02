package com.softserve.hw08.task2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
       List<Wrapper> obj = new ArrayList<>();

       obj.add(new Wrapper<Integer>(1));
       obj.add(new Wrapper<String>("Second"));
       obj.add(new Wrapper<Boolean>(true));

        for (Wrapper current : obj) {
            System.out.println("Wrapper Value: " + current.getValue());
        }

    }
}
