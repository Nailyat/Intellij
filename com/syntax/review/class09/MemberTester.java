package com.syntax.review.class09;


public class MemberTester {
    public static void main(String[] args) {

        Player player=new Player();
        player.run();
        player.athlete();

        Manager manager=new Manager();
        manager.name="Talgat";
        manager.managingSkills();
        manager.athlete();

        Phisio phisio=new Phisio();
        phisio.athlete();
        phisio.duty();
    }
}
