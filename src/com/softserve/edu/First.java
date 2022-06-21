package com.softserve.edu;

//import com.softserve.edu.String;
//import java.lang.String;

/** This is a sample class which is used to demonstrate the use of multi-line comments.
   This comment does not appear in the java documentation
*/
public class First {
    private int i = 123;

    public First() {
        System.out.println("public A() done");
        //i = 0;
    }

    public First(int i) {
        System.out.println("public A(int i) done");
        this.i = i;
    }

    public void m1() {
        System.out.println("\tfrom m1(), i = " + i);
    }

    /** This is a sample class which is used to demonstrate the use of multi-line comments.
   This comment does not appear in the java documentation
    */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        First f1 = new First(10);
        /* This is a sample class which is used to demonstrate the use of multi-line comments.
           This comment does not appear in the java documentation
        */
        //
        for (int i = 0; i < args.length; i++) {
            System.out.println("i = " + i + "   argument = " + args[i]);
        }
        //
        byte b = 1; // b = (byte) 1
        b = (byte) (b + 1); // by defaulr 1 is int = 4 byte
        System.out.println(" b = " + b);
        //
        float f = 1.1f; // 1.1 is double
        //
        int i = 456;
        //
        First a = new First();
        System.out.println("i = " + i);
        System.out.println("a.i = " + a.i);
        First a1 = new First();
        a.i = 100;
        a1.i = 200;
        System.out.println("a.i = " + a.i);
        System.out.println("a1.i = " + a1.i);
        //
        a.m1();
        a1.m1();
        System.out.print("123456789");
        Thread.sleep(2000);
        System.out.print("\rA\\B\"C");
        //System.out.print("\tABC");
        //
        //com.softserve.edu.String s1 = new String();
        String s1 = new String();
        s1.m1();
        //
        byte b1 = 49;
        System.out.println(" b1 = " + b1 + "   (char) b1 = "+ (char) b1);
    }

}