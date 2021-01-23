package com.streltsov.javaElementary.course.homeworks.hw3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    private static StringBuilder buildRecursion = new StringBuilder(",");
    private static StringBuilder builderFormatArr = new StringBuilder("[");
    private static StringBuilder builderRegex = new StringBuilder("(\\b");

    public static void main(String[] args) {


    int[][] arr = {
            {2, 3, 4, 5},
            {2, 5, 4, 5},
            {1, 6, 9, 2},
            {3, 7, 4, 7},
            {1, 8, 4, 0}
    };
        System.out.println(Arrays.deepToString(arr));
    print(arr);
}

    private static void print(int[][] arr) {

        printArray(arr, arr.length);
        String str = buildRecursion.reverse().deleteCharAt(buildRecursion.length() - 1).toString();

        printFormatArray(str, arr[0].length);
        System.out.println(builderFormatArr.toString());


    }


    private static int printArray(int[][] twoDimensionArr, int lengthTwoDimArr) {


        if (lengthTwoDimArr == 0) {
            return 0;
        }

        int[] oneDimensionArr = Arrays.copyOf(twoDimensionArr[lengthTwoDimArr - 1], twoDimensionArr[0].length);

        printOneDimensionArr(oneDimensionArr, oneDimensionArr.length);


        return printArray(twoDimensionArr, lengthTwoDimArr - 1);


    }

    private static int printOneDimensionArr(int[] oneDimensionArr, int lengthSecondArray) {


        if (lengthSecondArray == 0) {

            return 0;
        }
        buildRecursion.append(",").append(oneDimensionArr[lengthSecondArray - 1]);

        return printOneDimensionArr(oneDimensionArr, lengthSecondArray - 1);
    }

    private static String printFormatArray(String stringOfArr, int lengthOneDimensionArr) {

        int indexEnd = (lengthOneDimensionArr) + (lengthOneDimensionArr - 1);

        if (stringOfArr.length() == indexEnd + 1) {

            getPattern(stringOfArr, lengthOneDimensionArr);
            return builderFormatArr.append("]").toString();
        }


        getPattern(stringOfArr, lengthOneDimensionArr);

        builderFormatArr.append(",");

        StringBuilder buildOfCutString = new StringBuilder(stringOfArr).delete(0, indexEnd + 1);

        return printFormatArray(buildOfCutString.toString(), lengthOneDimensionArr);

    }

    private static void getPattern(String partOfStringArr, int lengthOneDimArr) {
        getRegex(lengthOneDimArr);


        Pattern pattern = Pattern.compile(builderRegex.toString());
        Matcher match = pattern.matcher(partOfStringArr);

        builderFormatArr.append(match.find() ? "[" + match.group() + "]" : "");

        builderRegex.setLength(3);
    }

    private static int getRegex(int lengthOfArr) {


        if (lengthOfArr == 1) {
            builderRegex.append("\\d)");
        } else if (lengthOfArr == 0) {
            return 0;
        } else {
            builderRegex.append("\\d\\D");
        }
        return getRegex(lengthOfArr - 1);
    }
}

