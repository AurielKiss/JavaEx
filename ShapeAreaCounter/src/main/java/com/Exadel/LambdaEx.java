package com.Exadel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List numberss = Arrays.asList(1, 2, 3, 4, 5, 6);
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(" " + numbers.get(i));
//        }
//
//        System.out.println("\n"+"-------------");
//
//        for (int num : numbers) {
//            System.out.print(" " + num);
//        }
//
//        System.out.println("\n" + "-------------");
//
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.print(" " + integer);
//            }
//        });
//
//        numbers.forEach(x ->
//                System.out.print(" " + x));



        numbers.forEach(System.out::print);
        System.out.println("");
        System.out.println("----------------");
        numbers.forEach(LambdaEx::test);


    }

    public static void test(Integer value){
        System.out.print(" " + value);
    }

}