package com.streltsov.javaElementary.course.homeworks.hw3;


import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4},
                {2, 5, 4},
                {1, 6},
                null,
                {3, 7, 4},
                {1, 8, 4}
        };
        int[][] deepCopy = deepCopy(arr);


        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(deepCopy));
    }

    private static int[][] deepCopy(int[][] arr) {
        int[][] copyArr = arr.clone();
        for (int i = 0; i < copyArr.length; i++) {
            if (arr[i] == null) {
                copyArr[i] = null;
            } else {
                copyArr[i] = arr[i].clone();
            }
        }

        return copyArr;
    }

}

