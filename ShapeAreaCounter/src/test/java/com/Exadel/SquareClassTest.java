package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SquareClassTest {

    @Test
    public void testCreateSquare() {
        Double input = 2.2;
        Square square = new Square(input);
        assertNotNull("Square is null", square);
    }

    @Test
    public void testSquareMethodGetAreaShouldReturnArea() {
        Double input = 2.0;
        Double output = 4.0;
        Square square = new Square(input);
        assertEquals(0, output.compareTo(square.getArea()));
    }
}