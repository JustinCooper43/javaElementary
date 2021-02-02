package com.streltsov.javaElementary.course.homeworks.hw4;

public class Main {

    public static void main(String[] args) {

        Team lordOfTheRing = new Team("The Fellowship of the Ring", "Rivendell");

        Wizard gandalf = new Wizard("Gandalf", 100, 50, "You shall not pass");
        Archer legolas = new Archer("Legolas", 146, 139,"Immortality" );
        Knight aragorn = new Knight("Aragorn", 150, 100,"Just a good fella");

        lordOfTheRing.listOfTeam[0] = gandalf;
        lordOfTheRing.listOfTeam[1] = legolas;
        lordOfTheRing.listOfTeam[2] = aragorn;

        System.out.println(gandalf.toString());

        gandalf.summonEagle("Jone", "Black");
        gandalf.fireBall();
        gandalf.eagle.battleRoar();

        System.out.println(legolas.toString());
        legolas.shotBow();

        System.out.println(aragorn.toString());
        aragorn.hitOfSword();

        System.out.println(lordOfTheRing.toString());

        System.out.println(gandalf.skillHero.toString());
        System.out.println(legolas.skillHero.toString());
        System.out.println(aragorn.skillHero.toString());





    }
}
