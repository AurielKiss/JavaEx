package com.Exadel;

public class Rectangular implements Shape {

    private double parameterA = 0;
    private double parameterB = 0;
    private double area = 0;

    public Rectangular(double i, double j) {
        parameterA = i;
        parameterB = j;
        area = (i * j);
    }

//    public void setParameter(double i, double j) {
//        i = parameterA;
//        j = parameterB;
//    }

    public void setParameter(double i) {
        i = parameterA;
    }

//    public void setArea(double i, double j) {
//        area = (i * j);
//    }

    public void setArea(double i) {
        area = i * i;
    }

    public double getParameter() {
        return parameterA;
    }

    public double getArea() {
        return area;
    }

}

