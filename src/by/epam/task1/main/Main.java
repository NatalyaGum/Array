package by.epam.task1.main;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import by.epam.task1.reader.impl.ReaderFromFile;
import by.epam.task1.parser.impl.StrToDblArrayParser;
import by.epam.task1.service.impl.ArrayService;
import by.epam.task1.sorting.Impl.ArraySortig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws ArrayException {


        ReaderFromFile reader = new ReaderFromFile();
        StrToDblArrayParser parser = new StrToDblArrayParser();
        ArrayService service=new ArrayService();
        ArraySortig sorter=new ArraySortig();

        try {
            List<String> listOfDouble = reader.readFile("resources/file.txt");
            double[] lineFromFile = parser.parseAllLines(listOfDouble);

            logger.info("Array from file: " + Arrays.toString(lineFromFile));


            Massiv massiv = new Massiv(lineFromFile);
            double[] dblArray = massiv.getArray();
            logger.info("Array from file: " + Arrays.toString(dblArray));

            double num = service.findMax(massiv);
            logger.info("MaxNumber: " + num);

            num = service.findMin(massiv);
            logger.info("MinNumber: " + num);

            num = service.findAverage(massiv);
            logger.info("Average number of elements: " + num);

            service.change(massiv, 2, 2222214);
            //dblArray = massiv.getArray();
            logger.info("Array from file: " + massiv.toString());

            sorter.selectionSortFromSmall(massiv);
            sorter.bubbleSortfFromBig (massiv);
            sorter.shellSort(massiv);



        } catch (ArrayException e) {
            logger.error(e);
            e.printStackTrace();
        }


    }
}
