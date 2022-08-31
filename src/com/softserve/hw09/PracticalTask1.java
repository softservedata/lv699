package com.softserve.hw09;

import java.util.*;

public class PracticalTask1 {
    public static void main(String[] args) {
        //Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        do {
            myCollection.add(random.nextInt(30));
        } while (myCollection.size() < 10);
        System.out.println("myCollection = " + myCollection);


        //Find and save in list newCollection all positions of element more than 5 in the collection.
        List<Integer> newCollection = new ArrayList<>();
        for (Integer current : myCollection) {
            if (current >= 5) {
                newCollection.add(current);
            }

        }
        //Print newCollection
        System.out.println("newCollection (>= 5) = " + newCollection);

        // Remove from collection myCollection elements, which are greater then 20. Print result
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current > 20) {
                iterator.remove();
            }
        }
        System.out.println("myCollection after removing all >20 = " + myCollection);
        //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”

        if (myCollection.size() >= 8) {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
        } else if (myCollection.size() >= 5) {
            myCollection.add(2, 1);
            myCollection.add(-3);
            myCollection.add(5, -4);
        } else if (myCollection.size() >= 2) {
            myCollection.add(2, 1);
            myCollection.add(-3);
            myCollection.add(-4);
        } else if (myCollection.size() < 2) {
            myCollection.add(1);
            myCollection.add(-3);
            myCollection.add(-4);
        }
            for (Integer current : myCollection) {
                System.out.println("myCollection index N " + myCollection.indexOf(current) + ". Value = " + current);

            }
            Collections.sort(myCollection);
        System.out.println("myCollection after sorting = " + myCollection);
        }

    }

