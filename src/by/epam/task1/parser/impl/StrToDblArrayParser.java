package by.epam.task1.parser.impl;

import by.epam.task1.exception.ArrayException;
import by.epam.task1.validator.impl.NumberValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrToDblArrayParser {
    static Logger logger = LogManager.getLogger();

    public double[] parseAllLines(List<String> lineFromFile) throws ArrayException {
        NumberValidator validator = new NumberValidator();
        List<Double> listOfDouble = new ArrayList<Double>();

        if (!lineFromFile.isEmpty()) {
            for (String dblFromFile : lineFromFile) {
                if (validator.validate(dblFromFile)) {
                    Double temp = Double.parseDouble(dblFromFile);
                    listOfDouble.add(temp);

                } else {
                    logger.info("Validaion was failed for: " + dblFromFile);

                }
            }
        }
        //make from List<Double> to double[]
        Object[] arrayD = listOfDouble.toArray();
        double[] dblArray = new double[arrayD.length];  //= listOfDouble.stream().mapToDouble(Double::doubleValue).toArray();
        for (int i = 0; i < arrayD.length; i++) {
            dblArray[i] = (double) arrayD[i];
        }
        if (dblArray.length < 1) {
            logger.info("Empty Array " + Arrays.toString(dblArray));
            throw new ArrayException("Empty Array ");
        }
        if (dblArray.length <= 2) {
            logger.info("Small array " + Arrays.toString(dblArray));
        }
        return dblArray;


    }
}




