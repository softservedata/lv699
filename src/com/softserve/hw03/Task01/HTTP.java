package com.softserve.hw03.Task01;

import java.util.Scanner;

public class HTTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       HTTPError [] errors = HTTPError.values();
       int error = scanner.nextInt();
       scanner.close();

        for (HTTPError httpError:errors) {
            if (error == httpError.getNumber()) {
                System.out.println(httpError.getName());
            }
        }
    }
}
