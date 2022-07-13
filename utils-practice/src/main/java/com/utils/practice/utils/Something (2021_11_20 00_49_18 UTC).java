package com.utils.practice.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Something {
    public static void main(String[] args) {
        String code = "001002003004";

        String[] codes = convertToArray(code, 3);
        List<String> codeList = Arrays.asList(codes);
        codeList.stream().map(c -> convertToArray(c, 3)).collect(Collectors.toList());
            codes = convertToArray(code, 3);
            System.out.println(Arrays.asList(codes));
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
