package Plamena.week4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;
import java.util.Scanner;



public class TextAnalysis {
    public static void main(String[] args) {
        //Aufgabe1;
        String input = Aufgabe1.TEXT_TO_ANALYZE;


        // System.out.println("Number of words in text: " + wordsCount(input));
        // System.out.println("Number of rows in text: " + rowCount(input));
        // System.out.println("Text with replaced word: \n" + outputWithReplacedWord(input, "Freisebad", "\t"));
        // System.out.println("Text with replaces words: \n" + textWithReplacedWords(input, " ([uU]nd|[oO]der|[iI]st) ", " ___ "));
        // System.out.println(replaceWithUserInput(input));
        // printAllCharInfo(input);
         printAlphInfo(input);


    }

    public static void printAlphInfo(String input) {
        char[] inputCharacters = input.toLowerCase().toCharArray();
        int[] letters = new int[255];

        for (char character : inputCharacters) {
            int letterIdx = character - 'a';
            if (letterIdx >= 0 && letterIdx < letters.length) {
                letters[letterIdx]++;
            }
        }
        int lettersCount = 0;
        for (int i = 0; i < letters.length; i++) {
            lettersCount = lettersCount + letters[i];
        }

        System.out.println("There are " + lettersCount + " letters in this text.");

        for (int i = 0; i < letters.length; i++) {
            double percentage = ((double) letters[i] / lettersCount) * 100;
            if (letters[i] != 0)
                System.out.println("There are " + letters[i] + " " + "'" + ((char) (i + 'a')) + "'" + " in this text. That's " + Math.round(percentage * 100.0) / 100.0 + "% of all letters.");
        }
    }

    public static void printAllCharInfo(String input) {
        char[] inputCharacters = input.toLowerCase().toCharArray();
        int[] letters = new int['ü' - ' ' + 1];
        System.out.println("There are " + inputCharacters.length + " characters in this text.");


        for (char character : inputCharacters) {
            int letterIdx = character - ' ';
            if (letterIdx >= 0 && letterIdx < letters.length) {
                letters[letterIdx]++;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            double percentage = (double) letters[i] / inputCharacters.length * 100;
            if (letters[i] != 0)
                System.out.println("There are " + letters[i] + " " + "'" + ((char) (i + ' ')) + "'" + " in this text. That's " + Math.round(percentage * 100.0) / 100.0 + "% of all characters.");
        }
    }

    public static String replaceWithUserInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which words do you want to replace? Pay attention to correct spelling!");
        String userInput = sc.nextLine();
        String[] splittedInput = userInput.split("[,]");
        String[] wordsArray = input.split("[ ,.]");

        for (int iUserInput = 0; iUserInput < splittedInput.length; iUserInput++) {
            splittedInput[iUserInput] = splittedInput[iUserInput].trim();
            System.out.println("\"" +splittedInput[iUserInput]+ "\"");
        }

        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < splittedInput.length; j++) {
                input = input.replaceAll(" " + splittedInput[j] + " ", " ____ ");
            }
        }
        return input;

    }

    public static String textWithReplacedWords(String input, String regex, String replacement) {
        String output = input.replaceAll(regex, replacement);
        return output;
    }

    public static String outputWithReplacedWord(String input, String wordsToReplace, String replacement) {
        String output = input.replaceAll(wordsToReplace, replacement);
        return output;
    }

    public static int rowCount(String input) {
        String[] rowsArray = input.split("\\n");
        return rowsArray.length;
    }

    public static int wordsCount(String input) {
        input = input
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");

        String[] wordsArray = input.split("[ ]");

        return wordsArray.length;
    }
}
