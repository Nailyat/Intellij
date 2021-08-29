package com.syntax.review.class07;

public class MethodDemo4 {
    public static void main (String [] args){

        String test ="Automation jobs are in high demand";
        String[] strArr=test.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        for(String string:strArr){
            System.out.println(string);
        }
        String testOne ="%Automation%jobs%are%in%high%demand";
        String[] strArr2=testOne.split("[%]");
        System.out.println(strArr2.length);





    }
}
