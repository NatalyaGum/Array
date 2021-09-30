package by.epam.task1.service;

import by.epam.task1.array.Massiv;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinNumber {
    static Logger logger = LogManager.getLogger();

    public static double findMin(Massiv massiv) {
        double[] m = massiv.getArr();
        double min = m[0];
        if (m.length < 2) {
            logger.info("There is only one number in Massiv " + m);
        }
        for (double i : m) {
            if (i < min) {
                min = i;
            }

        }
        return min;
    }
}