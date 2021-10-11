package Gerhard.week4;

import Lukas.week4.day4.Aufgabe1;

import java.lang.module.FindException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exerciseDay4 {


    public static void main(String[] args) {
        System.out.println("\u001B[36m" + "Anzahl der Wörter im Text:" + "\u001B[0m");
        wordCount();
        System.out.println();
        System.out.println("\u001B[36m" + "Anzahl der Zeilen im Text:" + "\u001B[0m");
        lineCount();
        System.out.println();
        System.out.println("\u001B[36m" + "Text mit Replacement ___ iso Freisebad:" + "\u001B[0m");
        replaceText();
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Text mit Replacement ___ iso ist, und, oder:" + "\u001B[0m");
        replaceTextzwei();
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Text mit Eingabe und Replacement:" + "\u001B[0m");
        replaceWithTxtInput();

    }


    //Zähle alle Wörter und gib diese aus

    private static void wordCount() {
        String Text = Aufgabe1.TEXT_TO_ANALYZE;
        String[] firstArray = Text.split(" ");
        System.out.println(firstArray.length);
    }

    //Zähle alle Zeilen und gib diese aus.</li>
    private static void lineCount() {
        String str = Aufgabe1.TEXT_TO_ANALYZE;
        String[] lines = str.split("\r\n|\r|\n");
        System.out.println(lines.length);

    }

    //Ersetze jedes Freisebad durch ___ und gib den Text aus
    private static void replaceText() {
        String i = Aufgabe1.TEXT_TO_ANALYZE;
        i = i.replace("Freisebad", "___");
        System.out.print(i);
    }


    //Ersetze jedes "ist, und, oder" durch ___ und gib den Text aus, verwende dazu einen Regulären Ausdruck
    private static void replaceTextzwei() {
        String i = Aufgabe1.TEXT_TO_ANALYZE;
        i = i.replaceAll("ist|und|oder", "___");
        System.out.print(i);

    }

    //Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen und gib den Text aus.
//Die Eingabe soll einzeilig erfolgen, z.b.: Haus,Maus,raus

    private static void replaceWithTxtInput() {
        System.out.println("Bitte geben Sie einen Text ein (Wörter durchg Beistrich getrennt:");
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.next();
        // textInput = textInput.replace("[a-z]", "-");
        //  System.out.println(textInput);
        String[] textToArray = textInput.split(" ");
        for (int index = 0; index < textToArray.length; index++) {
            textToArray[index] = textToArray[index].replace(textToArray[index], "___");
        }
        System.out.println(Arrays.toString(textToArray));

    }
}

//textprintcolour




//Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus.


//Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus, beschränke dich aber nun auf das Alphabet


//Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4


//Gibt es einen unterschied zwischen den deutschen und den englischen Texten?
//
//

