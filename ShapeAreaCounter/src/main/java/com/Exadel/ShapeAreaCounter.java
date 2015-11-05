package com.Exadel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ShapeAreaCounter implements CommandLineRunner {
    @Autowired
    private Launcher launcher;

    @Override
    public void run(String... args) {
        launcher.run();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(
                ShapeAreaCounter.class);
        application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        SpringApplication.run(ShapeAreaCounter.class, args);
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
 *        A. Programa turi naudoti Spring.
 *        B. Programa yra WEB (kaip war failas).
 *        C. Programa turi REST servisus + Javascript UI duomenu ivedimui.
 *        d. Programa turi kaupti istorija ivestu figuru ir ju paskaiciuotu plotu (naudoti duomenu baze - MongoDB+Morphia)
 */

/*
//1. naudoti ShapeType.valueOf metoda kai turi figuros stringa, kad gauti figuros tipa (naudoti scanneri)
//2. Turint tipa, naudoti ta pati scanneri nuskaityti double reiksmes, kiek ju reikia (pagalvoti kaip pagal tipa panaudoti switch'A)
//3. Mesti IllegalArgumentException jeigu neteisingi argumentai, su paaiskinancia zinute, kodel neteisingi
 */