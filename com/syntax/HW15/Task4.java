package com.syntax.HW15;

public class Task4 {
    public static void main(String[] args) {

        // How would you reverse a String word by word?
        String str = "This is a sentence that I want to reverse";
        String [] arr=str.split(" ");
       // System.out.println(arr[0]); this code for revering each word in the sentence
        StringBuilder reversed= new StringBuilder();
        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            reversed.append(stringBuilder.toString()).append(" "); // append is same as + (or concat)
        }
        System.out.println(reversed);
}}
