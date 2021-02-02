package com.streltsov.javaElementary.course.homeworks.hw4;

import java.util.Arrays;

public class Team {

    String nameOfTeam;
    String country;
    Hero [] listOfTeam = new Hero[5];


    public Team(String nameOfTeam, String country) {
        this.nameOfTeam = nameOfTeam;
        this.country = country;

    }

    @Override
    public String toString() {
        return "We are  " + '\'' +
                 nameOfTeam + '\'' +
                ". \n" +
                "Our brothers in arms : " + Arrays.toString(listOfTeam);
    }
}
