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

        return createShapeByType(charScanner, shapeType);
    }

    public Shape createShapeByType(Scanner charScanner, ShapeType shapeType) {

        switch (shapeType) {
            case T:
                if (charScanner.hasNextDouble()) {
                    return new Triangle(charScanner.nextDouble());
                }
            case S:
                if (charScanner.hasNextDouble()) {
                    return new Square(charScanner.nextDouble());
                }
            case C:
                if (charScanner.hasNextDouble()) {
                    return new Circle(charScanner.nextDouble());
                }
            case R:
                if (charScanner.hasNextDouble()) {
                    return new Rectangle(charScanner.nextDouble(), charScanner.nextDouble());
                }
            default:
                throw new IllegalArgumentException("Not supported shape type specified" + shapeType);
        }
    }
}
