package hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPositionNumberTest {
    int array[] = {2, -2, 4, -2, -1};
    FindPositionNumber answer = new FindPositionNumber();

    @Test
    void findPositionOfSecondPositiveNumber() {
        assertEquals(3,answer.findPositionOfSecondPositiveNumber(array));
    }

    @Test
    void findPositionOfMinimumNumber() {
        assertEquals(5, answer.findPositionOfMinimumNumber(array));
    }

    @Test
    void calcProductOfAllEnteredNumbers() {
        assertEquals(32,answer.calcProductOfAllEnteredNumbers(array));
    }
}