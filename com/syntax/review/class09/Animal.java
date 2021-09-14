package com.syntax.review.class09;

import java.util.concurrent.Callable;

public class Animal {

    String name;
    int teeth=20;

    void hunt(){
        System.out.println("Every animal hunts");
    }
}
class Crocodile extends Animal{
    int teeth=70;

    void kills(){
        System.out.println("Crocodile kills another animal");
    }
    void nature(){
        System.out.println("Crocodile is a cold blooded animal");
    }
    void ptintTeeth(){
        System.out.println(teeth);
        System.out.println(super.teeth);
    }

    public static void main(String[] args) {

        Crocodile crocodile=new Crocodile();
        crocodile.ptintTeeth();
        crocodile.nature();
        crocodile.kills();
        crocodile.hunt();
}}