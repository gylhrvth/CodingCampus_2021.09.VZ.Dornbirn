package Oemer.Week4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
      /*  Zähle alle Wörter und gib diese aus.</li>
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

       */
        String toAnalyze = Aufgabe1.TEXT_TO_ANALYZE;
        String[] words = toAnalyze.split(" ");
        System.out.println("Der Text hat " + words.length + " Wörter");


        String[] lines = toAnalyze.split("");
        System.out.println("Der Text hat " + words.length + " Zeilen");






    }


}
