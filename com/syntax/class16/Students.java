package com.syntax.class16;

public class Students {

    static String schoolName = "Syntax";
    static int courseDuration = 6;
    String name;
    String id;
    int age;

    double calculateFee() {
        int var1 = 10;
        int var2 = 20; //local variables
        return var1 * var2 + 100;
    }

    void displayFee() {
        System.out.println(name + " has to pay " + calculateFee());
    }


}
