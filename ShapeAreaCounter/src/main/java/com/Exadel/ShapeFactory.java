package com.Exadel;

import static java.lang.Double.*;

public class ShapeFactory {

    public Shape createShape(String[] input) {

        if (input == null) {
            return null;
        }

        if (input[1].matches("\\D*")) {
            System.out.println("Second symbol must be number, not[" + input[1] + "]. Try again...");
            return null;  //???? -> throw exception
        }

        if (input[0].equalsIgnoreCase("T")) {
            return new Triangle(parseDouble(input[1]));

        } else if (input[0].equalsIgnoreCase("S")) {
            return new Square(parseDouble(input[1]));

        } else if (input[0].equalsIgnoreCase("R")) {
            return new Rectangular(parseDouble(input[1]), parseDouble(input[2]));

        } else if (input[0].equalsIgnoreCase("C")) {
            return new Circle(parseDouble(input[1]));

        } else {
            System.out.println("Wrong first letter [" + input[0] + "]. Possible letters -> (C,R,S,T). Try again...");
            return null;  //???? -> throw exception
        }

    }
}
