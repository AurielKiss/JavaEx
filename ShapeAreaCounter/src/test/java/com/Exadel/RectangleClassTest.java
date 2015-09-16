package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RectangleClassTest {

    @Test
    public void testCreateRectangle() {
        Double input = 2.2;
        Rectangle rectangle = new Rectangle(input, input);
        assertNotNull("Rectangle is null", rectangle);
    }

    @Test
    public void testRectangleMethodGetAreaShouldReturnArea() {
        Double input = 2.0;
        Double output = 4.0;
        Rectangle rectangle = new Rectangle(input, input);
        assertEquals("Rectangle area does not match", output, rectangle.getArea(), 0.001);
    }
}