package com.streltsov.javaElementary.course.homeworks.hw5;

class Eagle {

    private String name;
    private String typeOfEagle;

    Eagle(String name, String typeOfEagle) {
        this.name = name;
        this.typeOfEagle = typeOfEagle;
    }


    void battleRoar() {
        System.out.println("I am eeeeeeeeeeeeeeeagle!!!!!!");
    }

    @Override
    public String toString() {
        return " Hello. I am Eagle. How do you do? ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfEagle() {
        return typeOfEagle;
    }

    public void setTypeOfEagle(String typeOfEagle) {
        this.typeOfEagle = typeOfEagle;
    }
}
