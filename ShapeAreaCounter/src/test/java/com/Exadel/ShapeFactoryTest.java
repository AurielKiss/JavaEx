package com.Exadel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {

    private ShapeFactory shapeFactory = new ShapeFactory();

    @Test(expected = IllegalArgumentException.class)
    public void testWithEmptyInputShouldThrowIllegalArgumentException() {
        String[] input = {""};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith2EmptyInputsShouldThrowIllegalArgumentException() {
        String[] input = {"", ""};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith3EmptyInputsShouldThrowIllegalArgumentException() {
        String[] input = {"", "", ""};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith4EmptyInputsShouldThrowIllegalArgumentException() {
        String[] input = {"", "", "", ""};
        shapeFactory.createShape(input);
    }
//---------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWrongShapeLetterShouldThrowIllegalArgumentException() {
        String[] input = {"Av"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2WrongShapeLettersShouldThrowIllegalArgumentException() {
        String[] input = {"dA", "b"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3WrongShapeLettersShouldThrowIllegalArgumentException() {
        String[] input = {"As", "b", "Ca"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4WrongShapeLettersShouldThrowIllegalArgumentException() {
        String[] input = {"A", "cb", "Ca", "d"};
        shapeFactory.createShape(input);
    }
//----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWrongShapeInputValueShouldThrowIllegalArgumentException() {
        String[] input = {"55"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2WrongShapeInputsValuesShouldThrowIllegalArgumentException() {
        String[] input = {"12.3", "0"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3WrongShapeInputsValuesShouldThrowIllegalArgumentException() {
        String[] input = {"0", "1.56", "9999"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4WrongShapeInputsValuesShouldThrowIllegalArgumentException() {
        String[] input = {"0.51", "2.1", "0", "300"};
        shapeFactory.createShape(input);
    }
//-----------------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWrongSymbolShouldThrowIllegalArgumentException() {
        String[] input = {"$"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2WrongShapeSymbolsShouldThrowIllegalArgumentException() {
        String[] input = {"%", ";"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3WrongShapeSymbolsShouldThrowIllegalArgumentException() {
        String[] input = {",", "...", "!!"};
        shapeFactory.createShape(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4WrongShapeSymbolsShouldThrowIllegalArgumentException() {
        String[] input = {"!!!", "$$4", "*", "~"};
        shapeFactory.createShape(input);
    }
    //--------------------------------------------------------------------------------------------

    @Test
    public void testLegalInputsShouldReturnSquareObject() {
        String[] input = {"s", "2.1"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Shape is null", shape);
        assertTrue("Expected Square, but got: " + shape.getClass(), shape instanceof Square);
    }

    @Test
    public void testLegalInputsShouldReturnCircleObject() {
        String[] input = {"c", "5.5"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Shape is null", shape);
        assertTrue("Expected Circle, but got: " + shape.getClass(), shape instanceof Circle);
    }

    @Test
    public void testLegalInputsShouldReturnTriangleObject() {
        String[] input = {"T", "20.5"};
        Shape shape = shapeFactory.createShape(input);
        assertNotNull("Shape is null", shape);
        assertTrue("Expected Triangle, but got: " + shape.getClass(), shape instanceof Triangle);
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
