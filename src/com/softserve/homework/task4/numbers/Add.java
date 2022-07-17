package com.softserve.homework.task4.numbers;

import com.softserve.homework.task4.numbers.dao.In;
import com.softserve.homework.task4.numbers.dao.Input;
import com.softserve.homework.task4.numbers.dao.Out;
import com.softserve.homework.task4.numbers.dao.Output;
import com.softserve.homework.task4.numbers.serv.Logic;
import com.softserve.homework.task4.numbers.serv.Numbers;

public class Add {
    public static void main(String[] args) {
        In inp =new Input();
        new Logic(inp,new Output()).addFloat();
        new Logic(inp,new Output()).addInt();
        inp.close();
    }
}
