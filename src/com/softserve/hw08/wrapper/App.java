package com.softserve.hw08.wrapper;

public class App {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(123);
        Wrapper<String> stringWrapper = new Wrapper<>("Wrapper");
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);

        System.out.println(intWrapper.getValue());
        System.out.println(stringWrapper.getValue());
        System.out.println(booleanWrapper.getValue());

    }
}
