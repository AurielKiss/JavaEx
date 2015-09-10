package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aurelijus
 */
public class ShapeAreaCounterTest {
    private final Shapes shape = new Shapes();

    @Test
    public void testConstructor() {
        assertNotNull(shape);
    }

    @Test
    public void testImputNumbers() {
        String input = "222222";
        assertEquals("Format must be LETTER_NUMBERS", 0, shape.shapeType(input));
    }

    @Test
    public void testImputLetters() {
        String input = "QWERTY";
        assertEquals("Format must be LETTER_NUMBERS", 0, shape.shapeType(input));
    }

    @Test
    public void testImputWrongLetter() {
        String input = "X 1";
        assertEquals("Format must be LETTER_NUMBERS", 0, shape.shapeType(input));
    }

    @Test
    public void testImputLegalInputs() {
        String input = "T 2";
        assertEquals("Format must be LETTER_NUMBERS", 0, shape.shapeType(input));
    }

}