package com.syntax.class17;

public class StaticDemo {

    String name="Nailya";
    static String country ="USA";
    void method1() {
        System.out.println(name);
        System.out.println(country);
    }
    static void method2(){
        //System.out.println(name); name is on instance field and its value can vary from object to object
        // method1(); can not use directly, must create an object first
        StaticDemo staticDemo=new StaticDemo();
        System.out.println(staticDemo.name);
        staticDemo.method1();
        method3();
    }
    static void method3(){
        System.out.println("static method 3");
    }
    }


