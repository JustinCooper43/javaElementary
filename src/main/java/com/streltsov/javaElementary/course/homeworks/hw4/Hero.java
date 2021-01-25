package com.streltsov.javaElementary.course.homeworks.hw4;

public abstract class  Hero {

    String name;
    Integer power;
    Integer healthPoints;
    Skill skillHero;

    public Hero(String name, Integer power, Integer healthPoints, String skillHero) {
        this.name = name;
        this.power = power;
        this.healthPoints = healthPoints;
        this.skillHero = new Skill(skillHero);
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
