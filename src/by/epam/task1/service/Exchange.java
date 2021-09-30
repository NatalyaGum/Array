package by.epam.task1.service;

import by.epam.task1.array.Massiv;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Exchange {
    static Logger logger = LogManager.getLogger();

    public static Massiv change(Massiv massiv, int i, double d) {

        double[] m = massiv.getArr();
        if (m.length < i) {
            logger.info("There is no index:" + i);
        }
        m[i] = d;
        logger.info("Exchange service" + Arrays.toString(m));
        return massiv;
    }


}
