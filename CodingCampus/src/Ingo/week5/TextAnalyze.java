package Ingo.week5;

import Lukas.week4.day4.Aufgabe1;

public class TextAnalyze {
    public static void main(String[] args) {

        String text = Aufgabe1.TEXT_TO_ANALYZE;
        System.out.println(Aufgabe1.TEXT_TO_ANALYZE);

        System.out.println("-------------------------------------------");
        // alle Wörter im Text auslesen !!!
        String[] countWords = text.split("\\s+");
        System.out.println(text.length());
        System.out.println("-----------------------------------");
        // ganze Zeilen auslesen und zählen !!!
        int countLines = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                countLines++;
            }
        }
        System.out.println(countLines);
        System.out.println("------------------------");




    }
}
