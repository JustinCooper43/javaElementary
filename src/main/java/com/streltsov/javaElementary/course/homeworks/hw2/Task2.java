package com.streltsov.javaElementary.course.homeworks.hw2;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        String example = "wfew 2323 df89 sf990s$%  ";
        System.out.println(example);

        System.out.println(howClearSentence(example));
        countWordsSentence(howClearSentence(example));

    }

    public static String howClearSentence(String sentence) {

        String sentenceLow = sentence.toLowerCase();

        StringBuilder buildCleanWords = new StringBuilder();

        for (int i = 0; i < sentenceLow.length(); i++) {

            if (sentence.charAt(i) >= '\u0061' && sentence.charAt(i) <= '\u007A' || sentence.charAt(i) == ' ') {
                buildCleanWords.append(sentence.charAt(i));
            }

        }
        return buildCleanWords.toString();
    }

    public static void countWordsSentence(String sentence) {

        List<String> array = Arrays.asList(sentence.split(" +"));

        Collections.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        counterWordsLetters(array);

    }

    public static void counterWordsLetters(List<String> sortedArray) {

        Set<Integer> setLengthWords = new HashSet<>();

        for (String var : sortedArray) {
            setLengthWords.add(var.length());
        }

        int count = 0;
        int lengthWord = 0;
        Set<String> longestWords = new HashSet<>();


        for (Integer amountLetters : setLengthWords) {
            for (int i = sortedArray.size() - 1; i >= 0; i--) {
                if (sortedArray.get(i).length() == sortedArray.get(sortedArray.size() - 1).length()) {
                    longestWords.add(sortedArray.get(i));
                }
                if (sortedArray.get(i).length() == amountLetters) {
                    count++;
                    lengthWord = sortedArray.get(i).length();
                }
            }
            System.out.println("We have " + count + " " + "strings of length " + lengthWord);
            count = 0;
            lengthWord = 0;
        }
        System.out.print("The longest words are: " + String.join(",", longestWords));
    }
}



