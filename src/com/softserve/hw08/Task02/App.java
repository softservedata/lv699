package com.softserve.hw08.Task02;

public class App {
    public static void main(String[] args) {
        Wrapper<Integer> integerWrapper = new Wrapper<>(6);
        Wrapper<String> stringWrapper = new Wrapper<>("Avrora");
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);

        System.out.println(integerWrapper.getValue());
        System.out.println(stringWrapper.getValue());
        System.out.println(booleanWrapper.getValue());

    }
}
