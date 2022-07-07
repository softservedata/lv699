package hw04;

import java.util.Scanner;

public class NameOfTheContinent {
    public static void main(String[] args) {
        int answerCountry;
        Countries countriesName;

        Scanner scan = new Scanner(System.in);
        System.out.print("#1 UKRAINE" + "\n#2 CHINA" + "\n#3 EGYPT" + "\n#4 USA" + "\n#5 BRAZIL" + "\n#6 AUSTRALIA" +
                "\nEnter number of Country: ");
        answerCountry = scan.nextInt();

        switch (answerCountry) {
            case 1:
                countriesName = Countries.UKRAINE;
                System.out.println(countriesName.getContinents());
                break;
            case 2:
                countriesName = Countries.CHINA;
                System.out.println(countriesName.getContinents());
                break;
            case 3:
                countriesName = Countries.EGYPT;
                System.out.println(countriesName.getContinents());
                break;
            case 4:
                countriesName = Countries.USA;
                System.out.println(countriesName.getContinents());
                break;
            case 5:
                countriesName = Countries.BRAZIL;
                System.out.println(countriesName.getContinents());
                break;
            case 6:
                countriesName = Countries.AUSTRALIA;
                System.out.println(countriesName.getContinents());
                break;
        }
    }

    enum Continents {
        Europe("Europe"), Asia("Asia"), Africa("Africa"), North_America("North America"),
        South_America("South America"), Australia("Australia");

        private final String name;

        Continents(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    enum Countries {
        UKRAINE(Continents.Europe), CHINA(Continents.Asia),
        EGYPT(Continents.Africa), USA(Continents.North_America),
        BRAZIL(Continents.South_America), AUSTRALIA(Continents.Australia);

        private final String continents;

        Countries(Continents continents) {
            this.continents = continents.getName();
        }

        public String getContinents() {
            return continents;
        }
    }
}
