package com.indra.javapractice.arrays;

import java.util.function.Function;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("Practicing array");
        Function<Integer,Integer> function = (Integer a)-> a*a;
        System.out.println("function.a = " + function.apply(10));
    }

}
