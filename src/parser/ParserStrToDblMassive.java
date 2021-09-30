package parser;

import by.epam.task1.array.Massiv;
import by.epam.task1.validator.ValidatorOfNumber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserStrToDblMassive {

    public List<Double> parseAllLines(List<String> path) throws IOException {

        List<Double> listOfDouble = new ArrayList<Double>();

        if (!path.isEmpty()) {
            for (String lineFromFile : path) {
                if (ValidatorOfNumber.validate(lineFromFile)) {
                    Double temp = Double.parseDouble(lineFromFile);
                    listOfDouble.add(temp);

                } else {
                    throw new IOException("Validaion was failed.");}}}


        // Massiv a= new Massiv((Double[]) listOfDouble.toArray());
                    return listOfDouble;


        }}




