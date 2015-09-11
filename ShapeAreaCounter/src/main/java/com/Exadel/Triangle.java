package com.Exadel;

public class Triangle implements Shape {

    private double parameter = 0;
    private double area = 0;

    public Triangle(double i) {
        this.parameter = i;     // Manto paklausti
        area = ((i * i) / 2);
    }

    public void setParameter(double i) {
        i = parameter;
    }

    public void setArea(double i) {
        area = ((i * i) / 2);
    }

    public double getParameter() {
        return parameter;
    }

    public double getArea() {
        return area;
    }

}
