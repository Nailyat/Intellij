package com.syntax.class20;

public class EmployeeTester {
    public static void main(String[] args) {

        Person person = new Person();
        person.age=35; // no output from employee syso
        person.eat();
        person.sleep();

        Emploee emploee=new Emploee();
        emploee.age=35;
        emploee.salary=100000;
        emploee.empID="Nailya12";

        emploee.work();
        emploee.getPaid();
        emploee.sleep();
        emploee.eat();

    }
}
