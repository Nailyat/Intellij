package com.syntax.class17;

public class AccessModifierDemoTester {
    public static void main (String [] args){

        AccessModifierDemo AccessModifierDemo=new AccessModifierDemo();

        // System.out.println(AccessModifierDemo.name); can not access because field is private

        System.out.println(AccessModifierDemo.age);
        // can access because it is not private and has
        // access which means can access it inside some

    }
}
