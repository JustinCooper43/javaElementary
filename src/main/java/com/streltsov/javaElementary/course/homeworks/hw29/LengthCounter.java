package com.streltsov.javaElementary.course.homeworks.hw29;

import java.util.*;

public class LengthCounter {
    public Map<Integer, List<String>> countWordsByLength(String input) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        if (input == null || input.isEmpty()) {
            return resultMap;
        }
        String stringWitHOutNumbers = input.replaceAll("[0-9]","");
        String[] splitInput = stringWitHOutNumbers.toLowerCase().replaceAll("[^a-z\']+"," ").split(" ");
        for (String fragment : splitInput) {
            Integer length = fragment.length();
            List<String> wordsOfLength = resultMap.getOrDefault(length, new ArrayList<>());
            wordsOfLength.add(fragment);
            resultMap.put(length, wordsOfLength);
        }
        return resultMap;
    }
}

