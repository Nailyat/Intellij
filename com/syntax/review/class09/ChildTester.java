package com.syntax.review.class09;

public class ChildTester {
    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();
        childClass.play();
        childClass.smile();

        GrandChild grandChild=new GrandChild();
        grandChild.play();
        grandChild.behavior();
        grandChild.smile();
        grandChild.name="Baby";
        grandChild.color="orange";
        grandChild.hobby="Test";
    }
}
