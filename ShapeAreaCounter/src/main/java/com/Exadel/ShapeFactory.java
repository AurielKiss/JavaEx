package com.Exadel;

//1. naudoti ShapeType.valueOf metoda kai turi figuros stringa, kad gauti figuros tipa (naudoti scanneri)
//2. Turint tipa, naudoti ta pati scanneri nuskaityti double reiksmes, kiek ju reikia (pagalvoti kaip pagal tipa panaudoti switch'a)
//3. Mesti IllegalArgumentException jeigu neteisingi argumentai, su paaiskinancia zinute, kodel neteisingi

public class ShapeFactory {

    public Shape createShape(String[] input) {

            if (input.length == 1) {
                System.out.println("Illegal parameters. Try again...");
                throw new CheckedException();
                //return null;
            }

        if (input.length == 2) {
            if ((input[0].equals("")) || (input[1].equals(""))) {
                System.out.println("Empty symbol. Try again...");
                throw new CheckedException();
                //return null;
            }
            if ((input[0].equalsIgnoreCase("T")) && (secondInputCheck(input[1]))) {
                return new Triangle(Double.parseDouble(input[1]));

            } else if ((input[0].equalsIgnoreCase("S")) && (secondInputCheck(input[1]))) {
                return new Square(Double.parseDouble(input[1]));

            } else if ((input[0].equalsIgnoreCase("C")) && (secondInputCheck(input[1]))) {
                return new Circle(Double.parseDouble(input[1]));

            } else if (secondInputCheck(input[1])) {
                System.out.println("Wrong first input (must be a letter) [" + input[0] + "]. Possible letters -> (C,R,S,T). Try again...");
                throw new CheckedException();
                //return null;  //???? -> throw exception
            } else {
                System.out.println("Wrong second input (must be a positive number) not->[" + input[1] + "]. Try again...");
                throw new CheckedException();
                //return null;
            }
        }

        if (input.length == 3) {
            if ((input[0].equalsIgnoreCase("R")) && (secondInputCheck(input[1])) && (secondInputCheck(input[2]))) {
                return new Rectangle(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            }
            System.out.println("Illegal parameters. Try again...");
            throw new CheckedException();
            //return null;
        }

        if (input.length > 3) {
            System.out.println("Too many parameters. Try again...");
            throw new CheckedException();
            //return null;
        }
        throw new CheckedException();
        //return null;
    }

    public boolean secondInputCheck(String input) {
        if (input.matches("(\\d*[.])?\\d+")) {
            //System.out.println("Second symbol must be positive number, not[" + input[1] + "]. Try again...");
            return true;
        } else {
            return false;
        }
    }
}
