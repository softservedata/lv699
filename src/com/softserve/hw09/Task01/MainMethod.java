package com.softserve.hw09.Task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainMethod {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3, 4, 5);
        System.out.println("set1 = " + set1);
        //
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 4, 5, 6, 7, 8);
        System.out.println("set2 = " + set2);
        //
        SetOperations setOp = new SetOperations();

        Set<Integer> unionSet = setOp.union(set1, set2);
        System.out.println("Creating union of set1 and set2...");
        System.out.println("\tunionSet = " + unionSet);

        Set<Integer> intersectionSet = setOp.intersect(set1, set2);
        System.out.println("Establishing intersection of set1 and set2...");
        System.out.println("\tintersectionSet = " + intersectionSet);

    }
}
