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

    public String add() {
        float a1= 0.0f;
        float   b1= 0.0f;
        float   c1 = 0.0f;
        float a = myin.readFloat(a1);
        float b = myin.readFloat(b1);
        float c = myin.readFloat(c1);

        String result = "";
        myout.print(a + "="+ calc.add(a1) + b + "= " + calc.add(b1)+ c + "= " + calc.add(c1));
        myin.close();
        return result;
    }
}
