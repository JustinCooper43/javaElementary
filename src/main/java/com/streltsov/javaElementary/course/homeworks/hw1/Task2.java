package com.streltsov.javaElementary.course.homeworks.hw1;

public class Task2 {

    public static void main(String[] args) {

        calculateAnimalYears(3);
        loopsCalculateYears(3);

    }

    public static void calculateAnimalYears(int humanYears) {
        int catYears = 15;
        int dogYears = 15;

        if (humanYears == 2) {
            catYears = dogYears += 9;

        } else if (humanYears >= 3) {
            catYears += 9 + (humanYears - 2) * 4;
            dogYears += 9 + (humanYears - 2) * 6;
        } else {
            System.out.println("Please, input whole and positive numbers only ");
        }

        System.out.println("HumanYears: " + humanYears + "\n" +
                "CatYears: " + catYears + "\n" +
                "DogYears: " + dogYears);
    }

    public static void loopsCalculateYears(int humanAges) {

        int resultCatYears = 15;
        int resultDogYears = 15;

        for (int i = humanAges; i > 1; i--) {
            if (i == 2) {
                resultCatYears += 9;
                resultDogYears += 9;

            } else if (i > 2) {
                resultCatYears += 4;
                resultDogYears += 6;
            } else {
                System.out.println("Please, input whole and positive numbers only ");
            }

        }
        System.out.println("HumanYears: " + humanAges + "\n" +
                "CatYears: " + resultCatYears + "\n" +
                "DogYears: " + resultDogYears);
    }
}
