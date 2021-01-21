package com.streltsov.javaElementary.course.homeworks.hw3;


public class Task3 {
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
        String cleanString = val.replaceAll(" +", "");
        if (cleanString.length() % 2 != 0 & cleanString.length() != 0) {
            return false;
        }

        String[] arr = cleanString.split("");

        String bracketsDesc = ")]}";
        String bracketsAsc = "({[";

        int countBracket1 = 0; //  )
        int countBracket2 = 0; //  }
        int countBracket3 = 0; //  ]


        for (String s : arr) {
            if (bracketsDesc.contains(arr[0]) || bracketsAsc.contains(arr[arr.length - 1])) {
                return false;
            } else if (s.equals(")")) {
                countBracket1++;
            } else if (s.equals("}")) {
                countBracket2++;
            } else if (s.equals("]")) {
                countBracket3++;
            } else if (s.equals("(")) {
                countBracket1--;
            } else if (s.equals("{")) {
                countBracket2--;
            } else {
                countBracket3--;
            }
        }


        return (countBracket1 == 0 && countBracket2 ==0 && countBracket3 == 0);


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

}

