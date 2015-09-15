package com.Exadel;

import java.util.Scanner;

public class ShapeFactory {

    public Shape createShape(String input) {

        Scanner charScanner = new Scanner(input);

        String shapeTypeSymbol = charScanner.next();

        ShapeType shapeType = ShapeType.valueOf(shapeTypeSymbol);

        switch (shapeType) {
            case T:
                return new Triangle(Double.parseDouble(charScanner.next()));

            case S:
                return new Square(Double.parseDouble(charScanner.next()));

            case C:
                return new Circle(Double.parseDouble(charScanner.next()));

            case R:
                return new Rectangle(Double.parseDouble(charScanner.next()), Double.parseDouble(charScanner.next()));

            default:
                throw new IllegalArgumentException("Illegal parameters.");
        }
    }
}
