package hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxIntTest {

    @Test
    void findMaxMinInt01() {
        MinMaxInt minMaxInt = new MinMaxInt();
        assertEquals("Max = 8, Min = 1", minMaxInt.findMaxMinInt(1, 8, 2));
    }
    @Test
    void findMaxMinInt02() {
        MinMaxInt minMaxInt = new MinMaxInt();
        assertEquals("Max = 2, Min = -5", minMaxInt.findMaxMinInt(1, 2, -5));
    }
    @Test
    void findMaxMinInt03() {
        MinMaxInt minMaxInt = new MinMaxInt();
        assertEquals("Max = 10, Min = -5", minMaxInt.findMaxMinInt(10, -2, -5));
    }
}