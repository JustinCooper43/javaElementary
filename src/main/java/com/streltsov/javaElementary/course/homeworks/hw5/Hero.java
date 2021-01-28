package com.streltsov.javaElementary.course.homeworks.hw5;

public abstract class Hero {

    protected String name;
    protected Integer power;
    protected Integer healthPoints;
    protected Skill skillHero;
    protected String typeOfDamage;

    Hero(String name, Integer power, Integer healthPoints, String skillHero, String typeOfDamage) {
        this.name = name;
        this.power = power;
        this.healthPoints = healthPoints;
        this.skillHero = new Skill(skillHero);
        this.typeOfDamage = typeOfDamage;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", healthPoints=" + healthPoints +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }


    public String getTypeOfDamage() {
        return typeOfDamage;
    }
}
