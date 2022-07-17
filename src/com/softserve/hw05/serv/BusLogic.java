package com.softserve.hw05.serv;

import com.softserve.hw05.dao.In;
import com.softserve.hw05.dao.Out;

public class BusLogic {
    private Month month;
    private In myin;
    private Out myout;

    public BusLogic(In myin, Out myout) {
        this.myin = myin;
        this.myout = myout;
        month = new Month();
    }

    public void searchMonth() {
        int a = myin.readInt("a");
        myin.close();
            if(a>=1&&a<=12) {
                myout.print("\n Your number is= " + a + "\nThis month has a " + month.Number(a) + " days.");
            }
            else myout.print("Your number is wrong!!!");
    }
}
