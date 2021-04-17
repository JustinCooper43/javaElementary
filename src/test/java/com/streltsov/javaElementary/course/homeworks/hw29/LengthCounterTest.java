package com.streltsov.javaElementary.course.homeworks.hw29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthCounterTest {

    LengthCounter lengthCounter;

    @BeforeEach
    public void setup() {
        lengthCounter = new LengthCounter();
    }

    @Test
    @DisplayName("Should return empty map if input string is null")
    public void shouldCountIfValueIsNull() {
        //given
        String stringTest = null;
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        //then
        Assertions.assertEquals(expectedMap, resultMap);
    }

    @Test
    @DisplayName("Should return empty map if input string is empty")
    public void shouldCountIfValueIsEmpty() {
        //given
        String stringTest = "";
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        //then
        Assertions.assertEquals(expectedMap, resultMap);
    }

    @Test
    @DisplayName("Should return counted map if input string is different case")
    public void shouldCountIfValueIsDifCase() {
        //given
        String stringTest = "Shake it wHat your mAmA gAve ya ya ya ya ";
        Map<Integer, List<String>> compareMap = new HashMap<>();
        List<String> list1 = Stream.of("it","ya","ya","ya","ya").collect(Collectors.toList());
        List<String> list2 = Stream.of("what","your","mama","gave").collect(Collectors.toList());
        List<String> list3 = Stream.of("shake").collect(Collectors.toList());
        compareMap.put(2,list1);
        compareMap.put(4,list2);
        compareMap.put(5,list3);
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        //then
        Assertions.assertEquals(compareMap, resultMap);
    }

    @Test
    @DisplayName("Should return counted map if input string with numbers")
    public void shouldCountIfValueWithNumbers() {
        //given
        String stringTest = "Shake9090 it123213 wHat 231your 3mama gave ya ya ya ya ";
        Map<Integer, List<String>> compareMap = new HashMap<>();
        List<String> list1 = Stream.of("it","ya","ya","ya","ya").collect(Collectors.toList());
        List<String> list2 = Stream.of("what","your","mama","gave").collect(Collectors.toList());
        List<String> list3 = Stream.of("shake").collect(Collectors.toList());
        compareMap.put(2,list1);
        compareMap.put(4,list2);
        compareMap.put(5,list3);
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        Assertions.assertEquals(compareMap, resultMap);
    }

    @Test
    @DisplayName("Should return counted map if input string has equals words")
    public void shouldCountIfValuesAreEquals() {
        //given
        String stringTest = "ya ya ya ya ya ya ya ";
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        List<String> list1 = Stream.of("ya","ya","ya","ya","ya","ya","ya").collect(Collectors.toList());
        expectedMap.put(2,list1);
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        //then
        Assertions.assertEquals(expectedMap, resultMap);
    }

    @Test
    @DisplayName("Should return counted map if input string with apostrophes")
    public void shouldCountIfValueWithApostrophes() {
        //given
        String stringTest = "L'amour ne fait pas d'erreurs";
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        List<String> list1 = Stream.of("ne").collect(Collectors.toList());
        List<String> list2 = Stream.of("pas").collect(Collectors.toList());
        List<String> list3 = Stream.of("fait").collect(Collectors.toList());
        List<String> list4 = Stream.of("l'amour").collect(Collectors.toList());
        List<String> list5 = Stream.of("d'erreurs").collect(Collectors.toList());
        expectedMap.put(2,list1);
        expectedMap.put(3,list2);
        expectedMap.put(4,list3);
        expectedMap.put(7,list4);
        expectedMap.put(9,list5);
        //when
        Map<Integer, List<String>> resultMap = lengthCounter.countWordsByLength(stringTest);
        //then
        Assertions.assertEquals(expectedMap, resultMap);
    }

}
