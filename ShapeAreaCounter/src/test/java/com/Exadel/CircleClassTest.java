package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CircleClassTest {

    @Test
    public void testCreateCircle() {
        Double input = 2.2;
        Circle circle = new Circle(input);
        assertNotNull("Circle is null", circle);
    }

    @Test
    public void testCircleMethodGetAreaShouldReturnArea() {
        Double input = 2.0;
        Double output = 12.56;
        Circle circle = new Circle(input);
        assertEquals(0, output.compareTo(circle.getArea()));
    }
}