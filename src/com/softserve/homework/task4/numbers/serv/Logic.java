package com.softserve.homework.task4.numbers.serv;

import com.softserve.homework.task4.numbers.dao.In;
import com.softserve.homework.task4.numbers.dao.Out;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Logic {
    private In input;
    private Out output;
    private Numbers numbers;

    public Logic(In input, Out output){
        this.input=input;
        this.output=output;
        numbers=new Numbers();
    }


    public float addFloat() {
        System.out.println("Enter float 3 numbers:");
     float x= input.readFloat();
     float y= input.readFloat();
     float z= input.readFloat();
        //input.close();
       float i= numbers.numbersFloat();
        output.print("float numbers are:"+x+" , "+y+" , "+z+" .");
        return i;
    }

     public int addInt(){
        System.out.println("Enter int 3 numbers:");
        int w= input.readInt();
        int o= input.readInt();
        int p= input.readInt();
       // input.close();
        int f=numbers.numbersInt();
        output.print("int numbers are:"+w+" , "+o+" , "+p+" .");
        int [] array= new int [3];
        array[0]=w;
        array[1]=o;
        array[2]=p;

        Arrays.sort(array);
        System.out.println("min int:"+array[0]);
        System.out.println("max int:"+array[2]);
        return f;
    }


    }
