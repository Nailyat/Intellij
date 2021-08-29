package com.syntax.review.class07;

public class MethodDemo3 {
    public static void main(String [] args){

        //regex
        String name="Softw@re Testing is @m@zing";
        System.out.println(name.replaceAll("@","a"));

        String test="nailyaTALGAT1234$#%@*";
        System.out.println(test.replaceAll("[0-9]","*"));
        System.out.println(test.replaceAll("[A-Z]","."));
        System.out.println(test.replaceAll("[a-z]","+"));

        System.out.println(test.replaceAll("[A-Z0-9]",""));
        System.out.println(test.replaceAll("[a-zA-Z0-9]",""));
        System.out.println(test.replaceAll("[^a-zA-Z0-9]",""));



}}
