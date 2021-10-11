package Mahir.Week4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Locale;

public class Day4StringManipulation {
    public static void main(String[] args) {
        String toAnalyze = Aufgabe1.TEXT_TO_ANALYZE;
        String toAnalyze2 = Aufgabe1.TEXT_TO_ANALYSE_2;
        String toAnalyze3 = Aufgabe1.TEXT_TO_ANALYSE_3;
        String toAnalyze4 = Aufgabe1.TEXT_TO_ANALYSE_4;


        //zähle alle Wörter
        countWords(toAnalyze);
        System.out.println();

        //zähle alle Zeillen
        countLines(toAnalyze);
        System.out.println();

        //Ersetze jedes "Freisebad" durch "___"
        replace2Strings(toAnalyze, "Freisebad", "_______");
        System.out.println();

        //Ersetze jedes "ist, und, oder" durch "___"
        replaceWithRegex(toAnalyze, "[Ii]st|[Uu]nd|[Oo]der", "____");
        System.out.println();

        //Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen
        replaceWithScanner(toAnalyze);
        System.out.println();

        //Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus
        //Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.
        countSpecilaCharakters(toAnalyze);
        System.out.println();

        //Siehe 6), beschränke dich aber nun auf das Alphabet
        countLetters(toAnalyze);
        System.out.println();

        //Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4
        countSpecilaCharakters(toAnalyze2);
        System.out.println();
        countSpecilaCharakters(toAnalyze3);
        System.out.println();
        countSpecilaCharakters(toAnalyze4);
        System.out.println();
        countLetters(toAnalyze2);
        System.out.println();
        countLetters(toAnalyze3);
        System.out.println();
        countLetters(toAnalyze4);
    }

    private static void countLetters(String text) {
        System.out.println("\u001B[36m" + "set of letters in the text" + "\u001B[0m");
        char[] letters = text.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 97; i <= 122; i++) {
            int counter = 0;
            for (int j = 0; j < letters.length; j++) {
                if (i == letters[j]) {
                    counter++;
                }

            }
            System.out.println(" The letter '" + (char) i + "' is " + counter + " times in the text ");
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

    private static void replaceWithScanner(String text) {
        System.out.println("\u001B[36m" + "Write what you want to replace with \"___\"" + "\u001B[0m");
        System.out.println();
        replace2Strings(text, scanner(), "___");

    }

    private static String scanner() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String text = scanner.nextLine();
        return text;

    }

    private static void replaceWithRegex(String text, String regexToReplace, String place) {
        System.out.println("All " + regexToReplace + " are replaced with " + place);
        System.out.println(text.replaceAll(regexToReplace, place));
    }

    private static void replace2Strings(String text, String toReplace, String place) {
        System.out.println("All " + toReplace + " are replaced with " + place);
        System.out.println(text.replace(toReplace, place));

    }

    private static void countWords(String text) {
        System.out.println("The text has " + text.split(" ").length + " words");
    }

    private static void countLines(String text) {
        System.out.println("The text has " + (text.split("\\n").length / 2 + 1) + " lines");
    }
}
