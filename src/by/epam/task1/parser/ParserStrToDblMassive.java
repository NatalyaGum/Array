package by.epam.task1.parser;

import by.epam.task1.validator.ValidatorOfNumber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserStrToDblMassive {

    public double[] parseAllLines(List<String> path) throws IOException {

        List<Double> listOfDouble = new ArrayList<Double>();

        if (!path.isEmpty()) {
            for (String lineFromFile : path) {
                if (ValidatorOfNumber.validate(lineFromFile)) {
                    Double temp = Double.parseDouble(lineFromFile);
                    listOfDouble.add(temp);

                } else {
                    System.out.println("Validaion was failed for: " + lineFromFile);
                }
            }
        }

        double[] arr = listOfDouble.stream().mapToDouble(Double::doubleValue).toArray();

        return arr;


    }
}




