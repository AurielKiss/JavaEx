package com.Exadel;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProgramLauncher {

    private static final Logger LOG = LogManager
            .getLogger(ProgramLauncher.class);

    public void run() {
        introText();
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            if (keyboardInputReader(inputScanner)) break;
        }
    }

    private boolean keyboardInputReader(Scanner inputScanner) {
        LOG.debug("--------------------");
        LOG.debug("Enter parameters:");

        String keyboardInput = inputScanner.nextLine();

        if (keyboardInput.equalsIgnoreCase("EXIT") || keyboardInput.equalsIgnoreCase("CLOSE")) {
            return true;
        }

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(keyboardInput);

        LOG.debug("Area = " + shape.getArea());
        return false;
    }

    private void introText() {
        System.out.println();
        System.out.println(">> Welcome to Shape Area Calculator <<");
        System.out.println();
        System.out.println("Please type first letter of SHAPE (C,R,S,T) and input. Example (R 1 2.3) or (C 6.5).");
    }

}
