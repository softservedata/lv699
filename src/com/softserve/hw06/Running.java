package com.softserve.hw06;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class Running {
String name;

    public Running(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Eagle e = new Eagle("Eagle");
        Swallow s = new Swallow("Swallow");
        Penguin p = new Penguin("Penguin");
        Chiken c = new Chiken("Chiken");

        String [] arBirds = new String [] { valueOf(e), valueOf(s), valueOf(p), valueOf(c)};

        System.out.println("Eagle fly: " + e.fly());
        System.out.println("Swallow fly: " + s.fly());
        System.out.println("Penquin fly: " + p.fly());
        System.out.println("Chiken fly: " + c.fly());
        System.out.println(Arrays.toString(arBirds));

    }

    }

