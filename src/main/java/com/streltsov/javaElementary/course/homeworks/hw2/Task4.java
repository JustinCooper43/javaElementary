package com.streltsov.javaElementary.course.homeworks.hw2;

public class Task4 {

    public static void main(String[] args) {

        checkNegative(0);
    }

    private static int centuryFromYear(int year) {


        if (year % 100 == 0) {
            return year / 100;
        } else {
            return (year / 100) + 1;
        }


    }

    private static void checkNegative(int negativeYear) {

        System.out.println("For year = " + negativeYear);

        if (negativeYear < 0) {
            int result = centuryFromYear(negativeYear *= -1);
            System.out.println("Century = " + result + " B.C.");

        } else if (negativeYear == 0) {
            System.out.println("Until the 5th century in Western Europe there was no concept of \"0\" as such");

        } else {
            System.out.println("Century = " + centuryFromYear(negativeYear));
        }
    }
}
