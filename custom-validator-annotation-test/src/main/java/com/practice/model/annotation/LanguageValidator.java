package com.practice.model.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static com.practice.enums.Languages.LANGUAGES;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class LanguageValidator implements ConstraintValidator<ValidateLanguage, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isNotBlank(value) || LANGUAGES.contains(value);
    }
}
