package com.streltsov.javaElementary.course.homeworks.hw4;

public class Eagle {

    String name;
    String typeOfEagle;

    public Eagle(String name, String typeOfEagle) {
        this.name = name;
        this.typeOfEagle = typeOfEagle;
    }


    @Override
    public String toString() {
        return " Hello. I am Eagle. How do you do? ";
    }
}
