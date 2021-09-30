package by.epam.task1.service;


import by.epam.task1.array.Massiv;

public class SumOfElem {
    public static double findAverage(Massiv massiv) {
        double[] m = massiv.getArr();
        double sum = 0;
        for (double i : m) {
            sum += i;
        }
        return sum;
    }
}

