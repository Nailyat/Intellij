package com.syntax.HW15;

public class Task2 {
    public static void main(String[] args) {

        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many alpha characters are there in the String.

        // to format the code CTL+ALT+L
        String str = "hdbhFGCG13213@#$%^&*";
        System.out.println(str.replaceAll("[^0-9A-Za-z]","").length());


    }
}
