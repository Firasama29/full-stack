package com.string.charsequence;

public class StringVsCharSequence {

    // Source (https://www.baeldung.com/java-char-sequence-string)
    public static void main(String[] args) {
        /*
            A string is a sequence of characters
            it is immutable class
            it implements Serializable, CharSequence and Comparable<String>
        */
        String string = "String variable";

        /*
            CharSequence is an interface that represents a sequence of characters
            Mutability is not enforced, so both mutable and immutable classes can implement this interface
            since it is an interface, it cannot be instantiated directly, so it needs an implementation to instantiate a variable
        */
        CharSequence charSequence = "CharSequence variable";



        //instantiation using a StringBuffer
        CharSequence charSequence1 = new StringBuffer("charsequence instantiation using a StringBuffer");

        //instantiation using a StringBuilder
        CharSequence charSequence2 = new StringBuilder("charsquence instantiation using a StringBuilder");

        System.out.println("string is a " + string + "\ncharSequence is a " + charSequence);

    }
}

