package com.softserve.hw04.home_work.dao;

import java.util.Arrays;

public class MyOut implements Out {

    public void print(String... msg) {
        System.out.println(Arrays.toString(msg));
    }
}
