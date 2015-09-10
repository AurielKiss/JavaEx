package com.Exadel;

public class Shapes {

    public int shapeType(String s) {
        if (String.valueOf(s.charAt(0)).equals("T")) {
            triangleAreaCounter(Character.getNumericValue(s.charAt(2)));
            return 0;
        } else if (String.valueOf(s.charAt(0)).equals("S")) {
            squareAreaCounter(Character.getNumericValue(s.charAt(2)));
            return 0;
        } else if (String.valueOf(s.charAt(0)).equals("R")) {
            rectangularAreaCounter(Character.getNumericValue(s.charAt(2)));
            return 0;
        } else if (String.valueOf(s.charAt(0)).equals("C")) {
            circleAreaCounter(Character.getNumericValue(s.charAt(2)));
            return 0;
        } else {
            System.out.println("Wrong letter. Possible letters -> (C,R,S,T). Try again...");
            return 1;
        }
    }

    private void triangleAreaCounter(int a) {
        System.out.println("Triangle area = " + a * a + " units.");
    }

    public void squareAreaCounter(double a) {

        System.out.println("Square area = " + a * a + " units.");
    }

    private void rectangularAreaCounter(double a) {
        System.out.println("Rectangular area = " + a * a + " units.");
    }

    private void circleAreaCounter(double r) {
        System.out.println("Circle area = " + r * r + " units.");
    }

}
