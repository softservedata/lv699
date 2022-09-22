package com.softserve.hw09.Task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Mukycey", "Stepan");
        personMap.put("Yakovenchuk", "Stepan");
        personMap.put("Pankiv", "Bohdan");
        personMap.put("Skrypnuk", "Stepan");
        personMap.put("Kucmey", "Taras");
        personMap.put("Sakuluch", "Taras");
        personMap.put("Panko", "Roman");
        personMap.put("Andrysiv", "Bohdan");
        personMap.put("Hensar", "Orest");
        personMap.put("Dyakonu", "Roman");
        System.out.println(personMap);


        Iterator<String> iterator = personMap.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Orest")) {
                iterator.remove();
            }
        }
        System.out.println(personMap);








    }
}
