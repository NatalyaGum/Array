package by.epam.task1.validator.impl;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberValidatorTest {
    NumberValidator validator=new NumberValidator();

    @DataProvider(name = "testValidation")
    public Object[][] createData() {
        return new Object[][]{
                {"-1", true},
                {"1,8", false},
                {"k.lk", false},
                {"2.2", true}};
    }

    @Test(dataProvider = "testValidation")
    public void testValidate(String line, boolean expected) {
        boolean actual = validator.validate(line);
        Assert.assertEquals(actual, expected);

    }
}