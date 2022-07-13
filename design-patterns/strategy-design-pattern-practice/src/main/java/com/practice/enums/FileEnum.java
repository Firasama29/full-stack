package com.practice.enums;

import com.practice.FileStrategy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public enum FileEnum {
    JSON("JSON"), XML("XML"), HTML("HTML");

    private FileEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    public static final Map<String, FileStrategy> VALUES = stream(values())
            .collect(Collectors.toMap(v -> v.getValue(), Function.identity()));

    private final String value;

}

