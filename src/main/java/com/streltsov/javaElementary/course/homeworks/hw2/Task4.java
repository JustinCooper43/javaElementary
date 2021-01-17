package com.streltsov.javaElementary.course.homeworks.hw2;

public class Task4 {

    public static void main(String[] args) {

        centuryFromYear(2001);

    }

    public static void centuryFromYear(int year) {

        System.out.println("For year = " + year);

        if (year % 100 == 0) {
            year /= 100;
        } else {
            year = ( year / 100 ) + 1;
        }

        System.out.println("Century = " + year);
    }

}
