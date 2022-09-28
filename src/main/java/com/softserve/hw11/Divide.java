package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {

    public static double div(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number a: ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("Enter number b: ");
            double b = Double.parseDouble(br.readLine());
            if (b == 0 || b == -0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (NumberFormatException | IOException e) {
            System.out.println("Invalid input. Please try again.");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("Warning, you cannot divide by zero.");
            return -2;
        } catch (Exception e) {
            System.out.println("Something went wrong, please try again later.");
            return -3;
        }
    }

    public static void main(String[] args) {
            System.out.println("div = " + div());
    }
}
