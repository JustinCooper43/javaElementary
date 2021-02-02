package com.streltsov.javaElementary.course.homeworks.hw4;

public class Skill {

    String nameSkill;

    public Skill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    @Override
    public String toString() {
        return "I have "+ '\''  + nameSkill + '\'' +
                " skill and you do not";
    }
}
