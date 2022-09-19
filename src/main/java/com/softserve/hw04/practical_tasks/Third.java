package com.softserve.hw04.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your country: ");
        String name = br.readLine();
Continent continent=null;
        switch (name.toLowerCase()) {
            case "japan":
                continent = Continent.ASIA;
                System.out.println(continent.returnContinent());
                break;
            case "china":
                continent = Continent.ASIA;
                System.out.println(continent.returnContinent());
                break;
            case "nigeria":
                continent = Continent.AFRICA;
                System.out.println(continent.returnContinent());
                break;
            case "egypt":
                continent = Continent.AFRICA;
                System.out.println(continent.returnContinent());
                break;
            case "algeria":
                continent = Continent.AFRICA;
                System.out.println(continent.returnContinent());
                break;
            case "ukraine":
                continent = Continent.EUROPE;
                System.out.println(continent.returnContinent());
                break;
            case "germany":
                continent = Continent.EUROPE;
                System.out.println(continent.returnContinent());
                break;
            case "spain":
                continent = Continent.EUROPE;
                System.out.println(continent.returnContinent());
                break;
            case "italy":
                continent = Continent.EUROPE;
                System.out.println(continent.returnContinent());
                break;
            case "honduras":
                continent = Continent.NORTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "dominica":
                continent = Continent.NORTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "cayman islands":
                continent = Continent.NORTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "colombia":
                continent = Continent.SOUTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "uruguay":
                continent = Continent.SOUTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "brazil":
                continent = Continent.SOUTH_AMERICA;
                System.out.println(continent.returnContinent());
                break;
            case "new zealand":
                continent = Continent.AUSTRALIA;
                System.out.println(continent.returnContinent());
                break;
            case "guinea":
                continent = Continent.AUSTRALIA;
                System.out.println(continent.returnContinent());
                break;
            case "australia":
                continent = Continent.AUSTRALIA;
                System.out.println(continent.returnContinent());
                break;

            default:
                System.out.println("Wrong!");

    }

    }
}
