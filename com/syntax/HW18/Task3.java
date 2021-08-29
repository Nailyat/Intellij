package com.syntax.HW18;

public class Task3 {
    // Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
    // 1 - inside same class;
    // 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    private Task3(){ // level with access only in classpackages

    }
    Task3(String name){ // level with access between classes

    }
    protected Task3(int age){ // level with access between classes

    }
    public Task3(boolean isRaining){ // level with access between packages

    }

    public static void main(String[] args) {
        Task3 task1=new Task3();
        Task3 task2=new Task3("Nailya");
        Task3 task3=new Task3(35);
        Task3 task4=new Task3(false);
    }
}
