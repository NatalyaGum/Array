package test.epam.task1.reader;

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
                lineFromFile.add(line);
            }
        }catch (FileNotFoundException e) {
            logger.error( "File was not found", e);
        }
        return lineFromFile;
    }
}




