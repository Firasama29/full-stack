package com.string.apache.commons;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void whenCalledIsBlank_thenCorrect() {
        Assertions.assertTrue(StringUtils.isBlank(" "));       //isBlank() is true for a String with space
        Assertions.assertTrue(StringUtils.isBlank(""));        //isBlank() is true if String is empty
        Assertions.assertTrue(StringUtils.isBlank(null));      //isBlank() is true if String has null value
    }

    @Test
    public void whenCalledIsEmpty_thenCorrect() {
        Assertions.assertTrue(StringUtils.isEmpty(""));        //isEmpty() is true if String is empty
        Assertions.assertFalse(StringUtils.isEmpty(" "));      //isEmpty() is true for a String with space
        Assertions.assertTrue(StringUtils.isEmpty(null));      //isEmpty() is true if String has null value
    }

    @Test
    public void whenCalledIsLowerCase_thenCorrect() {
        Assertions.assertTrue(StringUtils.isAllLowerCase("words"));
        Assertions.assertFalse(StringUtils.isAllLowerCase("WORDS"));
    }

    @Test
    public void whenCalledIsUpperCase_thenCorrect() {
        Assertions.assertTrue(StringUtils.isAllUpperCase("TEST"));
        Assertions.assertFalse(StringUtils.isAllUpperCase("test"));
    }

    @Test
    public void whenCalledIsMixedCase_thenCorrect() {
        Assertions.assertTrue(StringUtils.isMixedCase("Test"));
    }

    @Test
    public void whenCalledIsEqual_thenCorrect() {
        String compareString = "Practice";
        String compareAnotherString = "practice";
        Assertions.assertFalse(StringUtils.equals(compareString, compareAnotherString));
    }

    @Test
    public void whenCalledContainsAny_thenCorrect() {
        String containString = "FiRaS";

        Assertions.assertTrue(StringUtils.containsAny(containString,"F"));
        Assertions.assertTrue(StringUtils.containsIgnoreCase(containString, "r"));
    }

    @Test
    public void whenCalledAppendAndPrepend_thenCorrect() {
        String suffix = "spring.io";

        String appended = StringUtils.appendIfMissing(suffix, ".io");
        String prepended = StringUtils.prependIfMissing(suffix, "start.");

        Assertions.assertEquals("spring.io", appended);
        Assertions.assertEquals("start.spring.io", prepended);
    }

    @Test
    public void whenCalledSwapCase_thenCorrect() {
        String swapString = "JAVA practice";
        String swappedString = StringUtils.swapCase(swapString);
        Assertions.assertEquals("java PRACTICE", swappedString);
    }

    @Test
    public void whenCalledIsReversed_thenCorrect() {
        String text = "Firas";
        String multiple = "start.spring.io";

        String reversedText = StringUtils.reverse(text);
        String reverseMultiple = StringUtils.reverseDelimited(multiple, '.');

        Assertions.assertEquals("sariF", reversedText);
        Assertions.assertEquals("io.spring.start", reverseMultiple);
    }

    @Test
    public void whenCalledIsRotated_thenCorrect() {
        String original = "spring";

        String rotated = StringUtils.rotate(original, 2);

        Assertions.assertEquals(rotated, "ngspri");
    }

    @Test
    public void whenCalledDifference_thenCorrect() {
        String first = "spring";
        String second = "spring boot";

        String difference = StringUtils.difference(first, second);

        Assertions.assertEquals(" boot", difference);
    }
}
