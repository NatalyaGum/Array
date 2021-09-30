package by.epam.task1.main;

import by.epam.task1.array.Massiv;
import by.epam.task1.reader.ReaderFromFile;
import parser.ParserStrToDblMassive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

   /* double arr[]= ReaderFromFile.readFile("./src/by/epam/task1/resources/file.txt");
        double[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("./src/by/epam/task1/resources/file.txt")))
        {
            array = in.lines().mapToDouble(Double::parseDouble).toArray();
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }*/

      /*  try(FileReader fr = new FileReader("./src/by/epam/task1/resources/file.txt", StandardCharsets.UTF_8)) {
            int c;
// прочитать и вывести содержимое файла
            while ((c = fr.read()) != -1)
                System.out.print((char) c);
        } catch (IOException е) {
            System.out.println("Oшибкa ввода-вывода: " + е);
        }*/

        /*List<String> fileContent = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("./src/by/epam/task1/resources/file.txt"),StandardCharsets.UTF_8))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                fileContent.add(currentLine);
            }*/
 //System.out.println(fileContent);

            ReaderFromFile reader= new ReaderFromFile();
            ParserStrToDblMassive parser=new ParserStrToDblMassive();
        List<String> listOfDouble = reader.readFile("./src/by/epam/task1/resources/file.txt");
        List<Double> numbers = parser.parseAllLines(listOfDouble);
        double[] arr = numbers.stream().mapToDouble(Double::doubleValue).toArray();
        //Massiv arrOfDouble=parser.parseAllLines(listOfDouble);
        System.out.println(numbers);
        System.out.println(Arrays.toString(arr));
      //  List<Double> numbers = parser.parseAllLines(listOfDouble);


        //result = calc.addition(num1, num2);
        //result = calc.subtraction(num1, num2);
        //result = calc.multiplication(num1, num2);



        //(\-|\+)?\d+(\.\d+)?
        }}
