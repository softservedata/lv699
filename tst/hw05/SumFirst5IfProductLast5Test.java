package hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumFirst5IfProductLast5Test {
    int[] array = {2, -3, -4, 1, 2, 2, 4, 8, 1, 1};
    SumFirst5IfProductLast5 answer = new SumFirst5IfProductLast5();

    @Test
    void getCalcSum() {
        assertEquals(5,answer.getCalcSum(array));
    }

    @Test
    void getCalcProduct() {
        assertEquals(64, answer.getCalcProduct(array));
    }
}