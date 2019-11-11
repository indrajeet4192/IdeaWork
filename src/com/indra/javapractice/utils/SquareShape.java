package com.indra.javapractice.utils;

public class SquareShape extends ShapeClass {
    public static final String ShapeName = "SQUARE";
    private int sideLength ;
    public SquareShape(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }


    public String getShapeName() {
        return ShapeName;
    }


    public double calculateArea() {
        return this.sideLength*this.sideLength;
    }
}
