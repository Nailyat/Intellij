package com.syntax.class27.InterfaceDemo1;

public class Tester {
    public static void main(String[] args) {

        Toyota toyota=new Toyota();
        toyota.sell();

        SellAble sellAble=new Toyota();
        sellAble.sell();

        AnotherInterface anotherInterface=new Toyota();
        anotherInterface.sell();
    }
}
