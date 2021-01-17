package com.streltsov.javaElementary.course.homeworks.hw2;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        String example = " aab  a  a  ";

        System.out.println("Palindrome result = " + checkPalindrome(example));
        System.out.println("Palindrome result = " + checkPalindromeChar(example));
    }

    public static boolean checkPalindrome(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder build = new StringBuilder();

        for (String var : array) {
            build.append(var);
        }

        String rightOrder = build.toString();

        String backOrder = build.reverse().toString();

        return backOrder.equals(rightOrder);
    }

    public static boolean checkPalindromeChar(String phrase) {

        List<Character> listFrase = new ArrayList<>();

        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) != ' ') listFrase.add(phrase.charAt(i));
        }

        List<Character> listPhraseDes = new ArrayList<>();

        for (int i = phrase.length() - 1 ; i >= 0 ; i--) {
            if(phrase.charAt(i) != ' ') listPhraseDes.add(phrase.charAt(i));
        }

        return listFrase.equals(listPhraseDes);

    }
}
