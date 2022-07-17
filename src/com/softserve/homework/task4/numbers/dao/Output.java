package com.softserve.homework.task4.numbers.dao;

import java.util.Arrays;

public class Output implements Out{
    public void print(String...msg){
        System.out.println(Arrays.toString(msg));
    }
}
