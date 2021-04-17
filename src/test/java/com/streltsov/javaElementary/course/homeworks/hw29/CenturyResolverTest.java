package com.streltsov.javaElementary.course.homeworks.hw29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CenturyResolverTest {

    private CenturyResolver centuryResolver;

    @BeforeEach
    public void setup() {
        centuryResolver = new CenturyResolver();
    }

    @Test
    @DisplayName("Should not count if input value is 0")
    public void shouldFailIfValueIsZero() {
        int number = 0;
        String messageException = "there was no 0 year.";
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
                centuryResolver.ResolveCentury(number));
        Assertions.assertEquals(messageException, ex.getMessage());
    }

    @Test
    @DisplayName("Should count century if input value is whole number")
    public void shouldCountCenturyIfValueIsWholeNumb() {
        int number = 100;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("Should count century if input value is whole number is less on a one (Corner case)")
    public void shouldCountCenturyIfValueIsWholeNumbMinusOne() {
        int number = -1;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("Should count century if input value is whole number is more on a one (Corner case)")
    public void shouldCountCenturyIfValueIsWholeNumbPlusOne() {
        int number = 1;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("Should count century if input value is Integer.MAX_VALUE (Corner case)")
    public void shouldCountCenturyIfValueMaxInteger() {
        int number = Integer.MAX_VALUE;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(21474837, result);
    }

    @Test
    @DisplayName("Should count century if input value is Integer.MIN_VALUE (Corner case)")
    public void shouldCountCenturyIfValueMinInteger() {
        int number = Integer.MIN_VALUE;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(-21474837, result);
    }

    @Test
    @DisplayName("Should count century if input value is negative whole number")
    public void shouldCountCenturyIfValueIsNegativeWholeNumber() {
        int number = -300;
        int result = centuryResolver.ResolveCentury(number);
        Assertions.assertEquals(-3, result);
    }
}
