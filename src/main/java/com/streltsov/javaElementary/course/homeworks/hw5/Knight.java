package com.streltsov.javaElementary.course.homeworks.hw5;

 class Knight extends  Hero implements Attack{


    public Knight(String name, Integer power, Integer healthPoints, String skillHero) {
        super(name, power, healthPoints, skillHero);
    }

    public void hitOfSword(){
        System.out.println("I will finish him off with my sword");
    }


    @Override
    public void typeOfDamage(String nameDamage) {
        System.out.println("I have got sharp sword and  do " + nameDamage + " damage");
    }

    @Override
    public String toString() {
        return "Hi, I am Knight " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}
