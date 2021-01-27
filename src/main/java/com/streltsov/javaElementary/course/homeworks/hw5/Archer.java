package com.streltsov.javaElementary.course.homeworks.hw5;

class Archer extends Hero implements Attack {


    Archer(String name, Integer power, Integer healthPoints, String skillHero) {
        super(name, power, healthPoints, skillHero);
    }

    void shotBow() {
        System.out.println("Straight to the bull's eye");
    }

    @Override
    public void typeOfDamage(String nameDamage) {
        System.out.println("I have got poison arrows and  do " + nameDamage + " damage");
    }

    @Override
    public String toString() {
        return "Hi, I am Archer " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}

