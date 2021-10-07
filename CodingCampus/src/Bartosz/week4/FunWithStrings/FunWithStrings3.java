package Bartosz.week4.FunWithStrings;

import Lukas.week4.day4.Aufgabe1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class FunWithStrings3 {

    // Aufgabenstellung:
    //Lukas.week4.day4.Aufgabe1;


    // Auswählen welchen Text importieren, importierten Text weiterreichen
    private static String getInitText() {
        System.out.println("Welchen Text willst du analysieren?");
        System.out.println("1) Text 1");
        System.out.println("2) Text 2");
        System.out.println("3) Text 3");
        System.out.println("4) Text 4");

        Scanner textinput = new Scanner(System.in);
        int choseText = textinput.nextInt();

        String initText1 = Aufgabe1.TEXT_TO_ANALYZE;
        String initText2 = Aufgabe1.TEXT_TO_ANALYSE_2;
        String initText3 = Aufgabe1.TEXT_TO_ANALYSE_3;
        String initText4 = Aufgabe1.TEXT_TO_ANALYSE_4;

        String chosenText = "";
        switch (choseText) {
            case 1 -> {
                chosenText = initText1;
            }
            case 2 -> {
                chosenText = initText2;
            }
            case 3 -> {
                chosenText = initText3;
            }
            case 4 -> {
                chosenText = initText4;
            }
            default -> {
                System.out.println("Text nicht vorhanden");
            }
        }
        return chosenText;
    }

    // Wiederholungsmethode
    private static boolean repeat() {
        System.out.println("Wollen Sie wiederholen? (yes / y)");
        Scanner repeatProgram = new Scanner(System.in);
        String repeat = repeatProgram.next();
        boolean casusRepeat = true;

        if(repeat.equals("yes") || repeat.equals("y")) {
            casusRepeat = true;
        } else {
            casusRepeat = false;
        }

        return casusRepeat;
    }

    // Text in Array verwandeln und Anzahl
    private static int countWords(String importedText) {
        int wordsCounter = 0;

        String[] words = importedText.split(" ");
        for (int counter = 0; counter < words.length - 1; counter++) {
            wordsCounter++;
        }

        return wordsCounter;
    }

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            String initText = getInitText();

            // Aufgabe 1:
            int wordsCounter = countWords(initText);
            System.out.println("Der Text enthält " + wordsCounter + " Wörter");

            // Aufgabe 2:


            // wiederholen?
            run = repeat();
        }

    }

}
