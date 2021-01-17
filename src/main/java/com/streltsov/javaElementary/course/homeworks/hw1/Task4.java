package com.streltsov.javaElementary.course.homeworks.hw1;

public class Task4 {

    public static void main(String[] args) {

        genCapitalLetters("This is just an example string for test");
        genCapitalChars("This is just an example string for test");

    }

    public static void genCapitalLetters(String inputSentence) {

        StringBuilder result = new StringBuilder();

        result.append(inputSentence.substring(0, 1).toUpperCase());
        for (int i = 1; i < inputSentence.length(); i++) {

            if (inputSentence.substring(i - 1, i).equals(" ")) {
                result.append(inputSentence.substring(i, i + 1).toUpperCase());
            } else {
                result.append(inputSentence.substring(i, i + 1));
            }
        }
        System.out.println(result);

    }

    public static void genCapitalChars(String sentence) {

        String sentenceUpper = sentence.toUpperCase();
        System.out.print(sentenceUpper.charAt(0));

        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i - 1) == ' ') {
                System.out.print(sentenceUpper.charAt(i));
            } else {
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
