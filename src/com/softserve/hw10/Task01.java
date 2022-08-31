package com.softserve.hw10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Task01{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the 5 words sentence: ");
        String text = scn.nextLine();

        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(text);

        ArrayList<String> words = new ArrayList<>();

        while (m.find()){
            String word = text.substring(m.start(), m.end());
            words.add(word);
        }

        String longestWord = "";
        String secondLongestWord = "";
        for (String word : words){
            if (word.length() > longestWord.length()){
                secondLongestWord = longestWord;
                longestWord = word;
            }
        }

        System.out.println(String.format("The longest word in your sentence: %s, its length is %d letters.",
                                            longestWord, longestWord.length()));

        System.out.println("Second longest word: " + secondLongestWord);

        String reverse = "";
        for(int i = 0; i < secondLongestWord.length(); i++){
            reverse = secondLongestWord.charAt(i) + reverse;
        }

        System.out.println("Second longest word in reverse: " + reverse);
    }
}
