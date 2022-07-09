package com.softserve.hw04.HomeWork;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers check = new Numbers();

    @Test
    public void maxNumberTEST() {

        assertEquals("max number = 256.",check.maxNumber(4,96,256));
    }

    @Test
    public void minNumber() {
        assertEquals("min number = 4.",check.minNumber(4,96,256));
    }


}