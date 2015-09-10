package com.Exadel;

import static java.lang.Character.getNumericValue;

public class ShapeFactory {

    public Shape createShape(String input) {
        if (input == null) {
            return null;
        }
        if (String.valueOf(input.charAt(0)).equalsIgnoreCase("T")) {
            // triangleAreaCounter(Character.getNumericValue(s.charAt(2)));
            return new Triangle();

        } else if (String.valueOf(input.charAt(0)).equalsIgnoreCase("S")) {
            //  squareAreaCounter(Character.getNumericValue(s.charAt(2)));
            return new Square();

        } else if (String.valueOf(input.charAt(0)).equalsIgnoreCase("R")) {
            //  rectangularAreaCounter(Character.getNumericValue(s.charAt(2)));
            return new Rectangular();

        } else if (String.valueOf(input.charAt(0)).equalsIgnoreCase("C")) {
            //   circleAreaCounter(Character.getNumericValue(s.charAt(2)));
            return new Circle();

        } else {
            System.out.println("Wrong letter. Possible letters -> (C,R,S,T). Try again...");
            return null;  //????
        }
    }


//    private void triangleAreaCounter(int a) {
//        System.out.println("Triangle area = " + a * a + " units.");
//    }
//
//    public void squareAreaCounter(double a) {
//
//        System.out.println("Square area = " + a * a + " units.");
//    }
//
//    private void rectangularAreaCounter(double a) {
//        System.out.println("Rectangular area = " + a * a + " units.");
//    }
//
//    private void circleAreaCounter(double r) {
//        System.out.println("Circle area = " + r * r + " units.");
//    }
//
}
