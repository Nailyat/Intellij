package com.syntax.class26.Casting;

public class CastingDemo {
    public static void main(String[] args) {

        Object[] objects = {"Hi", 10, 'A'}; //object type array
        executeAll(objects);
    }
static void executeAll(Object[] arr){
    if(arr[0]instanceof String){
        System.out.println("Yes it's a String");
    }
    if(arr[1] instanceof String){
        System.out.println("No, it's not a String");
    }
        }


    }

