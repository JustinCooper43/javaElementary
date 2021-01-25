package com.streltsov.javaElementary.course.homeworks.hw3;

public class Task6 {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4, 5},
                {2,  5},
                {1, 6, 9, 2},
                {3,  4, 7},
                {1, 8, 4, 0}
        };

        int counter = 0;
        print(arr,counter);
    }

    private static int print(int[][] twoArr, int countForTwoArr) {

        if (twoArr == null) {
            System.out.println("Array is null");
            return 0;
        }


        int countForOneArr = 0;
        if (countForTwoArr == twoArr[0].length) {
            return 0;
        }

        print2(twoArr[countForTwoArr], countForOneArr);

        System.out.println("");
        return print(twoArr, countForTwoArr + 1);
    }

    private static int print2(int[] oneArr, int counter) {

        if (oneArr == null) {
            System.out.println("Array is null");
            return 0;
        }
        if (counter == oneArr.length) {
            return 0;
        }

        System.out.print(oneArr[counter] + " ");

        return print2(oneArr, counter + 1);
    }
}
