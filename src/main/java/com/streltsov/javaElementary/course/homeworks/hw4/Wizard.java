package com.streltsov.javaElementary.course.homeworks.hw4;

public class Wizard extends Hero {

    Eagle eagle;

    public Wizard(String name, Integer power, Integer healthPoints, String skillHero) {
        super(name, power, healthPoints, skillHero);
    }

    public void summonEagle(String name, String type ) {
        this.eagle = new Eagle(name, type);
    }

    public void fireBall() {
        System.out.println( "My fireball will destroy all enemies");
    }

    @Override
    public String toString() {
        return "Hi, I am Wizard " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and  health = " + healthPoints;
    }
}
