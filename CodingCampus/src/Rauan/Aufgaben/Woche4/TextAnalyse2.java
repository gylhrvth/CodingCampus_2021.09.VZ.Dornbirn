package Rauan.Aufgaben.Woche4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Locale;
import java.util.Scanner;

public class TextAnalyse2 {
    public static void main(String[] args) {

        String toAnalyse = Aufgabe1.TEXT_TO_ANALYZE;
        String toAnalyse2 = Aufgabe1.TEXT_TO_ANALYSE_2;
        String toAnalyse3 = Aufgabe1.TEXT_TO_ANALYSE_3;
        String toAnalyse4 = Aufgabe1.TEXT_TO_ANALYSE_4;

        //count all words in text
        wordCount(toAnalyse);
        System.out.println();

        // count all line in Text
        lineCount(toAnalyse);
        System.out.println();

        //TOREPLACE ALL FREISEBAD WORDS IN TEXT DURCH SPACE___
        replacString(toAnalyse, "Freisebad", "_____");
        System.out.println();

        //TOREPLACED ALL IST;UND;ODER WITH ___ IN TEXT
        replaceWithRegex(toAnalyse, "|Ii|st,|Uu|nd,|Oo|der", "_____");
        System.out.println();

        //TOREPLACE DAS WORD; DES ICH WILL MIT ___
        replaceWithScanner(toAnalyse);
        System.out.println();

        //COUNT ALL LETTERS IN TEXT
        lettersCount(toAnalyse);
        System.out.println();

        //Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus
        //Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.
        countSpecilaCharakters(toAnalyse);
        System.out.println();

        //Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4
        countSpecilaCharakters(toAnalyse2);
        System.out.println();
        countSpecilaCharakters(toAnalyse3);
        System.out.println();
        countSpecilaCharakters(toAnalyse4);
        System.out.println();
        lettersCount(toAnalyse2);
        System.out.println();
        lettersCount(toAnalyse3);
        System.out.println();
        lettersCount(toAnalyse4);
        System.out.println();
    }

    private static void wordCount(String text) {
        System.out.println("\u001B[36m" + " The Text has " + text.split(" ").length + " Words." + "\u001B[36m");
    }

    private static void lineCount(String text) {
        System.out.println("\u001B[35m" + "The Text has " + text.split("\\n").length + " Line." + "\u001B[36m");
    }

    private static void replacString(String text, String toReplace, String place) {
        System.out.println("All " + toReplace + " are replaced with " + place);
        System.out.println(text.replace(toReplace, place));
    }

    private static void replaceWithRegex(String text, String regexToReplace, String place) {
        System.out.println("All " + regexToReplace + " are replaced with " + place);
        System.out.println(text.replaceAll(regexToReplace, place));
    }

    private static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    private static void replaceWithScanner(String text) {
        System.out.println("write waht do you want to replaced with \"___\"");
        System.out.println();
        replacString(text, scanner(), "___");
    }

    private static void lettersCount(String text) {
        System.out.println(" All letters in Text sind : ");
        char[] letters = text.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 97; i <= 122; i++) {
            int counter = 0;
            for (int j = 0; j < letters.length; j++) {
                if (i == letters[j]) {
                    counter++;
                }
            }
            System.out.println("The Letter '" + (char) i + "' is" + counter + "times in The text");
        }
    }

    private static double calculatePercent(double a, double b) {
        double calc = a * 100;
        return calc / b;
    }

    private static void countSpecilaCharakters(String text) {
        char[] csc = text.toCharArray();
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < csc.length; i++) {


            if (csc[i] == '.') {
                counter++;
            }
            if (csc[i] == '-') {
                counter2++;
            }
            if (csc[i] == ',') {
                counter3++;
            }

        }
        int allSpclChars = counter + counter2 + counter3;

        System.out.println("The text has " + allSpclChars + " specialchars");
        System.out.println("The text has " + counter + " times \".\" " + counter2 + " times \"-\" " + counter3 + " times \",\" ");
        System.out.println("The special chars are " + calculatePercent(allSpclChars, text.length()) + " % from the text");
    }

}
