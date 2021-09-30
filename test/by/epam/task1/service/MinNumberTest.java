package by.epam.task1.service;

import org.testng.annotations.Test;
import by.epam.task1.array.Massiv;
import static org.testng.Assert.*;

public class MinNumberTest {
    double []arr=new double [] {1.1,2.2,3.3};
    Massiv massiv =  new Massiv(arr);
    @Test
    public void testFindMin() {
        double actual=MinNumber.findMin(massiv);
        double expected=1.1;
        assertEquals(actual,expected);
    }
}