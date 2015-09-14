package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {
    ShapeFactory shapeFactory = new ShapeFactory();

    @Test(expected = NullPointerException.class)
    public void testWithEmptyInputShouldReturnNull() {
        String[] input = {""};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testWith2EmptyInputsShouldReturnNull2() {
        String[] input = {"", ""};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testWith3EmptyInputsShouldReturnNull() {
        String[] input = {"", "", ""};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testWith4EmptyInputsShouldReturnNull() {
        String[] input = {"", "", "", ""};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }
//---------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testIllegalShapeLetterShouldReturnNull() {
        String[] input = {"Av"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test2IllegalShapeLettersShouldReturnNull() {
        String[] input = {"dA", "b"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test3IllegalShapeLettersShouldReturnNull() {
        String[] input = {"As", "b", "Ca"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test4IllegalShapeLettersShouldReturnNull() {
        String[] input = {"A", "cb", "Ca", "d"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }
//----------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testIllegalShapeInputValueShouldReturnNull() {
        String[] input = {"55"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test2IllegalShapeInputsValuesShouldReturnNull() {
        String[] input = {"12.3", "0"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test3IllegalShapeInputsValuesShouldReturnNull() {
        String[] input = {"0", "1.56", "9999"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test4IllegalShapeInputsValuesShouldReturnNull() {
        String[] input = {"0.51", "2.1", "0", "300"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }
//-----------------------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testIllegalShapeSymbolShouldReturnNull() {
        String[] input = {"$"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test2IllegalShapeSymbolsShouldReturnNull() {
        String[] input = {"%", ";"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test3IllegalShapeSymbolsShouldReturnNull() {
        String[] input = {",", "...", "!!"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }

    @Test(expected = NullPointerException.class)
    public void test4IllegalShapeSymbolsShouldReturnNull() {
        String[] input = {"!!!", "$$4", "*", "~"};
        assertNull("Shape not null", shapeFactory.createShape(input));
    }
    //--------------------------------------------------------------------------------------------

    @Test
    public void testLegalInputsShouldReturnSquareObject() {
        String[] input = {"s", "2.1"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Expected Square, but got: " + shape.getClass(), shape instanceof Rectangle);
    }

    @Test
    public void testLegalInputsShouldReturnCircleObject() {
        String[] input = {"c", "5.5"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Expected Circle, but got: " + shape.getClass(), shape instanceof Rectangle);
    }

    @Test
    public void testLegalInputsShouldReturnTriangleObject() {
        String[] input = {"T", "20.5"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Expected Triangle, but got: " + shape.getClass(), shape instanceof Rectangle);
    }

    @Test
    public void testLegalInputsShouldReturnRectangleObject() {
        String[] input = {"R", "5.5", "3"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Shape is null", shape);
        assertTrue("Expected Rectangle, but got: " + shape.getClass(), shape instanceof Rectangle);
    }
    //----------------------------------------------------------------------------------------------
}
