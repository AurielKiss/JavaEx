package com.Exadel;

import java.lang.*;

public class ShapeAreaCounter {
    public static void main(String[] args) {

        ProgramLauncher launcher = new ProgramLauncher();
        launcher.run();
    }
}

 /*
 *        Uzduotis:
 *        1. Parasyt programa, kuriai galima ivesti figuras: trikampi, staciakampi, trapecija, apskritima.
 *        Ivedimas is konsoles. Pvz.: C 1.5  (ivedamas apskritimas kurio spindulys yra 1.5)
 *        2. Programa turi isvesti ivestos figuros plota iskarto po ivedimo.
 *        3. Programa turi buti istestuota (pageidautina naudoti TDD)
 *        4. Programa turi naudoti Maven.
 *
 *        Papildomos uzduotys (veliau):
 *        a. Programa turi naudoti Spring.
 *        b. Programa yra WEB (kaip war failas).
 *        c. Programa turi REST servisus + Javascript UI duomenu ivedimui.
 *        d. Programa turi kaupti istorija ivestu figuru ir ju paskaiciuotu plotu (naudoti duomenu baze - MongoDB+Morphia)
 */

/*
//1. naudoti ShapeType.valueOf metoda kai turi figuros stringa, kad gauti figuros tipa (naudoti scanneri)
//2. Turint tipa, naudoti ta pati scanneri nuskaityti double reiksmes, kiek ju reikia (pagalvoti kaip pagal tipa panaudoti switch'a)
//3. Mesti IllegalArgumentException jeigu neteisingi argumentai, su paaiskinancia zinute, kodel neteisingi
 */