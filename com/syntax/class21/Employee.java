package com.syntax.class21;

public class Employee extends Person{

    Employee(String name, int age, double height, double weight){
        super(name, age, height, weight); //must be the first line, can only be used once
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Nailya", 35, 5.9, 110);
    employee.eat();
    employee.sleep();
        System.out.print(employee.name+" ");
        System.out.print(employee.age+" ");
        System.out.print(employee.height+" ");
        System.out.print(employee.weight+" ");



    }
}
