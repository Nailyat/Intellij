package com.syntax.class20;
import com.syntax.class20.Person;

public class EmployeeFromOtherPerson  extends Person{

    String empID; // local variables for this class
    double salary; // local variables for this class
    void work(){
        System.out.println("Emploee "+ empID+" is "+height+" height");
    }
    void getPaid(){
        System.out.println(empID+" is paid "+salary);
    }
}

