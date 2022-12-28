package com.softserve.hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task13_1 {
    public static void main(String[] args) {


        // 1. There is a list of strings list1.
        // Create a new list list2 that has items from list1 and length less than 5 characters
        // (use method removeIf)
        List<String> list1 = Arrays.asList("asdf", " ", "Tddd", "fffffffy", "hhkytbgy", "Fb", " ", "Sgg", "Sfgy", "Wgggedgy");
        System.out.println(list1);
        List<String> list2 = new ArrayList<String>(list1);

            list2.removeIf(e -> (e.length() > 5));
            System.out.println(list2);
        }

    }

