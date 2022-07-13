package com.utils.practice.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToArray {

    public static void main(String[] args) {
        String list = "001002003004005";
        List<String> items = new ArrayList<>();
        for (int i = 0; i < list.length(); i++) {
            if (!StringUtils.isEmpty(list)) {
                    items.add(getSubString(list, i++, 3));



            }
        }

        System.out.println(items);



}
