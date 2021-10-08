package by.epam.task1.validator;

public interface NumberValidatorInterface {
    public static final String NUMBER_REX = "(\\-|\\+)?\\d+(\\.\\d+)?";
    public boolean validate(String parameter);
}
