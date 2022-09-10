package com.softserve.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        //Enter in the console sentence of five words.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentence of five words");
        String sentence = sc.nextLine();

        String pattern = "\\w+";
        Pattern pCompile =Pattern.compile(pattern);
        Matcher m = pCompile.matcher(sentence);
        String longest = "";
        int numberLetters = 0;
        List<String> sentenceList = new ArrayList<>();
        m.reset(); // Reset Iterator
        //List<String> list = new ArrayList<>();
        while (m.find()) {
			sentenceList.add(sentence.substring(m.start(), m.end()));
        }
//display the longest word in the sentence
        for (String current: sentenceList) {
            if ((current.length())>longest.length()) {
                longest = current;
            }
        }
        System.out.println("The longest word is: " + longest);
        numberLetters = longest.length();

    //determine the number of its letters
    System.out.println("The longest word has " + numberLetters + " letters");


        //bring the second word in reverse order
        String rev = sentenceList.get(1);
        StringBuilder rev1 = new StringBuilder(rev);
        System.out.println(rev1.reverse());
    }

}
