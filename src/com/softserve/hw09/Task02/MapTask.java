package com.softserve.hw09.Task02;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // creating a Map<String, String> and adding 10 people into it
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Fedorov", "Ivan");
        personMap.put("Petrov", "Vitaliy");
        personMap.put("Antonova", "Anastasia");
        personMap.put("Bilous", "Maria");
        personMap.put("Batiuk", "Nazar");
        personMap.put("Khomiak", "Orest");
        personMap.put("Danilov", "Anton");
        personMap.put("Kovalska", "Oksana");
        personMap.put("Kazarian", "Mariam");
        personMap.put("Velychko", "Anastasia");

        // printing the map on the screen
        System.out.println("Current personnel: ");
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println("lastName - " + entry.getKey() + "\t firstName - " + entry.getValue());
        }

        // checking for duplicate firstName
        System.out.println("\nChecking for the duplicate first names...");
        Set<String> firstNamesSet = new HashSet<>(personMap.values());
        int number = (personMap.size() - firstNamesSet.size()) * 2;
        if (number != 0) {
            System.out.println("\tThere are at least " + number + " people with the same first name.");
        } else {
            System.out.println("There are no people with the same first name.");
        }

        // removing person with firstName Orest from the Map
        Iterator iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)iterator.next();
            if (entry.getValue().equals("Orest")) {
                String key = entry.getKey();
                String value = entry.getValue();
                iterator.remove();
                System.out.println('\n' + value + " " + key + " was removed.");
            }
        }

        // printing the updated map on the screen
        System.out.println("\nUpdated personnel: ");
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println("lastName - " + entry.getKey() + "\t firstName - " + entry.getValue());
        }
    }
}