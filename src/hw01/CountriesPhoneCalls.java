package hw01;

import java.util.Scanner;

public class CountriesPhoneCalls {
    public static void main(String[] args) {
        CountriesPhoneCalls countriesPhoneCalls = new CountriesPhoneCalls();
        countriesPhoneCalls.costOfCall();
    }

    private int getCons() {
        int time, callPrice, cost;
        String nameCountry;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the country: ");
        nameCountry = scan.nextLine();
        System.out.println("Enter call price in: " + nameCountry);
        callPrice = scan.nextInt();
        System.out.println("Enter time for call in: " + nameCountry);
        time = scan.nextInt();

        cost = time * callPrice;

        System.out.println("Country: " + nameCountry + "," + "\n\rCall price: " + callPrice + "," + "\n\rCall time: " + time + "," + "\n\rCost: " + cost + ";");

        return cost;
    }

    public void costOfCall() {
        int tc1, tc2, tc3;
        int totalCost;

        tc1 = getCons();
        tc2 = getCons();
        tc3 = getCons();

        totalCost = tc1 + tc2 + tc3;

        System.out.println("\n\rTotal cost for all countries: " + totalCost);
    }

}
