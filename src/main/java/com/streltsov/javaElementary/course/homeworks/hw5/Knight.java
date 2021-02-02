package com.streltsov.javaElementary.course.homeworks.hw5;

class Knight extends Hero implements Attacker, Protector {


    public Knight(String name, Integer power, Integer healthPoints, String skillHero, String typeOfDamage) {
        super(name, power, healthPoints, skillHero, typeOfDamage);
    }

    @Override
    public void makeAttack() {
        System.out.println("I will finish him off with my sword." + " This is " + typeOfDamage + " damage, babe");
    }

    @Override
    public void toProtect() {
        System.out.println("I'm " + getName() + " will give all my " + getHealthPoints() * 0.6 + " points of protect");
    }

    @Override
    public String toString() {
        return "Hi, I am Knight " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}
