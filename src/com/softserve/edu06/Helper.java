package com.softserve.edu06;

public final class Helper {
    private static String message; // = "Hello";

    static {
        message = "Hello World";
        System.out.println("static Block: First message = " + message);
    }

//    public Helper() {
//        System.out.println("Helper public Helper() Constructor");
//    }

    private Helper() {
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}
