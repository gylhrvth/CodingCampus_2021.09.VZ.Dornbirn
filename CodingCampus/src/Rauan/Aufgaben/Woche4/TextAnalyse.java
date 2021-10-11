package Rauan.Aufgaben.Woche4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TextAnalyse {
    private static String text;

    public static void main(String[] args) {
        allStringTasks();

    }

    private static void allStringTasks() {
        String text = Aufgabe1.TEXT_TO_ANALYZE;
        //count all words in text 1
        System.out.println(startColor() + "Count Words in String Text" + endColor());
        System.out.println(wordsCount(text));
        System.out.println();

        //COUNT ALL LINE IN TEXT
        System.out.println(startColor() + "Count all Lines in String text:" + endColor());
        System.out.println(lineeeCount(text));
        // line Count mit Method
        System.out.println(text.lines().count());
        System.out.println();

        //REPLACE ALL FREISEBADWORDS IN TEXT
        System.out.println(startColor() + "replace all freisebad Words in text" + endColor());
        replaceAllFreisebadWords(text);

        //REPLACE ALL ISTODERUND IN TEXT
        System.out.println(startColor() + " replace ist,oder,und durch ___ in Text:" + endColor());
        replaceAllIstOderUnd(text);
        System.out.println();

        //REPLACE COSTUM CONSOL INPUT IN TEXT
        System.out.println(startColor() + "Create a user input who changes the Words in the Text: " + endColor());
        replaceCostumConsolInput(text);

        //Count how often a Char repeat him self in the words 6 sixth Task
        System.out.println(startColor() + "Count how often a Char repeat him self in the Words and the average to the length: " + endColor());
        countHowOftenACharRepeatHisSelf(text);
        System.out.println();
    }

    private static int wordsCount(String text) {
        String[] countsWord = text.split("\\s+");
        return countsWord.length;
    }

    private static int lineeeCount(String text) {
        int countLines = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                countLines++;
            }
        }
        return countLines;
    }

    private static void replaceAllFreisebadWords(String text) {
        String replaceAllFreisebadWords = text.toLowerCase(Locale.ROOT).replaceAll("freisebad", "___");
        System.out.println(replaceAllFreisebadWords);
    }

    private static void replaceAllIstOderUnd(String text) {
        String replaceAllIstOderUnd = text.toLowerCase(Locale.ROOT)
                .replaceAll("ist", "___")
                .replaceAll("oder", "___")
                .replaceAll("und", "___");
        System.out.println(replaceAllIstOderUnd);
    }

    private static void replaceCostumConsolInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bitte geben sie welches wort, was du ersetzen will");
        String userConsolInput = scanner.nextLine();
        System.out.println("bitte geben sie welches wort oder zeichnen, was du ersetzen will");
        String userConsolCharecter = scanner.nextLine();

        String replaceUserCostum = text.toLowerCase(Locale.ROOT).replaceAll(userConsolInput, userConsolCharecter);
        System.out.println(replaceUserCostum);
    }
    private static void countHowOftenACharRepeatHisSelf(String text) {

        char[] charRepeatCounter = text.toLowerCase(Locale.ROOT).toCharArray();
        int[] characterPieces = new int[255];

        for (char character : charRepeatCounter) {
            int letterAscii = character - 'a';
            if (letterAscii >= 0 && letterAscii < characterPieces.length) {
                characterPieces[letterAscii]++;
            }
        }

        int characterCount = 0;
        for (int i = 0; i < characterPieces.length; i++) {
            characterCount = characterCount + characterPieces[i];
        }

        System.out.println("Es sind " + characterCount + " einzelne Buchstaben im Text");

        for (int i = 0; i < characterPieces.length; i++) {
            double percentage = ((double) characterPieces[i] / characterCount) * 100;
            if (characterPieces[i] != 0) {
                System.out.println("Es sind " + characterPieces[i] + " " + "'" + ((char) (i + 'a')) + "'" + " in diesem Text. Das sind " + Math.round(percentage * 100.00) / 100.00 + "% von allen Buchstaben.");
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


