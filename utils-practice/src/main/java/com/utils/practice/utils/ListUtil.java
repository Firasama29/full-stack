package com.utils.practice.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class ListUtil {

    private ListUtil() {}

    public static List<String> getList(String list) {
        List<String> items = new ArrayList<>();

        if(!list.isEmpty()) {
            items = Arrays.asList(list.split(""));
        }
        return items;
    }
}
