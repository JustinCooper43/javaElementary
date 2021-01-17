package com.streltsov.javaElementary.course.homeworks.hw2;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        String example = " Aab  A  a  ";

        System.out.println("Palindrome result = " + checkPalindrome(example));
        System.out.println("Palindrome result = " + checkPalindromeChar(example));
    }

    private static boolean checkPalindrome(String sentence) {

        StringBuilder build = new StringBuilder();

       build.append(sentence.replaceAll(" +","").toLowerCase());

        String rightOrder = build.toString();

        String backOrder = build.reverse().toString();

        return backOrder.equals(rightOrder);
    }

    private static boolean checkPalindromeChar(String phrase) {

        List<Character> listPhrase = new ArrayList<>();

         String phraseLow = phrase.toLowerCase();

        for (int i = 0; i < phraseLow.length(); i++) {
            if(phraseLow.charAt(i) != ' ') listPhrase.add(phraseLow.charAt(i));
        }

        List<Character> listPhraseDes = new ArrayList<>();

        for (int i = phrase.length() - 1 ; i >= 0 ; i--) {
            if(phraseLow.charAt(i) != ' ') listPhraseDes.add(phraseLow.charAt(i));
        }

        return listPhrase.equals(listPhraseDes);

    }
}
