package Bartosz.week5.day3Aufgaben.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeMap;

public class GetScannedFile {
    public static String getScannedText() {
        try {
            File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Bartosz\\week5\\day3Aufgaben\\Assets\\text-file.txt");
            Scanner scanner = new Scanner(file);

            StringBuilder esmeralda = new StringBuilder();
            while (scanner.hasNextLine()) {
                esmeralda
                        .append(scanner.nextLine())
                        .append(System.lineSeparator());
            }
            scanner.close();
            return esmeralda.toString();

        } catch (FileNotFoundException exc) {
            System.out.println("exc File not found");
            return "something went terribly wrong.";
        }
    }

    public static int countWords(String scannedText) {

        String[] tmp = scannedText.split("[\\s\n]");
        int wordsCounter = 0;
        for (int i = 0; i < tmp.length - 1; i++) {
            wordsCounter++;
        }
        return wordsCounter;
    }

    public static void countChars(String scannedText) {
        scannedText = scannedText.toLowerCase().replaceAll("\\n", "");
        int absoluteLength = scannedText.length();

        int[] counter = new int[255];
        char[] characters = scannedText.toCharArray();
        for (int i = 0; i < characters.length-1; i++) {
            System.out.println((int) characters[i]);
            int positionOfCharacterInAscii = characters[i];
            if (positionOfCharacterInAscii <= 255) {
                counter[positionOfCharacterInAscii]++;
            }
        }

        for (int i = 0; i < counter.length-1; i++) {
            if (counter[i] > 0) {
                System.out.println((char) i + ": " + counter[i] + " - Das entspricht : " + (counter[i] / (float) absoluteLength * 100) + "% des gesamt Textes.");
            }
        }

        System.out.println("Der Text ist " + absoluteLength + " Zeichen lang.");
        System.out.println("Daraus folgt, dass " + (float) absoluteLength / 100 + " 1% ist.");
    }

    public static void words(String scannedText) {
        String[] tmp = scannedText.split("[\\s\n]");


    }

    public static void bubbleSortWords(String scannedText) {
        scannedText = scannedText.replaceAll("[^A-Z^a-z^0-9 ]", " ");
        String[] scannedTextArray = scannedText.split("[\\s\\n]");

        for (int h = 0; h < scannedTextArray.length-1; h++) {
            for (int i = 0; i < scannedTextArray.length - h - 1; i++) {
                if (scannedTextArray[i].compareToIgnoreCase(scannedTextArray[h]) > 0 ){
                    String tmp = scannedTextArray[h];
                    scannedTextArray[h] = scannedTextArray[i];
                    scannedTextArray[i] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(scannedTextArray));

    }

    public static void bubbleSotLength(String scannedText) {
        scannedText = scannedText.replaceAll("[^A-Z^a-z^0-9]", " ");
        String[] scannedTextArray = scannedText.split("[\\s\\n]");

        for (int h = 0; h < scannedTextArray.length-1; h++) {
            for (int i = 0; i < scannedTextArray.length - h - 1; i++) {
                if (scannedTextArray[i].length() > (scannedTextArray[h]).length()){
                    String tmp = scannedTextArray[h];
                    scannedTextArray[h] = scannedTextArray[i];
                    scannedTextArray[i] = tmp;
                }
            }
        }

        String updatedText = Arrays.toString(scannedTextArray);
        updatedText = updatedText.replaceAll(".", "");

    }
}
