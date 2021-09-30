package by.epam.task1.service;

import by.epam.task1.array.Massiv;

public class Average {
    public static double findAverage(Massiv massiv) {
        double[] m = massiv.getArr();
        double average, sum = 0;


        for (double i : m) {
            sum += i;
        }
        average = sum / m.length;
        return average;
    }
}
