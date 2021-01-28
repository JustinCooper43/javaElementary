package com.streltsov.javaElementary.course.homeworks.hw5;

class Archer extends Hero implements Attacker, Protector {


    Archer(String name, Integer power, Integer healthPoints, String skillHero, String typeOfDamage) {
        super(name, power, healthPoints, skillHero, typeOfDamage);
    }


    @Override
    public void makeAttack() {
        System.out.println("Straight to the bull's eye!" + " This is " + typeOfDamage + " damage, babe");
    }

    @Override
    public void toProtect() {
        System.out.println("I'm " + getName() + " will give  all my " + getHealthPoints() * 0.8 + " points of protect");
    }

    @Override
    public String toString() {
        return "Hi, I am Archer " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}

