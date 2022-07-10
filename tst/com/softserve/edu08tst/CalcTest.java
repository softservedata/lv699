package com.softserve.edu08tst;
import static org.junit.Assert.*;

import com.softserve.SoftserveExample.edu08tst.Calc;
import org.junit.Test;
public class CalcTest {
    Calc calc = new Calc();

    @Test
    public void testAdd() {
        assertTrue(calc.add(2, 4) == 6);
    }

    @Test
    public void testDivPositive() {
        int actual = 5;
        int expected = calc.div(10, 2);
        assertEquals(actual, expected);
    }

    @Test(expected = Exception.class)
    public void testDivZero() {
        int actual = calc.div(23, 0);
    }

    @Test
    public void testDivPositive2() {
        int actual = 11;
        int expected = calc.div(22, 2);
        assertEquals(actual, expected);
    }
}