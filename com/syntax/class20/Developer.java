package com.syntax.class20;

public class Developer extends Emploee{

    String programmingLanguage;
    void code(){
        System.out.println("Developer having ID "+empID+"can program in "+programmingLanguage+"");
    }

    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.empID="123";
        developer.age=50;
        developer.programmingLanguage="Java";
        developer.code();
        developer.work();
        developer.sleep();
    }
}
