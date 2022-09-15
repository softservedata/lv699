package com.softserve.hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        String[] names = {"Ihor", "Stefania", "Petro", "Angela", "Maria", "Mykola", "Olha", "Nina", "Ira"};
        List<String> list1 = new ArrayList<>(Arrays.asList(names));

        System.out.println("List1 = " + list1);

        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf(string -> (string.length() >= 5));

// Other option to solve the task
//        List<String> list2 = list1.stream()
//                .filter(string -> (!string.isEmpty()) && (string.length() < 5))
//                .collect(Collectors.toList());

        System.out.println("List2 = " + list2);
    }
}
