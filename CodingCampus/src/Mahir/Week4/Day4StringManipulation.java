package Mahir.Week4;

import Lukas.week4.day4.Aufgabe1;

public class Day4StringManipulation {
    public static void main(String[] args) {
        String toAnalyze = Aufgabe1.TEXT_TO_ANALYZE;
        String toAnalyze2 = Aufgabe1.TEXT_TO_ANALYSE_2;


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
        countSpecilaCharakters(toAnalyze);
        System.out.println();
    }

    private static void countSpecilaCharakters(String text) {
        char[] csc = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < csc.length; i++) {


            if (csc[i] == '.') {
                counter++;
            }
            if (csc[i] == '-') {
                counter++;
            }
            if (csc[i] == ',') {
                counter++;
            }

        }
        System.out.println(counter);


    }

    private static void replaceWithScanner(String text) {
        System.out.println("Write what you want to replace with \"___\"");
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
