package by.epam.task1.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFile {
    static Logger logger = LogManager.getLogger();

    public List<String> readFile(String pathToFile) throws IOException {

    List<String> lineFromFile = new ArrayList<String>();

        try (
    BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile), StandardCharsets.UTF_8))) {
        String line;

        while ((line = reader.readLine()) != null) {
            lineFromFile.add(line);   }}
        return lineFromFile;}}

    /*public static double[] readFile(String pathToFile) throws IOException {

            InputStream is = new FileInputStream(pathToFile);
            DataInputStream dis = new DataInputStream(is);
            DataInputStream dis2 = new DataInputStream(is);
            double[] arr = new double[1000];
            int i = 0;
            while ((dis2.available() > 0)) {
                arr[i] = dis.readDouble();
                i++;
            }
            logger.info("All Array: " + Arrays.toString(arr));
            return arr;
    }*/


