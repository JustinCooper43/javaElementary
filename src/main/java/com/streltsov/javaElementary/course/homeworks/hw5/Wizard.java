package com.streltsov.javaElementary.course.homeworks.hw5;

class Wizard extends Hero implements Attack {


    Eagle eagle;

    Wizard(String name, Integer power, Integer healthPoints, String skillHero) {
        super(name, power, healthPoints, skillHero);
    }

     void summonEagle(String name, String type ) {
        this.eagle = new Eagle(name, type);
    }

     void fireBall() {
        System.out.println( "My fireball will destroy all enemies");
    }

    @Override
    public void typeOfDamage(String nameDamage) {
        System.out.println("I have got a magic staff and  do " + nameDamage + " damage");
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
