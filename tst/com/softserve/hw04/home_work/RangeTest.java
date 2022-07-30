package com.softserve.hw04.home_work;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void getNumber() {
    }

    @Test
    public void setNumber() {
    }

    @Test
    public void getNumber2() {
    }

    @Test
    public void setNumber2() {
    }

    @Test
    public void getNumber3() {
    }

    @Test
    public void setNumber3() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void belong() {
       // assert.fail("Not yet implemented");
        //int i=0;
       // double i=0;
      //  i=10/i;
       // System.out.println("\t\t\ti= "+i);
        Range range=new Range(2,6,3);
        String actual;
       String expected;
        actual=range.belong();
        expected="\ntrue"+"\nfalse"+"\ntrue";
        Assert.assertEquals(expected,actual);
    }
}