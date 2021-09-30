package by.epam.task1.service;

import by.epam.task1.array.Massiv;


public class CalcNegElmnt {


    public static int findNegative(Massiv massiv) {

        double[] m = massiv.getArr();
        int negative = 0;

        for (double i : m) {
            if (i > 0) {
                negative++;
            }

        }
        return negative;
    }
}

