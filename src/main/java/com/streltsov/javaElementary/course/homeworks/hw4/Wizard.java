package com.streltsov.javaElementary.course.homeworks.hw4;

public class Wizard extends Hero {


    public Wizard(String name, Integer power, Integer healthPoints) {
        super(name, power, healthPoints);
    }

    public void summonEagle(String name, String type ) {
        new Eagle(name, type);
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
