package by.epam.task1.validator.impl;

import by.epam.task1.validator.NumberValidatorInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {


    public boolean validate(String line) {

        Pattern pattern = Pattern.compile(NumberValidatorInterface.NUMBER_REX);
        Matcher matcher = pattern.matcher(line);

        return matcher.matches();
    }
}
