package com.streltsov.javaElementary.course.homeworks.hw5;

class Skill {

    private String nameSkill;

    Skill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    @Override
    public String toString() {
        return "I have "+ '\''  + nameSkill + '\'' +
                " skill and you do not";
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }
}
