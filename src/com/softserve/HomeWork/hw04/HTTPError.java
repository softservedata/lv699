package com.softserve.HomeWork.hw04;

import java.util.Scanner;

public enum HTTPError {
    HTTP401( "HTTP 400 Bad Request" ),
    HTTP403("HTTP 402 Payment Required"),
    HTTP404("HTTP 403 Forbidden "),
    HTTP400("HTTP 400 Bad Request");
    private String name;

    HTTPError() {
        this.name = "";
    }

    HTTPError(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HTTPError " +
                "name " + name + +
                '"';
    }

   /* public void readError() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the error number ");
        String name = sc.nextLine();
        setName("1");
        if (name=="401") {
            System.out.println("77777");
        }

     }

    public void outputError() {
        System.out.println(name);
    }*/
}
