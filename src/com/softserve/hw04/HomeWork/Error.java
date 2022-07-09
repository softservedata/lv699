package com.softserve.hw04.HomeWork;


public class Error {
    //read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)*/
    public static void main (String[] args) {

        HTTPError er = HTTPError.ERROR400;
        System.out.println(er.toString());
        System.out.println(er.getDescription());

        for (HTTPError current : HTTPError.values()) {
            System.out.println("Error " + current);
        }

    }


}
