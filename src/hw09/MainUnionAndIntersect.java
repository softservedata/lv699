package hw09;

import java.util.HashSet;
import java.util.Set;

public class MainUnionAndIntersect {
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> outSet = new HashSet<>(set1);
        outSet.addAll(set2);
        return outSet;
    }
    public <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> outSet = new HashSet<>(set1);
        outSet.retainAll(set2);
        return outSet;
    }
    public static void main(String[] args) {
        MainUnionAndIntersect obj = new MainUnionAndIntersect();

        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(30);
        set1.add(10);
        set1.add(40);
        Set<Integer> set2 = new HashSet<>();
        set2.add(31);
        set2.add(41);
        set2.add(11);
        set2.add(20);
        System.out.println("Set<Integer> set1: " + set1);
        System.out.println("Set<Integer> set2: " + set2);

        System.out.println("Union of two sets: " + obj.union(set1,set2));
        System.out.println("Intersection of two sets: " + obj.intersect(set1,set2));
    }
}
