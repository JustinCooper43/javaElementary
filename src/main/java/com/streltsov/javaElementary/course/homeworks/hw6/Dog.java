package com.streltsov.javaElementary.course.homeworks.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return number == dog.number && name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
