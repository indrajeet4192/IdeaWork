package com.indra.javapractice.utils;

public class CircleShape extends ShapeClass {
    public static final String shapeName = "CIRCLE";
    public static final double PI = 3.14;
    private int redius;
    public CircleShape(String color, int redius) {
        super(color);
        this.redius = redius;
    }


    public String getShapeName() {
        return shapeName;
    }


    public double calculateArea() {
        return PI * this.redius*this.redius;
    }


    public String toString() {
        return "CircleShape{" +
                "redius=" + redius +
                '}';
    }
}
