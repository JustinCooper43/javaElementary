package com.streltsov.javaElementary.course.homeworks.hw2;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Task1 {

    public static void main(String[] args) {

        int sizeArray = 10;

        averageNumber(sizeArray);

    }

    public static void averageNumber(int sizeArray) {

        SplittableRandom randomNumbers = new SplittableRandom();

        int[] arrayNumbers = new int[sizeArray];

        for (int i = 0; i < arrayNumbers.length ; i++) {
            arrayNumbers[i] = randomNumbers.nextInt(-100, 100);
        }

        System.out.println("Example array = "+ Arrays.toString(arrayNumbers));

        double sum = 0;

        for (int var : arrayNumbers) {
            sum += var;
        }

        double average = sum / sizeArray;

        System.out.println("Answer = " + average );

    }
}
