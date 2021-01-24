package com.streltsov.javaElementary.course.homeworks.hw4;

public class Archer extends Hero {


    public Archer(String name, Integer power, Integer healthPoints) {
        super(name, power, healthPoints);
    }

    public void shotBow() {
        System.out.println("Straight to the bull's eye");
    }

    @Override
    public String toString() {
        return "Hi, I am Archer " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}

