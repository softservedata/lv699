package com.softserve.HomeWork.hw08.task2;

public class AppWrapper {
    public static void main(String[] args) {
        Wrapper<Integer> o1 = new Wrapper<>(34);
        Wrapper<String>  o2 = new Wrapper<>("Object");
        Wrapper<Boolean> o3 = new Wrapper<>(true);
        System.out.println("object1: "+o1.getValue()+" object2: "+o2.getValue()+" object3: "+o3.getValue());

//        Wrapper<Integer> i = new Wrapper<>(432);
//
//        String s = String.valueOf(i);
//        System.out.println(i.getValue());

    }
}
