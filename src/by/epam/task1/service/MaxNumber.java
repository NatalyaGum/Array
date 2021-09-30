package by.epam.task1.service;

import by.epam.task1.array.Massiv;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxNumber {
    static Logger logger = LogManager.getLogger();

    public static double findMax(Massiv massiv) {

        double[] m = massiv.getArr();
        double max = m[0];
        if (m.length < 2) {
            logger.info("There is only one number in Massiv " + m);
        }

        for (double i : m) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}





