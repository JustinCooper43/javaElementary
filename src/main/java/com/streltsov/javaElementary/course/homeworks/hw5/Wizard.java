package com.streltsov.javaElementary.course.homeworks.hw5;

class Wizard extends Hero implements Attacker, Protector {


    Eagle eagle;

    public Wizard(String name, Integer power, Integer healthPoints, String skillHero, String typeOfDamage) {
        super(name, power, healthPoints, skillHero, typeOfDamage);
    }

    void summonEagle(String name, String type) {
        this.eagle = new Eagle(name, type);
    }


    @Override
    public void makeAttack() {
        System.out.println("My fireball will destroy all enemies." + " This is " + typeOfDamage + " damage, babe");
    }

    @Override
    public void toProtect() {
        System.out.println("I'm " + getName() + " will give  all my " + getPower() * 0.9 + " points of protect");
    }

    @Override
    public String toString() {
        return "Hi, I am Wizard " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and  health = " + healthPoints;
    }

    public Eagle getEagle() {
        return eagle;
    }


}
