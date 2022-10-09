package com.softserve.hw10.hw11;

import java.util.Scanner;

public class Task1 {
private double d1,d2 = -1.0;

    public double getD1() {
        return d1;
    }

    public Task1() {
    }

    public double getD2() {
        return d2;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double div(){
        double div = 0;
        try ( Scanner sc = new Scanner(System.in)){
            System.out.println("Input first double number");
            setD1(Double.parseDouble(sc.nextLine()));
            System.out.println("Input second double number");
            setD2(d2 = Double.parseDouble(sc.nextLine()));
                if (getD1()==0.0 | getD2() == 0.0){
                 throw new ArithmeticException(" d1 or d2 = 0.0");
                }

            div = (getD1()/getD2());
            return div;

        } catch (ArithmeticException e1) {
            System.out.println("ArithmeticException:" + e1.getMessage());
            return -1.0;
        } catch (NumberFormatException e2) {
            System.out.println("NumberFormatException:" + e2.getMessage());
            return -2.0;
          }

    }




    public static void main(String[] args) {
        Task1 workObject = new Task1();
        System.out.printf("d1/d2 = %.2f",(workObject.div()));
        System.out.println("");



    }


}
