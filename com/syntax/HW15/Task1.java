package com.syntax.HW15;

public class Task1 {
    public static void main(String[] args) {

        // Create a String that will hold a sentence.
        // Write a program to get a new String without any spaces.

        String str="This is a sentence with spaces.";
                System.out.println(str.replace("", "")); //remove the spsces from the sentence
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("\\s",""));

    }
}
