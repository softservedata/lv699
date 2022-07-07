package hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInRangeTest {

    @Test
    void findTheRangeForZero() {
        NumberInRange numberInRange = new NumberInRange();
        assertEquals( "0.0 belong to the range [-5,5]", numberInRange.findTheRange(0));
    }
    @Test
    void findTheRangeForTen() {
        NumberInRange numberInRange = new NumberInRange();
        assertEquals( "10.0 not belong to the range [-5,5]", numberInRange.findTheRange(10));
    }
}