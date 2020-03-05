package com.indra.javapractice.arrays;

import java.util.Arrays;
import java.util.function.Function;

public class ArrayPractice {
    private static final int [] tempArray ;

    static {
        tempArray = new int[]{12, 4, 1, 4, 67, 32, 45, 22, 44, 12, 33,9};
    }

    public static int[] getTempArray() {
        return tempArray;
    }

    public static void main(String[] args) {
        System.out.println("Practicing array");
        Function<Integer,Integer> function = (Integer a)-> a*a;
        System.out.println("function.a = " + function.apply(10));
        int [] practiceArray=Arrays.copyOf(tempArray,tempArray.length);
        float sum =0;
        for (int i = 0; i <practiceArray.length; i++) {
            sum+=practiceArray[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("Number Count = " + practiceArray.length);
        float average = sum/practiceArray.length;
        System.out.println("Average = " + average);
        System.out.println("getSortingArray = " + Arrays.toString(getSortingArray(practiceArray)));

        int [] practiceArray2 = Arrays.copyOf(tempArray,tempArray.length);
        System.out.println("Arrays.toString(practiceArray2) = " + Arrays.toString(practiceArray2));
        System.out.println("Reverse Array Custom method: " +Arrays.toString(gerReverseArray(practiceArray2)));
    }

    private static int[] gerReverseArray(int[] practiceArray2) {
        for (int i = 0; i < practiceArray2.length/2; i++) {
            int temp = practiceArray2[i];
            practiceArray2[i] = practiceArray2[practiceArray2.length-(i+1)];
            practiceArray2[practiceArray2.length-(i+1)] = temp;
        }
        return practiceArray2;
    }

    private static int[] getSortingArray(int[] practiceArray) {
        System.out.println("ArrayPractice.getSortingArray");
        boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < practiceArray.length - 1; i++) {
                int temp =0;
                if(practiceArray[i]>practiceArray[i+1]){
                    temp = practiceArray[i];
                    practiceArray[i]=practiceArray[i+1];
                    practiceArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return practiceArray;
    }

}
