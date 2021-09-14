package com.syntax.review.class09;

import java.util.concurrent.Callable;

public class Employee {

    String name;
    int age;
    int empID;
    double salary;

    public Employee(String name, int age, int empID, double salary) { // shorthand right click --> generate --> constructor
        this.name = name;
        this.age = age;
        this.empID = empID;
        this.salary = salary;
    }
    public void work(){
        System.out.println("Every employee works");
    }
    public void earn(){
        System.out.println("All employees earn");
    }
}
class Clerk extends Employee{

    Clerk(String name, int age, int empID, double salary){
        super(name, age, empID, salary);
    }
    void adminTask(){
        System.out.println("It works fine");
    }

    public static void main(String[] args) {

        Clerk clerk=new Clerk("Nailya", 35,123,10000);
        clerk.adminTask();
        clerk.work();
        clerk.earn();
        System.out.println(clerk.name);
        System.out.println(clerk.age);
        System.out.println(clerk.empID);
        System.out.println(clerk.salary);
    }
}