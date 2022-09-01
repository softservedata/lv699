package com.softserve.hw09.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {



    public static void main(String[] args) {
        //Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Moroz","Mykyta" );
        personMap.put("Lys", "Anna");
        personMap.put("Wild", "Volodymyr");
        personMap.put("Snow", "Elizabeth");
        personMap.put("Koval", "Orest");
        personMap.put("Park", "John");
        personMap.put("Vstanka", "Valeria");
        personMap.put("Karpovych", "Petro");
        personMap.put("Valigora", "Orest");
        personMap.put("Kovalski", "Damian");

        //Output the entities of the map on the screen.
        // There are at less two persons with the same firstName among these 10 people
        System.out.println("Map Entities: " + personMap);

        // Remove from the map person whose firstName is ”Orest” (or other). Print result.
        Iterator iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)iterator.next();
            if (entry.getValue().equals("Orest")){
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Orest " + entry.getKey() + " is going to be removed");
                iterator.remove();
            }
        }
        System.out.println("Map Entities after removing: " + personMap);
        }

    }