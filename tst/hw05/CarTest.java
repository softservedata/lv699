package hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    static Car car = new Car();
    static Car[] carArray = {
            new Car(2008, 1.6),
            new Car(2012, 1.4),
            new Car(2009, 2.0),
            new Car(2012, 1.6)
    };
    Car[] carArraySorting = {
            new Car(2008, 1.6),
            new Car(2009, 2.0),
            new Car(2012, 1.4),
            new Car(2012, 1.6)
    };

    @Test
    void findCarByYearOfManufacture() {
        assertEquals("2012 year of production, engine capacity: 1.4\n" +
                "2012 year of production, engine capacity: 1.6\n", car.findCarByYearOfManufacture(2012, carArray));
    }

    @Test
    void findCarByYearOfManufactureError() {
        assertEquals("This 2015 year no production", car.findCarByYearOfManufacture(2015, carArray));
    }

    @Test
    void getSortingYear() {
        car.getSortingYear(carArray);
        for (int i = 0; i < carArray.length; i++) {
            assertEquals(carArraySorting[i].getYearProduction(), carArray[i].getYearProduction());
            assertEquals(carArraySorting[i].getEngineCapacity(), carArray[i].getEngineCapacity());
        }
    }
}