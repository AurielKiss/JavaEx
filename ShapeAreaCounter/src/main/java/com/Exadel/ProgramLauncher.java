package com.Exadel;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramLauncher implements Launcher {

    private static final Logger LOG = LogManager
            .getLogger(ProgramLauncher.class);

    @Autowired
    private ShapeFactory shapeFactory;

    public void run() {

        Scanner inputScanner = new Scanner(System.in);

        introText();

        while (true) {

            LOG.info("--------------------");
            LOG.info("Enter parameters:");

            String keyboardInput = inputScanner.nextLine();

            if (keyboardInput.equalsIgnoreCase("EXIT") || keyboardInput.equalsIgnoreCase("CLOSE")) {
                break;
            }


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
