package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void testMyFirstTDD() {
        Main my = new Main();
        int num = 10;
        int[] oddNumbers = my.myFirstTestedMethod(num);
        int[] oddResult = {1,3,5,7,9};
        assertArrayEquals(oddResult, oddNumbers);
    }

    @Test
    void stringToBoolean() {
        String string = "Hola este es un test";
        Main my = new Main();
        boolean result = my.stringToBoolean(string);
        assertEquals(false,result);

    }
}