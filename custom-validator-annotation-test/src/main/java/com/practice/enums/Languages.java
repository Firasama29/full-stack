package com.practice.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.List;

public enum Languages {

    JAVA("java"),
    JAVASCRIPT("javascript"),
    C("C"),
    PYTHON("python");

    private String name;

    //constructor
    Languages(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public static final List<String> LANGUAGES = Arrays.asList(JAVA.getName(), JAVASCRIPT.getName(),
                                                               C.getName(), PYTHON.getName());

    @Override
    @JsonValue
    public String toString() {
        return name;
    }

}
