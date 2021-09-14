package com.syntax.review.class09;

public class GlassdoorSalary {

    int empID;
    double salary1;
    double salary2;
    double salary3;

    GlassdoorSalary(int empID, double salary1, double salary2, double salary3){
        this.empID=empID;
        this.salary1=salary1;
        this.salary2=salary2;
        this.salary3=salary3;
    }

    void printAveSalary(){
        double aveSalary=(salary1+salary2+salary3)/3;
        System.out.println("Average salary of an employee is "+aveSalary);
    }

}
