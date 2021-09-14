package com.syntax.HW25;

public class Tester {
    public static void main(String[] args) {

       Computer computer=new Apple("MacBook");
       computer.download();
       computer.antiVirus();
        ((Apple)computer).appPay();

        computer=new Lenovo("ThinkPad");
        computer.download();
        computer.antiVirus();
        ((Lenovo)computer).print();

        computer=new Dell("XPS");
        computer.download();
        computer.antiVirus();
        ((Dell)computer).design();

        computer=new HP("Spectre");
        computer.download();
        computer.antiVirus();
        ((HP)computer).screen();

    }
}
