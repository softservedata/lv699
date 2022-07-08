package com.softserve.hw04.home_work.serv;

public class Calc {

    public String add(float arg0) {
       String arg0belong="false";
        if(arg0<=5.0f&&arg0>=-5.0f){
            arg0belong="true";
        }
        else arg0belong="false";
        System.out.println(arg0belong);
        return "arg0belong= "+arg0belong;
    }

}
