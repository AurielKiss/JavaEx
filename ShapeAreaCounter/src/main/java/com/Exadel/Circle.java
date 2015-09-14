package com.Exadel;

public class Circle implements Shape {
    private final double area;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = 3.14 * (radius * radius);
    }

    public double getArea() {
        return area;
    }
}
