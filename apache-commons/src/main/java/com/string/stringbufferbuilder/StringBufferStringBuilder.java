package com.string.stringbufferbuilder;

public class StringBufferStringBuilder {

    public static void main(String[] args) {
        /*
            - String is an immutable class so it cannot be modified
            - StringBuffer and StringBuilder are mutable
            - StringBuffer is synchronized and therefore, thread safe
            - StringBuilder is compatible with StringBuffer API but not synchronized
            - Since StringBuffer is not thread safe, it is faster and recommended where no thread safety
            is needed like single-thread programs
        */

        //we cannot modify the string value, so a new object is created
        String string = "test";
        string = " immutability";

        //the object is modified so no new object created
        StringBuffer stringBuffer = new StringBuffer("test");
        stringBuffer.append(" stringBuffer");

        //the object is modified so no new object created
        StringBuilder stringBuilder = new StringBuilder("test");
        stringBuilder.append(" stringBuilder");

        System.out.println(string);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
