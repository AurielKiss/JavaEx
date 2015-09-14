package com.Exadel;

public class Triangle implements Shape {
    private final double area;
    private final double base;

    public Triangle(double base) {
        this.base = base;
        area = (base * base)/2;
    }

    public double getArea() {
        return area;
    }
}
