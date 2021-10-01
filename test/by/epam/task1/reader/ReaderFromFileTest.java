package by.epam.task1.reader;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReaderFromFileTest {

    @Test
    public void testReadFile() throws IOException {
        String pathToFile = "./src/by/epam/task1/resources/test.txt";
        List<String> lineFromFile = new ArrayList<String>();
        ReaderFromFile reader = new ReaderFromFile();
        List<String> listOfDouble = reader.readFile("./src/by/epam/task1/resources/file.txt");
        // Assert.assertEquals(actual,expected);
    }
}