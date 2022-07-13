package com.practice;

public class XmlFile implements FileStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Content : ".concat(content));
        return "from XmlFile";

    }
}
