package com.utils.practice.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    String[] codes = convertToArray(list, 3);
    List<String> codeList = Arrays.asList(codes);
        codeList.stream().map(c -> convertToArray(c, 3)).collect(Collectors.toList());
    codes = convertToArray(list, 3);
        System.out.println("2. " + Arrays.asList(codes));
}

    public static String[] convertToArray(String code, int length) {
        int i;
        List<String> items = new ArrayList<>();
        for (i = 0; i < code.length(); i++) {
            if (!StringUtils.isEmpty(code)) {
                items.add(getSubString(code, i++, length));
                return items.toArray(new String[i]);
            }

        }
        return items.toArray(new String[i]);
    }

    private static String getSubString(String myString, int start, int length) {
        return myString.substring(start, Math.min(start + length, myString.length()));
    }



}
