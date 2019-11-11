package com.indra.javapractice.main;

import com.indra.javapractice.utils.*;

import java.util.Enumeration;
import java.util.Vector;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("I am Indrajeet ");
        for (WeekDays days : WeekDays.values())
            System.out.println("Day : " + days.getDayName() + "Day Number: " + days.getNumber());
        Vector<Integer> vick = new Vector<>();
        for (int i = 0; i < 15; i++)
            vick.add(i);
        System.out.println("Print" + vick);
        displayVector(vick);
        AbstractClassPrac abstractClassPrac = new CircleShape("Red", 4);
        ShapeClass abstractClassPrac3= new CircleShape("Red", 4);
        AbstractClassPrac abstractClassPrac2 = new SquareShape("Blue", 5);
        ShapeClass abstractClassPrac4 = new SquareShape("Blue", 5);
        System.out.println("abstractClassPrac. = " + abstractClassPrac.calculateArea());
        System.out.println("abstractClassPrac2. = " + abstractClassPrac2.calculateArea());
        System.out.println("abstractClassPrac3. = " + abstractClassPrac3.getShapeName());
        System.out.println("abstractClassPrac4. = " + abstractClassPrac4.getShapeName());
    }

    private static void displayVector(Vector<Integer> vick) {
        Enumeration enumeration = vick.elements();
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}