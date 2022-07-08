package com.softserve.hw04.home_work;


//import com.softserve.edu06.Season;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        HTTPError error;
        System.out.println("Enter your error: ");
        int number = sc.nextInt();
        switch (number) {
            case 400:
                error = HTTPError.ERROR400;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 401:
                error = HTTPError.ERROR401;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 402:
                error = HTTPError.ERROR402;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 403:
                error = HTTPError.ERROR403;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 404:
                error = HTTPError.ERROR404;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 405:
                error = HTTPError.ERROR405;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 406:
                error = HTTPError.ERROR406;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 407:
                error = HTTPError.ERROR407;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 408:
                error = HTTPError.ERROR408;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 409:
                error = HTTPError.ERROR409;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 410:
                error = HTTPError.ERROR410;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 411:
                error = HTTPError.ERROR411;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 412:
                error = HTTPError.ERROR412;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 413:
                error = HTTPError.ERROR413;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 414:
                error = HTTPError.ERROR414;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 415:
                error = HTTPError.ERROR415;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 416:
                error = HTTPError.ERROR416;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 417:
                error = HTTPError.ERROR417;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 418:
                error = HTTPError.ERROR418;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 421:
                error = HTTPError.ERROR421;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 422:
                error = HTTPError.ERROR422;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 423:
                error = HTTPError.ERROR423;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 424:
                error = HTTPError.ERROR424;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 425:
                error = HTTPError.ERROR425;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 426:
                error = HTTPError.ERROR426;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 428:
                error = HTTPError.ERROR428;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 429:
                error = HTTPError.ERROR429;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 431:
                error = HTTPError.ERROR431;
                System.out.println("Name of error: "+error.nameError());
                break;
            case 451:
                error = HTTPError.ERROR451;
                System.out.println("Name of error: "+error.nameError());
                break;

            default:
                System.out.println("I didn't heard about this error, sorry. Try again)\n");
                throw new IllegalArgumentException("Error: Invalid Argument");
                // System.exit(0);


        }
    }
}
