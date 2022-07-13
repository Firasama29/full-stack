package com.string.charsequence;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class StringVsCharSequenceTest {

    @Test
    public void testCharSequenceAndString_whenInstantiating_thenPrint() {
        String stringTest = "practice";
        CharSequence charSequenceTest = "practice";
        assertNotEquals(stringTest, charSequenceTest);
    }
}
