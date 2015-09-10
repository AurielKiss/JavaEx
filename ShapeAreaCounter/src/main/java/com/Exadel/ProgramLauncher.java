package com.Exadel;

import java.util.Scanner;

public class ProgramLauncher {

    public void run() {

        Scanner inputScanner = new Scanner(System.in);

        introText();

        while (true) {
            System.out.println();
            System.out.println("Enter parameters:");

            String keyboardInput = inputScanner.nextLine();

            System.out.println("Input :" + keyboardInput);

            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = shapeFactory.createShape(keyboardInput);
            shape.shapeTalks();

            System.out.println();
        }
    }

    private void introText() {
        System.out.println();
        System.out.println(">> Welcome to Shape Area Calculator <<");
        System.out.println();
        System.out.println("Please type first letter of SHAPE (C,R,S,T) and area counter input number. Example (R_5.1)");
    }

}
