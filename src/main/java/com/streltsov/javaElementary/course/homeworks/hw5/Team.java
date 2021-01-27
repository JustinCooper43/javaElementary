package com.streltsov.javaElementary.course.homeworks.hw5;

import java.util.Arrays;

class Team {

    private String nameOfTeam;
    private String country;
    protected Hero[] listOfTeam = new Hero[5];


    Team(String nameOfTeam, String country) {
        this.nameOfTeam = nameOfTeam;
        this.country = country;

    }

    void attack(Attack subject, String nameAttack) {
        subject.typeOfDamage(nameAttack);
    }

    @Override
    public String toString() {
        return "We are  " + '\'' +
                nameOfTeam + '\'' +
                ". \n" +
                "Our brothers in arms : " + Arrays.toString(listOfTeam);
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getListOfTeam() {
        return listOfTeam.length;
    }
}
