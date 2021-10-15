package Bartosz.week5.day3Aufgaben.classes;

import java.util.Arrays;

public class InitClass {
    public static void initMenu(){
        System.out.println("-------------AufgabenMenu-------------");
        System.out.println("Grundvoraussetzung - einlesen des Textes aus Assets");
        String text = GetScannedFile.getScannedText();

        System.out.println("Es sind " + GetScannedFile.countWords(text) + " Worte im Text.");
        GetScannedFile.countChars(text);

        System.out.println("Sortiert nach Alphabet:");
        GetScannedFile.bubbleSortWords(text);

        System.out.println("Sortiert nach Wortlänge");
        GetScannedFile.bubbleSotLength(text);
    }
}
