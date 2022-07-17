package com.softserve.hw05.serv;

import com.softserve.hw05.dao.In;
import com.softserve.hw05.dao.Out;

import java.util.Arrays;

public class BusLogic {
    private Month month;
    private Calc number;
    private In myin;
    private Out myout;

    public BusLogic(In myin, Out myout) {
        this.myin = myin;
        this.myout = myout;
        month = new Month();
        number = new Calc();

    }

    public void searchMonth() {
        int a = myin.readInt("a");
        myin.close();
            if(a>=1&&a<=12) {
                myout.print("\n Your number is= " + a + "\nThis month has a " + month.Number(a) + " days.");
            }
            else myout.print("Your number is wrong!!!");
    }
    public void calcMas() {
        int[] numbers = new int[10];
        for(int i=0;i<numbers.length;i++){
            int number = myin.readInt("number");
            numbers[i]=number;
        }
        myout.print(Arrays.toString(numbers));
        myout.print("My answer is: "+number.Number(numbers));
        myin.close();
    }
}
