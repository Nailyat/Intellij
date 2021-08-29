package com.syntax.review.class07;

public class AccessModifiers {

    private String emploeeName; // private is only accessible in same class

    String designation;
    protected double salary;
    public String state;


    private void emploeeDetails(){
        System.out.println(emploeeName);
        System.out.println(designation);
        System.out.println(salary);
    }
    void emploeeNameArea(){
        System.out.println(emploeeName);
        System.out.println(designation);
        System.out.println(salary);
    }
    public void anotherMethod(){
        System.out.println("Just a public method");
    }
}
