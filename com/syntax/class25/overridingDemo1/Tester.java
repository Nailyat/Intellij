package com.syntax.class25.overridingDemo1;

import com.syntax.class22.Teacher;

public class Tester {
    public static void main(String[] args) {

        Employee employee=new Employee("Nailya");
        employee.performDailyActivities();
        Student student=new Student("Daulet");
        //Teacher teacher=new Teacher("Talgat");
       //teacher.performDailyActivities();

    }
}
