package com.syntax.class27.GroupTask.Task2;

public class MarksTester {
    public static void main(String[] args) {

        Marks marks=new StudentA(3.7, 4.0, 3.9);
        System.out.println("Average marks percentage of Student A is "+marks.getPercentage());

        Marks marks1=new StudentB(3.8, 3.7, 3.9, 4.0);
        System.out.println("Average marks percentage of Student B is "+marks1.getPercentage());
    }
}
