package com.streltsov.javaElementary.course.homeworks.hw8;

class Dog {

    private final String name;
    private final int number;

    Dog(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
