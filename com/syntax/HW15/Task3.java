package com.syntax.HW15;

public class Task3 {
    public static void main(String[] args) {

        // You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? Do we have Java Class today?";
        System.out.println(a.split("[?]").length); //length w/o ()
    }
}
