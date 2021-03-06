package Eray.week4;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {
        //clear Method to call all String Tasks
        allStringTasks();


    }

    private static void allStringTasks() {
        String text = "C:\\Users\\terra\\Desktop\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Mahir\\Week5\\test.txt";

        //Count Words in String text 1 first Task
        System.out.println(startColor() + "Count Words in String text:" + endColor());
        System.out.println(wordCount(text));
        System.out.println();

        //Count all Lines in String text 2 second Task
        System.out.println(startColor() + "Count all Lines in String text:" + endColor());
        System.out.println(lineCount(text));
        //as well a Method to countLines
        System.out.println(text.lines().count());
        System.out.println();

        //Replace every each Freisebad with underLines ___ 3 third Task
        System.out.println(startColor() + "Replace every each Freisebad Word with underLines:" + endColor());
        replaceAllFreiseBadWords(text);
        System.out.println();

        //Replace every "ist und oder" with underLines ___ 4 fourth Task
        System.out.println(startColor() + "Replace every ist und oder with underLines: " + endColor());
        replaceAllIstUndOderWords(text);
        System.out.println();

        //Create a Programm who replaces every Console Input 5 fifth Task
        System.out.println(startColor() + "Create a user input who changes the Words in the Text: " + endColor());
        replaceCustomConsoleInput(text);
        System.out.println();

        //Count how often a Char repeat him self in the words 6 sixth Task
        System.out.println(startColor() + "Count how often a Char repeat him self in the Words and the average to the length: " + endColor());
        countHowOftenACharRepeatHisSelf(text);
        System.out.println();
    }

    private static int wordCount(String text) {
        String[] countWords = text.split("\\s+");
        return countWords.length;
    }

    private static int lineCount(String text) {
        int countLines = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                countLines++;
            }
        }
        return countLines;
    }

    private static void replaceAllFreiseBadWords(String text) {
        String newReplacedText = text.toLowerCase(Locale.ROOT).replaceAll("freisebad", "___");
        System.out.println(newReplacedText);
    }

    private static void replaceAllIstUndOderWords(String text) {
        String newReplacedText = text.toLowerCase(Locale.ROOT)
                .replaceAll("ist", "___")
                .replaceAll("und", "___")
                .replaceAll("oder", "___");

        System.out.println(newReplacedText);
    }

    private static void replaceCustomConsoleInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(startColor() + "Bitte gebe ein welches Wort du ersetzen willst im Text: " + endColor());
        String userConsoleInput = scanner.nextLine();
        System.out.println(startColor() + "Bitte gebe ein durch welches Zeichen oder Wort du es ersetzen willst: " + endColor());
        String userConsoleChangeCharacter = scanner.nextLine();

        String newReplacedCustomUserText = text.toLowerCase(Locale.ROOT).replaceAll(userConsoleInput, userConsoleChangeCharacter);
        System.out.println(newReplacedCustomUserText);
    }

    private static void countHowOftenACharRepeatHisSelf(String text) {

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


    private static String startColor() {
        String color = "\u001B[31m";
        return color;
    }

    private static String endColor() {
        String color = "\u001B[0m";
        return color;
    }
}



