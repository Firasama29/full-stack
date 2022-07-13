package com.string.stringbufferbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;

public class StringBufferStringBuilderTest {

    @Test
    public void givenString_compareString_returnEqual() {
        String immutableString = "test class";

        StringBuffer mutableStringBuffer = new StringBuffer("test");
        mutableStringBuffer.append(" class");

        StringBuilder mutableStringBuilder = new StringBuilder("mutable");
        mutableStringBuilder.append(" class");

        assertNotEquals(mutableStringBuffer, mutableStringBuilder);
        assertNotEquals(immutableString, mutableStringBuffer, mutableStringBuilder);

    }
}
