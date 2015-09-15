package com.Exadel;

public class ShapeFactory {

    public Shape createShape(String[] input) {

        if (input.length == 1) {
            throw new IllegalArgumentException("Illegal parameters. Try again...");
        }

        if (input.length == 2) {
            if ((input[0].equals("")) || (input[1].equals(""))) {
                throw new IllegalArgumentException("Empty symbol. Try again...");
            }
            if ((input[0].equalsIgnoreCase("T")) && (secondInputCheck(input[1]))) {
                return new Triangle(Double.parseDouble(input[1]));

            } else if ((input[0].equalsIgnoreCase("S")) && (secondInputCheck(input[1]))) {
                return new Square(Double.parseDouble(input[1]));

            } else if ((input[0].equalsIgnoreCase("C")) && (secondInputCheck(input[1]))) {
                return new Circle(Double.parseDouble(input[1]));

            } else if (secondInputCheck(input[1])) {
                throw new IllegalArgumentException("Must be letter. Possible letters -> (C,R,S,T)");

            } else {
                throw new IllegalArgumentException("Wrong second input (must be a positive number)");
            }
        }

        if (input.length == 3) {
            if ((input[0].equalsIgnoreCase("R")) && (secondInputCheck(input[1])) && (secondInputCheck(input[2]))) {
                return new Rectangle(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            }

            throw new IllegalArgumentException("Illegal parameters. Try again...");
        }

        if (input.length > 3) {
            throw new IllegalArgumentException("Too many parameters. Try again...");
        }

        throw new IllegalArgumentException("error");
    }

    public boolean secondInputCheck(String input) {
        if (input.matches("(\\d*[.])?\\d+")) {
            return true;
        } else {
            return false;
        }
    }
}
