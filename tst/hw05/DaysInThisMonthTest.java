package hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysInThisMonthTest {
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    DaysInThisMonth answer = new DaysInThisMonth();

    @Test
    void getQuantityDays() {
        assertEquals(31, answer.getQuantityDays(1,monthDays));
    }
}