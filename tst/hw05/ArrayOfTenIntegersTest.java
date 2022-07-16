package hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfTenIntegersTest {
    int[] array = {-2, -4, -2, 6, 3, 1, 2, 1, -4, 5};
    ArrayOfTenIntegers answer = new ArrayOfTenIntegers();

    @Test
    void findMax() {
        assertEquals(6, answer.findMax(array));
    }

    @Test
    void calcSum() {
        assertEquals(18,answer.calcSum(array));
    }

    @Test
    void quantityNegativeNumbers() {
        assertEquals(4,answer.quantityNegativeNumbers(array));
    }

    @Test
    void getValuesMoreNegativeOrPositive() {
        assertEquals("positive",answer.getValuesMoreNegativeOrPositive(array));
    }
}