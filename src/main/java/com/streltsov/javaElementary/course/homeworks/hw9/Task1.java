package com.streltsov.javaElementary.course.homeworks.hw9;

import java.text.MessageFormat;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

    public static void main(String[] args) {

        String testSentence = "lole wok anwqeq!! anwqeq anwqeq kek wwo w w we";
        System.out.println("Example String =" + testSentence);
        countWords(testSentence);
    }

    private static void countWords(String sentence) {

        String cleanSentence = sentence.replaceAll("[^a-zA-Z]", " ");
        String[] wordArray = cleanSentence.toLowerCase().split(" +");
        Map<Integer, Integer> mapOfCountedWords = new TreeMap<>();

        for (String word : wordArray) {
            mapOfCountedWords.put(word.length(), 0);
        }
        for (String word : wordArray) {
            mapOfCountedWords.computeIfPresent(word.length(), (key, value) -> value + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mapOfCountedWords.entrySet()) {
            System.out.println(MessageFormat.format("We have {0} strings of length {1} ", entry.getValue(), entry.getKey()));
        }

        printWordMaxLength(mapOfCountedWords, wordArray);

    }

    private static void printWordMaxLength(Map<Integer, Integer> mapOfCountWord, String[] wordArray) {
        int maxLength = 0;

        for (Integer lengthWord : mapOfCountWord.keySet()) {
            maxLength = lengthWord;
        }
        System.out.print("The longest words are: ");

        for (String str : wordArray) {
            if (str.length() == maxLength) {
                System.out.print(str + " ");
            }
        }
    }
}
