package com.softserve.dev.edu06;

public class Tappl {
    
//    static {
//        System.out.println("static Block: Tappl Static block");
//    }
    
    public static void main(String[] args) {
        System.out.println("Start");
        Helper.print();
        Helper.setMessage("hello1");
        Helper.print();
        //
        // Not recommended:
        //Helper helper = new Helper();
//        helper.setMessage("new message");
//        helper.print();
        //
//        Helper helper2 = new Helper();
//        helper2.print();
    }

    static {
        System.out.println("static Block: Tappl Static block");
    }
}