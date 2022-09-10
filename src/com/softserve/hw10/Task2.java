package com.softserve.hw10;

public class Task2 {
    public static void main(String[] args) {
        //Enter a sentence that contains the words between more than one space.
        String s = "   I am     learning        Java               Core    ";
        //StringBuilder sb = new StringBuilder(s);
        // Convert all spaces, consecutive, one. For example,
        // if we introduce the sentence "I    am      learning     Java   Core»,
        // we have to get the "I'm learning Java Core»
        System.out.println("Before converting: " + s);
        s= s.replaceAll(" +"," ").trim();
        System.out.println("After converting: " + s);


    }
}
