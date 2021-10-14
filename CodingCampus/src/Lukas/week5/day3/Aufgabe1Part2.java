package Lukas.week5.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe1Part2 {
    public static void main(String[] args) {
        String path = "assets/file.txt";

        String text = readFileToString(path);

        if (text == null) {
            System.out.println("File konnte nicht gelesen werden...");
        } else {
            printCharacterOccurences(text);
        }
    }

    private static void printCharacterOccurences(String text) {
        char[] characters = text.toLowerCase().toCharArray();

        int[] characterTable = new int[255];

        int unknownCharacters = 0;

        for (int i = 0; i < characters.length; i++) {
            char myAsciiChar = characters[i];

            if (myAsciiChar < characterTable.length) {
                characterTable[myAsciiChar]++;
            } else {
                unknownCharacters++;
                System.out.println("Unkown chars: "+myAsciiChar);
            }
        }

        double overallPercentage = 0;

        for (int i = 0; i < characterTable.length; i++) {
            int occurrences = characterTable[i];

            if (occurrences > 0) {
                double percentage = 100.0 / (characters.length - unknownCharacters) * occurrences;
                overallPercentage += percentage;
                System.out.printf("Char: " + ((char) i) + " %.2f%s\n", percentage, "%");
            }
        }
        System.out.println("Gesamtprozent: " + overallPercentage);
        System.out.println("Unbekannte Buchstaben: " + unknownCharacters);

    }

    private static String readFileToString(String path) {
        try {
            StringBuilder builder = new StringBuilder();
            File f = new File(path);
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return builder.toString();
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
        return null;
    }
}
