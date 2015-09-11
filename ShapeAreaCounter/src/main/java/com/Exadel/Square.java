package com.Exadel;

public class Square implements Shape {

    private double parameter = 0;
    private double area = 0;

    public Square(double i) {
        parameter = i;
        area = ((i * i) / 2);
    }

    public void setParameter(double i) {
        i = parameter;
    }

    public void setArea(double i) {
        area = (i * i);
    }

    public double getParameter() {
        return parameter;
    }

    public double getArea() {
        return area;
    }
}
