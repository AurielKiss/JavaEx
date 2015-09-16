package com.Exadel;

import java.util.Locale;
import java.util.Scanner;

public class ShapeFactory {

    public Shape createShape(String input) {

        Scanner charScanner = new Scanner(input);
        charScanner.useLocale(Locale.ENGLISH);

        if (!charScanner.hasNext()) {
            throw new IllegalArgumentException("Empty parameters.");
        }

        String shapeTypeSymbol = charScanner.next();

        ShapeType shapeType = ShapeType.valueOf(shapeTypeSymbol);

        return chooseShapeType(charScanner, shapeType);
    }

    public Shape chooseShapeType(Scanner charScanner, ShapeType shapeType) {
        switch (shapeType) {
            case T:
                return new Triangle(charScanner.nextDouble());

            case S:
                return new Square(charScanner.nextDouble());

            case C:
                return new Circle(charScanner.nextDouble());

            case R:
                return new Rectangle(charScanner.nextDouble(), charScanner.nextDouble());

            default:
                throw new IllegalArgumentException("Illegal parameters.");
        }
    }
}
