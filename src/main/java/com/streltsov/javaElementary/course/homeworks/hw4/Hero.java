package com.streltsov.javaElementary.course.homeworks.hw4;

public abstract class  Hero {

    String name;
    Integer power;
    Integer healthPoints;


    public Hero(String name, Integer power, Integer healthPoints) {
        this.name = name;
        this.power = power;
        this.healthPoints = healthPoints;

    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", healthPoints=" + healthPoints +
                '}';
    }
}
