package com.streltsov.javaElementary.course.homeworks.hw5;

public abstract class  Hero {

    protected String name;
    protected Integer power;
    protected Integer healthPoints;
    protected Skill skillHero;

     Hero(String name, Integer power, Integer healthPoints, String skillHero) {
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
