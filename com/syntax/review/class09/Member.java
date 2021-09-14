package com.syntax.review.class09;

public class Member {

    String name;
    int age;
    double height;
    double salary;

    void athlete(){
        System.out.println("Every single of the club is athlete");
    }
}
class Player extends Member{
    double speed;

    void run(){
        System.out.println("Players run fast");
    }

}
class Manager extends Member{
    int experience;

    void managingSkills(){
        System.out.println("Manager manages the whole team");
    }
}
class Phisio extends Member{

    void duty(){
        System.out.println("To take care of athletes");
    }
}