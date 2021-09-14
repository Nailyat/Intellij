package com.syntax.review.class09;

public class GlassdoorTester {
    public static void main(String[] args) {

        GlassdoorSalary glassdoorSalary=new GlassdoorSalary(123, 9000, 10000, 11000);
        glassdoorSalary.printAveSalary();

        GlassdoorSalary glassdoorSalary1=new GlassdoorSalary(234, 9500, 10700, 12400);
        glassdoorSalary1.printAveSalary();
    }
}
