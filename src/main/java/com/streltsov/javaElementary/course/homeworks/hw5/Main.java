package com.streltsov.javaElementary.course.homeworks.hw5;

public class Main {

    public static void main(String[] args) {

        Team lordOfTheRing = new Team("The Fellowship of the Ring", "Rivendell");

        Wizard gandalf = new Wizard("Gandalf", 100, 50, "You shall not pass");
        Archer legolas = new Archer("Legolas", 146, 139, "Immortality");
        Knight aragorn = new Knight("Aragorn", 150, 100, "Just a good fella");

        lordOfTheRing.listOfTeam[0] = gandalf;
        lordOfTheRing.listOfTeam[1] = legolas;
        lordOfTheRing.listOfTeam[2] = aragorn;

        System.out.println(gandalf.toString());

        Eagle eagle = new Eagle("Sebastian", "Scarlet");

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

        // homework5
        System.out.println();

        lordOfTheRing.attack(legolas, "Chemical");
        lordOfTheRing.attack(aragorn, "Physical");
        lordOfTheRing.attack(gandalf, "Magical");

        System.out.println();

        gandalf.skillHero.setNameSkill("Life of the party");
        legolas.skillHero.setNameSkill("Attractiveness");
        aragorn.skillHero.setNameSkill("Good comedian");

        System.out.println();

        System.out.println(gandalf.skillHero.getNameSkill());
        System.out.println(legolas.skillHero.getNameSkill());
        System.out.println(aragorn.skillHero.getNameSkill());

        System.out.println();

        System.out.println(gandalf.getEagle());
        eagle.setName("Silvester");
        eagle.setTypeOfEagle("Fuchsia");
        System.out.println(eagle.getName());
        System.out.println(eagle.getTypeOfEagle());

        System.out.println();

        lordOfTheRing.setNameOfTeam("Jewelry delivery service");
        lordOfTheRing.setCountry("Shire");
        System.out.println(lordOfTheRing.getNameOfTeam());
        System.out.println(lordOfTheRing.getCountry());
        System.out.println(lordOfTheRing.getListOfTeam());

    }
}
