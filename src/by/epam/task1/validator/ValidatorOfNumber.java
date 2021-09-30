package by.epam.task1.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorOfNumber {


    private static final String NUMBER_REX = "(\\-|\\+)?\\d+(\\.\\d+)?";

    public static boolean validate(String parameter) {

        Pattern pattern = Pattern.compile(NUMBER_REX);
        Matcher matcher = pattern.matcher(parameter);

        return matcher.matches();
    }
}
