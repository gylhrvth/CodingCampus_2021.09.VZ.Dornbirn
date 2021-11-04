package Mahir.strukturierteProgrammierung.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day4Filetasks {
    public static void main(String[] args) {

        String path = "assets/file.txt";
        String text = readFileToString(path);
        // countAllChars(text);
        // countAllWords(text);
        // sortTextAlphabetically(text);
        sortTextAlphabetically(text);

    }




    private static void sortTextAlphabetically(String textToSort) {


        String[] splitText = textToSort.split("\\s+");
        for (int i = 0; i < splitText.length; i++) {
            for (int j = 0; j < splitText.length  - 1; j++) {
                int result = splitText[j].compareTo(splitText[j + 1]);
                if (result > 0) {
                    String tmp = splitText[j + 1];
                    splitText[j + 1] = splitText[j];
                    splitText[j] = tmp;
                }

            }

        }

        
        
        System.out.println(Arrays.toString(splitText));

    }

    private static double percentageCalc(int toCalc, int maxValue) {
        return (double) toCalc * 100 / maxValue;

    }

    private static void countAllChars(String text) {
        char[] arr = text.toCharArray();
        for (int i = 0; i < 255; i++) {
            int counter = 0;
            for (int j = 0; j < text.length(); j++) {
                if (arr[j] == i) {
                    counter++;

                }

            }
            System.out.println("The char " + (char) i + " is " + counter + " times in the text  it makes "
                    + String.format("%.2f", percentageCalc(counter, arr.length)));

        }


    }

    private static void countAllWords(String textToCount) {
        String repText = textToCount.replaceAll("[0-9]|\\.[\n]", " ");
        String[] splitText = repText.split("\\s+");
        System.out.println("The text has " + splitText.length + " words");


    }

    private static String readFileToString(String path) {
        try {
            StringBuilder builder = new StringBuilder();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return builder.toString();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return null;
    }
}
