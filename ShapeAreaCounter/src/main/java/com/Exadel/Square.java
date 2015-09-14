package com.Exadel;

public class Square implements Shape {
    private final double area;
    private final double base;

    public Square(double base) {
        this.base = base;
        area = (base * base);
    }

    public double getArea() {
        return area;
    }
}
