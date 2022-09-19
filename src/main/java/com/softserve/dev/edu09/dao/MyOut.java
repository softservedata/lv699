package com.softserve.dev.edu09.dao;

import java.util.Arrays;

public class MyOut implements Out {

    public void print(String... msg) {
        System.out.println(Arrays.toString(msg));
    }
}
