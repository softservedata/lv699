package com.softserve.hw09.Task01;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public Set union(Set set1, Set set2){
        Set<Object> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public Set intersect(Set set1, Set set2) {
        Set<Object> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
