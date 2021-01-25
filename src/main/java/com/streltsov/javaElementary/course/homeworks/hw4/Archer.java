package com.streltsov.javaElementary.course.homeworks.hw4;

public class Archer extends Hero {


    Skill skillArcher =  new Skill("Immortality"); // Composition

    public Archer(String name, Integer power, Integer healthPoints) {
        super(name, power, healthPoints);
    }

    public void shotBow() {
        System.out.println("Straight to the bull's eye");
    }

    public Skill getSkillArcher() {
        return skillArcher;
    }

    @Override
    public String toString() {
        return "Hi, I am Archer " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}

