package com.syntax.class27.GroupTask.Task1;

public interface Shape {

    /* Task 1
    Create  an  Interface  'Shape'  with  undefined methods as calculateArea and calculatePerimeter.
    Create  2  classes  Circle  & Square that implements functionality defined in the Shape Interface.
    Test your code.
    */

    void calculateArea(int num);
    void calculatePerimeter(int num);

    }

class Circle implements Shape {
    @Override
    public void calculateArea(int r) {
        System.out.println("The area of circle is "+Math.PI * (r * r));
    }

    @Override
    public void calculatePerimeter(int r) {
        System.out.println("The perimeter of circle is "+(Math.PI * (2*r)) * 2);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(int a) {
        System.out.println("The area of square is "+(a*a));
    }

    @Override
    public void calculatePerimeter(int a) {
        System.out.println("The perimeter of square is "+(a*4));
    }
}
class ShapeTester{
    public static void main(String[] args) {

        Shape shape=new Circle();
        shape.calculateArea(2);
        shape.calculatePerimeter(2);

        Shape shape1=new Square();
        shape1.calculateArea(4);
        shape1.calculatePerimeter(4);

    }
}