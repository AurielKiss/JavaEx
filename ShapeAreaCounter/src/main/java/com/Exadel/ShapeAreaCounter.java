package com.Exadel;

import java.util.Scanner;
import java.lang.*;

public class ShapeAreaCounter {
    public static void main(String[] args) {
        ShapeAreaCounter counter = new ShapeAreaCounter();
        counter.run();
    }

    public void run() {

        Scanner inputScanner = new Scanner(System.in);

        introText();

        while (true) {
            System.out.println();
            System.out.println("Enter parameters:");
            String keyboardInput = inputScanner.nextLine();

            System.out.println("Input :" + keyboardInput);

            Shapes shape = new Shapes();
            shape.shapeType(keyboardInput);
        }
    }

    private void introText() {
        System.out.println();
        System.out.println(">> Welcome to Shape Area Calculator <<");
        System.out.println();
        System.out.println("Please type first letter of SHAPE (C,R,S,T) and area counter input number. Example (R_5.1)");
    }

}

/*
Uzduotis:
        1. Parasyt programa, kuriai galima ivesti figuras: trikampi, staciakampi, trapecija, apskritima.
        Ivedimas is konsoles. Pvz.: C 1.5  (ivedamas apskritimas kurio spindulys yra 1.5)
        2. Programa turi isvesti ivestos figuros plota iskarto po ivedimo.
        3. Programa turi buti istestuota (pageidautina naudoti TDD)
        4. Programa turi naudoti Maven.

        Papildomos uzduotys (veliau):
        a. Programa turi naudoti Spring.
        b. Programa yra WEB (kaip war failas).
        c. Programa turi REST servisus + Javascript UI duomenu ivedimui.
        d. Programa turi kaupti istorija ivestu figuru ir ju paskaiciuotu plotu (naudoti duomenu baze - MongoDB+Morphia)
        */