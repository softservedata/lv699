package com.softserve.hw04.home_work.serv;

import com.softserve.hw04.home_work.dao.In;
import com.softserve.hw04.home_work.dao.Out;

public class BusLogic {
    private Calc calc;
    private In myin;
    private Out myout;

    public BusLogic(In myin, Out myout) {
        this.myin = myin;
        this.myout = myout;
        calc = new Calc();
    }

    public void search() {
        int a = myin.readInt("a");
        int b = myin.readInt("b");
        int c = myin.readInt("c");
        myin.close();
        myout.print(a + "," + b + ", "+ b + "\n min= " + calc.min(a, b,c)+"\n max= "+ calc.max(a, b,c));
    }
}
