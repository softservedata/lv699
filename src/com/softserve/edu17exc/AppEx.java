package com.softserve.edu17exc;

public class AppEx {

    static double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0) {
            throw new ArithmeticException("parameter < 0");
        }
        return Math.sqrt(x);
    }

    static double foo(double x) {
        double result = 0;
        try {
            result = safeSqrt(x);
        } catch (ArithmeticException e) {
            System.out.println("Error Founded = " + e + "  message = " + e.getMessage());
            result = -1;
        }
        System.out.println("result: " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("safeSqrt(4) = " + safeSqrt(4));
        //System.out.println("safeSqrt(-4) = " + safeSqrt(-4));
        System.out.println("safeSqrt(-4) = " + foo(-4));
    }
}
