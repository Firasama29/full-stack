package com.practice.model;

import com.practice.model.annotation.ValidateLanguage;

public class ProjectApp {

    @ValidateLanguage(message = "invalid language")
    private String name;

}
