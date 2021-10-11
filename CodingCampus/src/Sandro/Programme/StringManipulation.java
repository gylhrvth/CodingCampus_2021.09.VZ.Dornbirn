package Sandro.Programme;

import Lukas.week4.day4.Aufgabe1;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringManipulation {
    public static void main(String[] args) {


/**
 * <h1>Textanalyse</h1>
 * <br>Verschiedene Aufgaben zur Stringmanipulation und Analyse.
 * <br>Verwende dazu die Konstante TEXT_TO_ANALYSE dieser Klasse als Ausgangspunkt.
 * <br><strong>Arbeite wo du es als sinnvoll erachtest mit "lower case"</strong>
 * <br><strong>Verwende für alles nötige und sinnvolle eigene Methoden! Mindestens für jede Aufgabe eine eigene.</strong>
 * <br><strong>Mach die Methoden nun private, nichtmehr public.</strong>
 * <ol>
 *    <li>Zähle alle Wörter und gib diese aus.</li>
 *    <li>Zähle alle Zeilen und gib diese aus.</li>
 *    <li>Ersetze jedes Freisebad durch ___ und gib den Text aus</li>
 *    <li>Ersetze jedes "ist, und, oder" durch ___ und gib den Text aus, verwende dazu einen Regulären Ausdruck</li>
 *    <li>Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen und gib den Text aus.
 *    <br>Die Eingabe soll einzeilig erfolgen, z.b.: Haus,Maus,raus
 *    </li>
 *    <li>Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus.
 *    <br>Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.
 *    <li>Siehe 6), beschränke dich aber nun auf das Alphabet</li>
 *    <li>Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4
 *    <br>Gibt es einen unterschied zwischen den deutschen und den englischen Texten?
 *    </li>
 * </ol>
 */

        String text = Aufgabe1.TEXT_TO_ANALYZE;
        countAllWords(text);
        countAllLine(text);
        System.out.println(text.replaceAll("Freisebad", "___") + "\n\n\n");
        System.out.println(text.replaceAll("ist|und|oder", "___") + "\n\n\n");
        scanOneWordAndReplace(text);
        scanMoreWordsAndReplace(text);
        countSymbols(text);
    }

    public static void countAllWords(String text) {
        StringTokenizer sT1 = new StringTokenizer(text);
        System.out.println("\n" + "Die Anzahl aller Wörter des Textes beträgt: " + sT1.countTokens() + "\n");
    }

    public static void countAllLine(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        int lines1 = lines.length / 2;
        System.out.println("Die Anzahl der Zeilen des Textes beträgt: " + Math.ceil(lines1) + "\n");
    }

    public static void scanOneWordAndReplace(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort oder Zahl ein, dass anschließend durch ___ ersetzt werden soll:");
        String word = scanner.nextLine();
        System.out.println();
        System.out.println(text.replaceAll(word, "___"));
        System.out.println("\n" + "\u001B[31m" + "Sie haben die Wörter (Heilanstalt durch ___ ersetzt)" + "\u001B[0m" + "\n\n\n");
    }

    public static void scanMoreWordsAndReplace(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Bitte geben Sie drei Wörter oder Zahlen ein, die anschließend durch ___ ersetzt werden soll:");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        System.out.println("\n" + text
                .replaceAll(word1, "___")
                .replaceAll(word2, "___")
                .replaceAll(word3, "___") + "\n");

        System.out.println("\u001B[31m" + "Sie haben die Wörter " + word1 + ", " + word2 + ", " + word3 + "durch ___ ersetzt)" + "\u001B[0m" + "\n\n");
    }

    public static void countSymbols(String text) {
        char[] letters = text.toLowerCase(Locale.ROOT).toCharArray();
        int countera = 0;
        int counterb = 0;
        int counterc = 0;
        int counterd = 0;
        int countere = 0;
        int counterf = 0;
        for (int j = 0; j < text.length(); j++) {
            if (letters[j] == ':')
                countera++;
            if (letters[j] == '.')
                counterb++;
            if (letters[j] == '-')
                counterc++;
            if (letters[j] == ',')
                counterd++;
            if (letters[j] == ':')
                countere++;
            if (letters[j] == '´')
                counterf++;
        }
        System.out.println("Zeichen : kommt " + countera + " mal vor" + "\n" + "Zeichen . kommt " + counterb + " mal vor " + "\n" + "Zeichen - kommt " + counterc + " mal vor " + "\n" + "Zeichen , kommt " + counterd + " mal vor " + "\n" + "Zeichen : kommt " + countere + " mal vor ");
    }
}
