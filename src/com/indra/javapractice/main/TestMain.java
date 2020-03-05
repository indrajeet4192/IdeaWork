package com.indra.javapractice.main;

public class TestMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = a / b;
        System.out.println("c = " + c);
        System.out.println("Idea Practice");
        char[] chararray = "asdasdsads".toCharArray();
        char newchar = 'a';
        System.out.println("Value of a: " + new TestMain().changeValue(10));
    }

    private int changeValue(int number) {
        number = 17;
        return number;
    }
}
