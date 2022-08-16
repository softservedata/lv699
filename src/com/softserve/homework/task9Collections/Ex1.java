package com.softserve.homework.task9Collections;

import java.util.Set;
import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("first");
        set1.add("second");
        set1.add("third");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("second");
        set2.add("third");
        set2.add("forth");
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
Operations operations=new Operations();
operations.union(set1,set2);
operations.intersect(set1,set2);
    }

public static class Operations {
    public void union(Set set1, Set set2) {
        set1.addAll(set2);
        System.out.println("set1 after add: "+set1);

    }

    public void intersect(Set set1, Set set2) {
        set1.retainAll(set2);
       // set2.retainAll(set1);
        System.out.println("set1 after add and retail : "+set1);

    }
}
}