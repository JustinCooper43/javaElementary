package com.streltsov.javaElementary.course.homeworks.hw4;

public class Knight extends  Hero {


    public Knight(String name, Integer power, Integer healthPoints) {
        super(name, power, healthPoints);
    }

    public void hitOfSword(){
        System.out.println("I will finish him off with my sword");
    }

    @Override
    public String toString() {
        return "Hi, I am Knight " +
                " my name is'" + name + '\'' +
                ", I have a power = " + power +
                " and health = " + healthPoints;
    }
}
