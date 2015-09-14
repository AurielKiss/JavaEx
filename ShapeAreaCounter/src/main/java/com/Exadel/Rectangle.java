package com.Exadel;

public class Rectangle implements Shape {
    private final double area;
    private final double length;
    private final double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
    }

    public double getArea() {
        return area;
    }
}