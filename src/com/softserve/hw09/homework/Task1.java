package com.softserve.hw09.homework;

import java.util.*;

public class Task1 {
//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
// realizing the operations of union and intersection of two sets.
// Test the operation of these techniques on two pre-filled sets.
public static void main(String[] args) {


    Set<Integer> set1 = new HashSet<Integer>();
    set1.add(56);
    set1.add(66);
    set1.add(23);
    set1.add(12);
    set1.add(35);
    set1.add(30);
    System.out.println("Set1: " + set1);

    Set<Integer> set2 = new TreeSet<>();
    set2.add(6);
    set2.add(9);
    set2.add(23);
    set2.add(12);
    set2.add(3);
    set2.add(0);
    System.out.println("Set2: " + set2);

      //  Set <Integer> u = new HashSet<>();
    System.out.println("Union method: " + Task1.union(set1, set2));
    System.out.println("Intersect method: " + Task1.intersect(set1, set2));
    System.out.println("");

    Set<Integer> set3 = new TreeSet<>();
    set3.addAll(set1);
    set3.addAll(set2);

    System.out.println("contains(12): " + set3.contains(12));
    System.out.println("size(): " + set3.size() );
    System.out.println("remove (6): "+ set3.remove(6 ) + ": " + set3);
    System.out.println("hashCode(): " + set3.hashCode());
    System.out.println("isEmpty(): " + set3.isEmpty() );
    System.out.println("retainAll(Set3): " + set3.retainAll(set2));
    System.out.println("Set3: " + set3 );
    System.out.println("");

    Set<String> setAB = new TreeSet<>();
    setAB.add("EFGH");
    setAB.add("ABCD");
    setAB.add("IJKL");
    System.out.println("setAB: " + setAB);
    System.out.println("");

    Set<String> setCD = new TreeSet<>();
    setCD.add("YZ");
    setCD.add("QRST");
    setCD.add("MNOP");
    setCD.add("UVWX");
    System.out.println("setCD: " + setCD);
    System.out.println("");

    System.out.println("setAB + SetCD): " + Task1.union(setAB,setCD));
    System.out.println("intersect: " + Task1.intersect(setAB,setCD));


}
    public static <T> Collection<T> union(Set set1, Set set2) {

        Set <T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Collection<T> intersect(Set set1, Set set2) {

        Set <T> interSect = new HashSet<>(set1);
        interSect.retainAll(set2);

        return interSect;
    }



}
