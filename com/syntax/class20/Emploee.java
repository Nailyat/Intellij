package com.syntax.class20;

public class Emploee extends Person{
    String empID; // local variables for this class
    double salary; // local variables for this class
    void work(){
        System.out.println("Emploee "+ empID+" is "+age+" years old");
    }
    void getPaid(){
        System.out.println(empID+" is paid "+salary);
    }
}

