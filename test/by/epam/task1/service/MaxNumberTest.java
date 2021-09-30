package by.epam.task1.service;

import by.epam.task1.array.Massiv;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxNumberTest {

     double []arr=new double [] {1.1,2.2,3.3};
     Massiv massiv =  new Massiv(arr);


    @Test
    public void testFindMax() {
        double actual=MaxNumber.findMax(massiv);
        double expected=3.3;
        assertEquals(actual,expected);


    }
}