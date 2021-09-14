package com.syntax.HW23;

public class CalculateArea {

    // Task 2
    // Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    // Rectangle
    // Square
    // Box
    // Use separate class to test your code

    void calculateArea (double length, double width){
        System.out.println("Area "+(length*width));
    }

    void calculateArea(double length){
        System.out.println("Area "+(length*length));
    }

    void calculateArea(double length, double width, double height){
        System.out.println("Area "+(length*width*height));
    }

    public static void main(String[] args) {
        CalculateArea calculateArea=new CalculateArea();
        calculateArea.calculateArea(10);
        calculateArea.calculateArea(10, 10.2);
        calculateArea.calculateArea(12, 13, 14);
    }
}
