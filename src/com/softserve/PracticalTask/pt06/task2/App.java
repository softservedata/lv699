package com.softserve.PracticalTask.pt06.task2;

public class App {
    public static void main(String[] args) {
        Line[] lineArrey= new Line[2];
        lineArrey[0]=new Line();
        lineArrey[1]=new ColorLine("grey");
        for (int i = 0; i < lineArrey.length; i++) {
            System.out.println(lineArrey[i]);
        }
        System.out.println(lineArrey[0]);
        System.out.println(lineArrey[1]);
        int n= 0;

       while (n< lineArrey.length){
           System.out.println(lineArrey[n]);
           n++;

       }

    }
}
