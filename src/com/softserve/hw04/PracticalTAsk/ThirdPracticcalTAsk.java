package com.softserve.hw04.PracticalTAsk;

public class ThirdPracticcalTAsk {
    //Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
    public static void main(String[] args) {

        ThirdPT c = null;
        String country = "Ukraine";
        switch (country) {
            case "Poland":
            case "Denmark":
            case "England" :
            case "Estonia":
            case "Finland":
            case "Lithuania":
            case "Ukraine":
            case "Sweden":
                c = ThirdPT.EUROPE;
                break;
            default:
                System.out.println("This country is not in the our list");
        }
        System.out.println("country is: " + country + ". " + c.toString());
    }
}