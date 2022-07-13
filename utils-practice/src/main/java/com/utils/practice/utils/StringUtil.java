package com.utils.practice.utils;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.SPACE;

public class StringUtil {

    StringUtil() {}

    public static String getName(String fullName) {
        String myName = null;
        if(StringUtils.isNotBlank(fullName)) {
            String[] names = fullName.split(" ");
            String firstName = names[0];
            String lastName = names.length > 1 ? names[names.length - 1] : EMPTY;

            myName = StringUtils.truncate(StringUtils.join(new String[] {firstName, lastName}, SPACE).trim(), 20);

            /**
             * OR
             * myName = StringUtils.join(new String[] {firstName, lastName}, SPACE);
             */
        }
        return myName;
    }



}
