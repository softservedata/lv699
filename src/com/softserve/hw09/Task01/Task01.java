package com.softserve.hw09.Task01;

import java.util.HashSet;
import java.util.Set;

public class Task01 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        union(set1,set2);
        intersect(set1,set2);
    }

    public static void union(Set set1, Set set2) {
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        System.out.println(setUnion);
    }

    public static void intersect(Set set1, Set set2) {
        Set<Integer> setIntersect = new HashSet<>(set1);
        setIntersect.retainAll(set2);
        System.out.println(setIntersect);
    }
}
