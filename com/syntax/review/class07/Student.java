package com.syntax.review.class07;

public class Student {

    String name;
    String course;
    static String salary;
    static int level=4;

    void session(){
        int lectures=2;
        for(int i=0; i<lectures; i++){
            System.out.println("You can attend the session");
        }
    }

    int studentFee(){
        int fee=1000;
        int tax=240;
        return fee+tax+20;
    }
       void displayTheFees(){
        System.out.println(name+" will pay the overall school fees of "+studentFee());
       }
}
