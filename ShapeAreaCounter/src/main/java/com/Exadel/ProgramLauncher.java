package com.Exadel;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProgramLauncher {

    private static final Logger LOG = LogManager
            .getLogger(ProgramLauncher.class);

    public void run() {

        Scanner inputScanner = new Scanner(System.in);

        introText();

        while (true) {

            System.out.println("--------------------");
            System.out.println("Enter parameters:");

            String keyboardInput = inputScanner.nextLine();

            if (keyboardInput.equalsIgnoreCase("EXIT")||keyboardInput.equalsIgnoreCase("CLOSE")) {
                break;
            }

            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = shapeFactory.createShape(keyboardInput);

            LOG.info("Area = " + shape.getArea());
        }
    }

    private void introText() {
        System.out.println();
        System.out.println(">> Welcome to Shape Area Calculator <<");
        System.out.println();
        System.out.println("Please type first letter of SHAPE (C,R,S,T) and input. Example (R 1 2) or (C 6.5).");
    }

}
