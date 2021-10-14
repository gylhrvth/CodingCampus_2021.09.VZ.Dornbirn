package Eray.week5;

import Lukas.week5.day3.Aufgabe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class stringUebungen {
    public static void main(String[] args) {
        menuToPrintAllMethods();

    }

    private static void menuToPrintAllMethods() {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";

        //first Task
        System.out.println(startColor() + "Count Characters in Text" + endColor());
        // countCharMainMenu(path);
        System.out.println();

        //second Task
        System.out.println(startColor() + "Count Words in Text" + endColor());
        countWordsMainMenu(path);
        System.out.println();

        //third Task
        System.out.println(startColor() + "Count how often a char repeats and give the average out" + endColor());
        countCharsAndAverageMainMenu(path);
        System.out.println();

        //fourth Task
//        System.out.println(startColor() + "Sort All Words" + endColor());
//        sortAllWordsInTextMainMenu(path);
//        System.out.println();

        //fifth Task
//        System.out.println(startColor() + "Sort the Words lengthwise " + endColor());
//        sortAllWordsInTextMainMenuAfterWordLength(path);
//        System.out.println();

    }

    private static void sortAllWordsInTextMainMenuAfterWordLength(String path) {
        String text = fileReaderMainMenu(path);
        String[] sortedAfterLength = sortAllWordsInTextAfterWordLength(text);
        System.out.println(Arrays.toString(sortedAfterLength));
    }

    private static String[] sortAllWordsInTextAfterWordLength(String text) {
        text = text
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");

        String[] myOverallText = text.split(" ");

        for (int i = 0; i < myOverallText.length; i++) {
            for (int j = 0; j < myOverallText.length - j - 1; j++) {
                if (myOverallText[j].length() > myOverallText[j + 1].length()) {
                   swapBubbleSortWithTemp(myOverallText,j);
                }
            }
        }
        return myOverallText;

    }


    private static void sortAllWordsInTextMainMenu(String path) {
        String text = fileReaderMainMenu(path);
        System.out.println(Arrays.toString(sortAlphabetInText(text)));
    }

    private static String[] sortAlphabetInText(String text) {
        text = text
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");

        String[] myOverallText = text.split(" ");

        long comparisions = 0;
        long start = System.currentTimeMillis();


        for (int i = 0; i < myOverallText.length; i++) {
            for (int j = 0; j < myOverallText.length - 1 - i; j++) {
                comparisions++;
                if (myOverallText[j].compareTo(myOverallText[j + 1]) > 0) {
                    swapBubbleSortWithTemp(myOverallText, j);
                }
            }
        }
        long duration = System.currentTimeMillis() - start;
        float msPerComparision = duration / (float) comparisions;
        System.out.printf("Sorting took: %dms, comparisions: %d, ms/comparision: %f\n", duration, comparisions, msPerComparision);

        return myOverallText;
    }

    private static void swapBubbleSortWithTemp(String[] myOverallText, int j) {
        String tmp = myOverallText[j];
        myOverallText[j] = myOverallText[j + 1];
        myOverallText[j + 1] = tmp;
    }

    private static void countCharsAndAverageMainMenu(String path) {
        String text = fileReaderMainMenu(path);
        countCharsAndAverageInText(text);

    }

    private static void countCharsAndAverageInText(String text) {
        char[] characters = text.toLowerCase(Locale.ROOT).toCharArray();
        int[] characterTable = new int[255];

        for (int i = 0; i < characters.length; i++) {
            char myASCII = characters[i];
            if (myASCII < characterTable.length) {
                characterTable[myASCII]++;
            }
        }


        for (int i = 0; i < characterTable.length; i++) {
            int occurrences = characterTable[i];

            if (occurrences > 0) {
                double percentage = 100.0 / characters.length * occurrences;
                System.out.printf("Der Buchstabe " + ((char) i) + " kommt " + characterTable[i] + " mal vor. Das sind %.2f Prozent \n", percentage);
            }
        }

    }


    private static void countWordsMainMenu(String path) {
        String text = fileReaderMainMenu(path);
        int countWords = countWordsInText(text);
        System.out.println(countWords);

    }

    private static int countWordsInText(String text) {
        text = text
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");

        String[] allWordsInText = text.split("\s");
        return allWordsInText.length;
    }


    private static void countCharMainMenu(String path) {

        String text = fileReaderMainMenu(path);

        int howMuchChars = 0;
        howMuchChars += countCharInText(text);
        System.out.println("Es sind : " + howMuchChars + " Characters im Text!");

    }

    private static String fileReaderMainMenu(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();


            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            String text = sb.toString();
            return text;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return "";
    }


    private static int countCharInText(String text) {
        char[] everCharacterInText = text.toCharArray();
        return everCharacterInText.length;
    }

    private static String startColor() {
        return "\u001B[31m";
    }

    private static String endColor() {
        return "\u001B[0m";
    }


}
