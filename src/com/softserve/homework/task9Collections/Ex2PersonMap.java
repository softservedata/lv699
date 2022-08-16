package com.softserve.homework.task9Collections;

import java.util.*;

public class Ex2PersonMap {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Gromov", "Ivan");
        personMap.put("Ivanov", "Oleg");
        personMap.put("Borys", "BorysBorys");
        personMap.put("Bondarenko", "Dmytro");
        personMap.put("Kovalenko", "Aleksandr");
        personMap.put("Melnyk", "Ivan");
        personMap.put("Kuznecov", "Anatolyi");
        personMap.put("Kozub", "Ivan");
        personMap.put("Shtruk", "Evgen");
        personMap.put("Bulba", "Vasul");
        //__________________________________
        int count = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            count++;
            System.out.println(count + ". " + entry.getKey() + " " + entry.getValue() + ";");
        }
        System.out.println();
        System.out.println("There are " + Collections.frequency(personMap.values(),
                "Ivan") + " persons with the same firstName among these 10 people.");
        //_____________________________
        String key = null;
        String value = "Dmytro";
        for (Map.Entry fn : personMap.entrySet()) {
            if (value.equals(fn.getValue())) {
                key = (String) fn.getKey();
                break;
            }
        }
        //  System.out.println(key+value);
        personMap.remove(key);
        System.out.println();
        System.out.println("New Map persons without Dmytro: ");
        System.out.println(personMap);
    }
}






