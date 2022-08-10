package com.softserve.homework.taskExeptions;

public class Div {
    public double div(double num1, double num2) {

        double div = 0;
        try {
            double i=Double.parseDouble(String.valueOf(num1));
            double i1=Double.parseDouble(String.valueOf(num2));
            div = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("You entered wrong number");
        } catch (NumberFormatException ex) {
            System.out.println("You entered not double number");
        } catch (NullPointerException exa) {
            System.out.println("You entered zero");
        } catch (ClassCastException exap) {
            System.out.println("You entered wrong type of number");
        } catch (Exception exapt) {
            System.out.println("An input error occurred or an invalid number was entered");
        } finally {
        }
        return div;
    }

    public static void main(String[] args) {
        Div div=new Div();
        double result;
        result=div.div(254674678,5);
        System.out.println(result);
    }
}
