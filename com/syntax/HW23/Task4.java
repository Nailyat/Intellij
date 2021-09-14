package com.syntax.HW23;

public class Task4 {

    // Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private void sayHello(){
        System.out.println("Hi");
    }
    private void sayHello(String name){
        System.out.println("Hi "+name);
    }
    private void sayHello(String name, int times){
        for (int i=0; i<times; i++){
            System.out.println("Hi "+name);
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("Nailya", 3);
    }
}
