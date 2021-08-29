package com.syntax.class17;

public class AccessModifierDemo {

    private String name;
    int age;
    private void method1(){

        System.out.println(name);
        System.out.println(age);
    }
    void method2(){
        System.out.println(name);
        System.out.println(age);
    }
public static void main (String [] args){
   // System.out.println(name); we can not access it because main is a static method

    AccessModifierDemo AccessModifierDemo=new AccessModifierDemo();
    AccessModifierDemo.name="Nailya";
    System.out.println(AccessModifierDemo.name);
    System.out.println(AccessModifierDemo.age);
}


}
