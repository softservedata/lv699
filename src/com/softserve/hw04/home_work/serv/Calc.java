package com.softserve.hw04.home_work.serv;

public class Calc {

    public int min(int arg0, int arg1, int arg2) {
        int min=arg0;
            if(arg1<min){
                min=arg1;
            }
            if(arg2<min){
                min=arg2;
        }
             return min;
    }
    public int max(int arg0, int arg1, int arg2) {

        int max=arg0;
            if(arg1>max){
                max=arg1;
        }
             if(arg2>max){
                max=arg2;
        }
            return max;
    }

}
