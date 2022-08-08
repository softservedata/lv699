package com.softserve.homework.task8.exersize2;

public class Add {
    public static void main(String[] args) {
        Wrapper<Integer> num = new Wrapper<>();
        num.set(12345);
        int i = num.get();
        System.out.println("num: "+i);
        //
        Wrapper<String> str = new Wrapper<>();
        str.set("text of String");
        String i1 = str.get();
        System.out.println("str: "+i1);
        //
        Wrapper<Boolean> bool = new Wrapper<>();
        bool.set(true);
        boolean i2 = bool.get();
        System.out.println("bool: "+i2);
    }

}