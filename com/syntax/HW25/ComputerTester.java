package com.syntax.HW25;

public class ComputerTester {
    public static void main(String[] args) {

        Apple apple=new Apple("MacBook");
        Dell dell=new Dell("XPS");
        Computer [] computers={apple, dell, new HP("Srectre"), new Lenovo("ThinkPad")};
        for(int i=0; i<computers.length; i++){
            computers[i].download();
            computers[i].antiVirus();
        }
        // for(Computer computer:computers){  another way for loop
        // computer.download();
        // computer.antiVirus();}
    }
}
