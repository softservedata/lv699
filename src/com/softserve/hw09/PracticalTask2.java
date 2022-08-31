package com.softserve.hw09;

import java.util.*;


public class PracticalTask2 {
    public static void main(String[] args) {

        //In the main() method declare map employeeMap of pairs <Integer, String>.
        Map<Integer, String> employeeMap = new HashMap<>();

        //Add to employeeMap seven pairs (ID, name) of some persons.
        employeeMap.put(0, "NullEmployee");
        employeeMap.put(1, "FirstEmployee");
        employeeMap.put(2, "SecondEmployee");
        employeeMap.put(3, "ThirdEmployee");
        employeeMap.put(4, "FourthEmployee");
        employeeMap.put(5, "FifthEmployee");
        employeeMap.put(6, "SixthEmployee");

        //Display the map on the screen.
        System.out.println("Map = " + employeeMap);

        //Ask user to enter ID, then find and write corresponding name from your map.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the ID number [0,6]");
        int id = -2;

        do {
            id = Integer.parseInt(sc.nextLine());
            if (employeeMap.containsKey(id)) {
                System.out.println("ID: " + id + " " + "Name: " + employeeMap.get(id));
                // If you can't find this ID - say about it to user (use function containsKey()).
            } else
                System.out.println("You have input wrong id number, please input id number between range [0,6], please try one more");

        } while (!employeeMap.containsKey(id));

        //Ask user to enter name, verify than you have name in your map and write corresponding ID.
        // If you can't find this ID - say about it to user (use function containsKey()).
        System.out.println("Enter the Name");
        String name = "";


        do {
           name = sc.nextLine();
            if (employeeMap.containsValue(name)) {
                for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                    if (entry.getValue().equals(name)) {
                        System.out.println("Name = " + entry.getValue() + ". ID = " + entry.getKey());
                        break;
                    }
                }
            } else System.out.println("You have entered wrong name, please try again");
        } while (!(employeeMap.containsValue(name)));
        sc.close();
    }
}



