package com.practice;

public class JsonFile implements FileStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Content : ".concat(content));
        return "from JsonFile class";
    }
}
