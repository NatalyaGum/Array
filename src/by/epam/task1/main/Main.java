package by.epam.task1.main;

import by.epam.task1.array.Massiv;
import test.epam.task1.reader.ReaderFromFile;
import by.epam.task1.parser.ParserStrToDblMassive;
import by.epam.task1.service.Average;
import by.epam.task1.service.Exchange;
import by.epam.task1.service.MaxNumber;
import by.epam.task1.service.MinNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {


        ReaderFromFile reader = new ReaderFromFile();
        ParserStrToDblMassive parser = new ParserStrToDblMassive();
        List<String> listOfDouble = reader.readFile("./src/by/epam/task1/resources/file.txt");
        double[] arr = parser.parseAllLines(listOfDouble);

        logger.info("Array from file: " + Arrays.toString(arr));


        Massiv massiv = new Massiv(arr);
        double[] a = massiv.getArr();
        logger.info("Array from file: " + Arrays.toString(a));

        double d = MaxNumber.findMax(massiv);
        logger.info("MaxNumber: " + d);

        d = MinNumber.findMin(massiv);
        logger.info("MinNumber: " + d);

        d = Average.findAverage(massiv);
        logger.info("Average number of elements: " + d);

        Exchange.change(massiv, 2, 2222214);


    }
}
