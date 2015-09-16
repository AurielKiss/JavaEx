package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TriangleClassTest {

    @Test
    public void testCreateTriangle() {
        Double input = 2.2;
        Triangle triangle = new Triangle(input);
        assertNotNull("Triangle is null", triangle);
    }

    @Test
    public void testTriangleMethodGetAreaShouldReturnArea() {
        Double input = 2.0;
        Double output = 2.0;
        Triangle triangle = new Triangle(input);
        assertEquals(0, output.compareTo(triangle.getArea()));
    }
}