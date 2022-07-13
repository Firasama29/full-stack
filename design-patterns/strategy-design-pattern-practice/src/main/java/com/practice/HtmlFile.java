package com.practice;

public class HtmlFile implements FileStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Content : ".concat(content));
        return "from HtmlFile";
    }
}
