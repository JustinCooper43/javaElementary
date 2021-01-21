package com.streltsov.javaElementary.course.homeworks.hw3;

import java.util.Arrays;

public class Task1 {

    private static StringBuilder buildRecursion = new StringBuilder();

    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4},
                {2, 5, 4},
                {1, 6, 9},
                {3, 7, 4},
                {1, 8, 4}
        };

        print(arr);
    }

    private static void print(int[][] arr) {

        printTwoDimensionArr(arr,arr.length);
        System.out.println(buildRecursion.reverse().toString());

    }


    private static int printTwoDimensionArr(int[][] twoDimensionArr, int lengthTwoDimArr){

        if (lengthTwoDimArr == 0) {
            return 0;
        }

        int [] oneDimensionArr = Arrays.copyOf(twoDimensionArr[lengthTwoDimArr - 1],twoDimensionArr[0].length);

        printOneDimensionArr(oneDimensionArr,oneDimensionArr.length);

        return printTwoDimensionArr(twoDimensionArr,lengthTwoDimArr-1);

    }

    private static int printOneDimensionArr(int[] oneDimensionArr, int lengthSecondArray){

        if (lengthSecondArray== 0) {
            return 0;
        }
        buildRecursion.append(" ").append(oneDimensionArr[lengthSecondArray-1]);

        return printOneDimensionArr(oneDimensionArr,lengthSecondArray-1);
    }
}


