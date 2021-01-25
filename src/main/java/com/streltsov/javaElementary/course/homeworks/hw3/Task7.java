package com.streltsov.javaElementary.course.homeworks.hw3;

public class Task7 {

    static StringBuilder build = new StringBuilder("");


    public static void main(String[] args) {


        String[] stringArrays = {
                "[{()()(){[][()]}}]",
                "[]((((()}",
                "[]{}()",
                "{{{{{{{]",
                "{}()((({{{{[[]]}}}})))",
                "(((()}}}"
        };

        for (String string : stringArrays) {
            if (valid(string)) {
                print(string);
            } else {
                System.out.printf("String %s is not valid\n", string);
            }
            System.out.println();
        }

    }

    private static boolean valid(String val) {
        String cleanString = val.replaceAll(" +", " ");
        if (cleanString.length() % 2 != 0 & cleanString.length() != 0) {
            return false;
        }


        return findBrackets(cleanString);

    }

    private static void print(String validString) {

        StringBuilder strTab = new StringBuilder();
        String strNewLine = "\n";

        String[] arrValidString = validString.split("");

        StringBuilder buildBrackets = new StringBuilder();

        String patternAscOrder = "{[(";
        String patternDescOrder = "}])";


        for (int i = 1; i < arrValidString.length; i++) {
            if (patternAscOrder.contains(arrValidString[i - 1]) & patternAscOrder.contains(arrValidString[i])) {
                strTab.append("\t");

                buildBrackets.append(arrValidString[i - 1]).append(strNewLine).append(strTab);


            } else if (patternAscOrder.contains(arrValidString[i - 1]) & patternDescOrder.contains(arrValidString[i]) |
                    patternDescOrder.contains(arrValidString[i - 1]) & patternAscOrder.contains(arrValidString[i])) {

                buildBrackets.append(arrValidString[i - 1]).append(strNewLine).append(strTab);

            } else {

                strTab.replace(0, 1, "");
                buildBrackets.append(arrValidString[i - 1]).append(strNewLine).append(strTab);

            }

        }

        buildBrackets.append(arrValidString[arrValidString.length - 1]);

        System.out.println(buildBrackets.toString());

    }


    private static boolean findBrackets(String stringBrackets) {


        int resultBefore;
        int resultAfter;


        String stringCutBrackets = stringBrackets;


        do {

            resultBefore = stringCutBrackets.length();

            stringCutBrackets = stringCutBrackets.replaceAll("\\(\\)", "");
            stringCutBrackets = stringCutBrackets.replaceAll("\\[]", "");
            stringCutBrackets = stringCutBrackets.replaceAll("\\{}", "");


            resultAfter = stringCutBrackets.length();

            if (resultBefore == resultAfter) {
                break;
            }

        } while (stringCutBrackets.length() > 0);

        return stringCutBrackets.length() == 0;

    }
}
