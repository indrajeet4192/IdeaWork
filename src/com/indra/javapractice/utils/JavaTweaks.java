package com.indra.javapractice.utils;

import java.util.ArrayList;
import java.util.List;

public class JavaTweaks {
    public static void main(String[] args) {
        System.out.println("JavaTweaks.main");
        JavaTweaks javaTweaks = new JavaTweaks();
        System.out.println(javaTweaks.solution(16));
        ;
    }

    public int solution(int N) {
        int oneNumberCounter = 0;
        for (int i = 1; i <= N; i++) {
            oneNumberCounter += getAllOneNumber(i);
        }
        return oneNumberCounter;

    }

    private int getAllOneNumber(int i) {
        int oneNumberCounter = 0;
        List<Integer> allDigits = getArrayofDigits(i);
        for (int k : allDigits) {
            if (k == 1)
                oneNumberCounter++;

        }
        return oneNumberCounter;
    }

    private List<Integer> getArrayofDigits(int n) {
        List<Integer> numberList = new ArrayList<>();
        while (n > 0) {
            numberList.add(n % 10);
            n = n / 10;
        }
        return numberList;
    }

}
