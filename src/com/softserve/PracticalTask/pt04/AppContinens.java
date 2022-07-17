package com.softserve.PracticalTask.pt04;


import java.util.Scanner;


public class AppContinens {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your country: ");
        String nameCase = null;
        Continents continent=null;
        nameCase = scan.nextLine();

        switch (nameCase) {
            case "japan":
                continent = Continents.ASIA;
                System.out.println(continent.returnContinents());
                break;
            case "china":
                continent = Continents.ASIA;
                System.out.println(continent.returnContinents());
                break;
            case "nigeria":
                continent = Continents.AFRICA;
                System.out.println(continent.returnContinents());
                break;
            case "egypt":
                continent = Continents.AFRICA;
                System.out.println(continent.returnContinents());
                break;
            case "algeria":
                continent = Continents.AFRICA;
                System.out.println(continent.returnContinents());
                break;
            case "ukraine":
                continent = Continents.EUROPE;
                System.out.println(continent.returnContinents());
                break;
            case "germany":
                continent = Continents.EUROPE;
                System.out.println(continent.returnContinents());
                break;
            case "spain":
                continent = Continents.EUROPE;
                System.out.println(continent.returnContinents());
                break;
            case "italy":
                continent = Continents.EUROPE;
                System.out.println(continent.returnContinents());
                break;
            case "honduras":
                continent = Continents.NORTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "dominica":
                continent = Continents.NORTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "cayman islands":
                continent = Continents.NORTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "colombia":
                continent = Continents.SOUTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "uruguay":
                continent = Continents.SOUTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "brazil":
                continent = Continents.SOUTH_AMERICA;
                System.out.println(continent.returnContinents());
                break;
            case "new zealand":
                continent = Continents.AUSTRALIA;
                System.out.println(continent.returnContinents());
                break;
            case "guinea":
                continent = Continents.AUSTRALIA;
                System.out.println(continent.returnContinents());
                break;
            case "australia":
                continent = Continents.AUSTRALIA;
                System.out.println(continent.returnContinents());
                break;

            default:
                System.out.println("Wrong!");

        }

    }
}

