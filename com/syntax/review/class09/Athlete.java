package com.syntax.review.class09;

public class Athlete {

    String name;
    int age;
    int weight;
    String game;

    Athlete(String name, int age, int weight, String game){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.game=game;
        this.gameInfo();

    }

    void gameInfo(){
        String name="Daulet";
        System.out.println(name+" "+this.age+" "+this.weight+" "+this.game);
    }
}
