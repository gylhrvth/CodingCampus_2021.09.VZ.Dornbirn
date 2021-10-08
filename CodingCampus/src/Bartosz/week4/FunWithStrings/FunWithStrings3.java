package Bartosz.week4.FunWithStrings;

import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class FunWithStrings3 {

    // Aufgabenstellung:
    //Lukas.week4.day4.Aufgabe1

    //------------------------------------------------Menu Methods---------------------------------------\\
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

    //Auswählen welche Aufgabe gemacht wird
    private static void decisionEx(String initText) {
        System.out.println("Aufgabenauswahl:");
        System.out.println("1) Zähle alle Wörter und gib diese aus.");
        System.out.println("2) Zähle alle Zeilen und gib diese aus");
        System.out.println("3) Ersetze jedes Freisebad durch ___ und gib den Text aus // beliebiges Wort");
        System.out.println("4) Ersetze jedes \"ist, und, oder\" durch ___ und gib den Text aus, verwende dazu einen Regulären Ausdruck");
        System.out.println("5) Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen und gib den Text aus.\n" + "Die Eingabe soll einzeilig erfolgen, z.b.: Haus,Maus,raus");
        System.out.println("6) Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus.");
        System.out.println("7) Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.");
        System.out.println("8) Siehe 6), beschränke dich aber nun auf das Alphabet");
        Scanner exerciseScanner = new Scanner(System.in);
        int exNr = exerciseScanner.nextInt();

        switch (exNr) {
            case 1 -> {
                // Aufgabe 1:
                int wordsCounter = countWords(initText);
                System.out.println("Der Text enthält " + wordsCounter + " Wörter");
            }

            case 2 -> {
                // Aufgabe 2:
                int rowsCounter = counterRows(initText);
                System.out.println("Der Text enthält " + rowsCounter + " Zeilen");
            }
            case 3 -> {
                // Aufgabe 3:
                printAndReplaceScanned(initText);
            }
            case 4 -> {
                // Aufgabe 4:
                System.out.println();
                printReplacedRegular(initText);
            }
            case 5 -> {
            }

            default -> {
                System.out.println("Diese Übung ist nicht vorhanden.");
            }
        }
    }

    // Wiederholungsmethode
    private static boolean repeat() {
        System.out.println("Wollen Sie wiederholen? (yes / y)");
        Scanner repeatProgram = new Scanner(System.in);
        String repeat = repeatProgram.next();
        boolean casusRepeat = true;

        if (repeat.equals("yes") || repeat.equals("y")) {
            casusRepeat = true;
        } else {
            casusRepeat = false;
        }

        return casusRepeat;
    }
//----------------------------------------------------------------------------------------------------//

    //------------------------------------Aufgaben Methods--------------------------------------------------\\
    // Aufgabe 1:
    private static int countWords(String importedText) {
        int wordsCounter = 0;
        importedText = importedText
                .replaceAll("[\\(\\):]*", "")
                .replaceAll("\n+", " ")
                .replaceAll("\\, ", " ")
                .replaceAll("\\. ", " ");
        String[] words = importedText.split(" ");
        System.out.println(Arrays.toString(words));
        for (int counter = 0; counter < words.length - 1; counter++) {
            wordsCounter++;
        }

        return wordsCounter;
    }

    // Aufgabe 2:
    private static int counterRows(String importedText) {
        int rowsCounter = 0;

        String[] rows = importedText.split("\\n");
        for (int counter = 0; counter < rows.length; counter++) {
            rowsCounter++;
        }

        return rowsCounter;
    }

    // Aufgabe 3:   ein Wort im Text ersetzen durch "___"
    private static void printAndReplaceScanned(String importedText) {
        System.out.println("Welches Wort möchten Sie ersetzen?");
        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.next();

        System.out.println(importedText.replaceAll(userInput, "___"));
    }

    // Aufgabe 4: Ersetzen von "ist, und, oder" mit regulären Ausdrücken
    private static void printReplacedRegular(String importedText) {
        System.out.println("Gemäß aufgabenstellung werden die Worte \" ist, und, oder \" durch ___ ersetzt");
        System.out.println(importedText.replaceAll("(I|i)st|(U|u)nd|(O|o)der", "___"));
    }

    // Aufgabe 5: Worte aus User input einlesen und ersetzen
    private static void replaceUserWords(String importedText) {
        System.out.println("Welches Wort möchten Sie ersetzen?");
        Scanner inputScanner = new Scanner(System.in);
        String userInputWord1 = inputScanner.next();
        String userInputWord2 = inputScanner.next();
        String userInputWord3 = inputScanner.next();

        // .nextline()

        System.out.println(importedText.
                replaceAll(userInputWord1, "___")
                .replaceAll(userInputWord2, "___")
                .replaceAll(userInputWord3, "___")
                .replaceAll("[/\\n]", "")
                .replaceAll("[\\(\\):]*", "")
                .replaceAll("\n+", " ")
                .replaceAll("\\, ", " ")
                .replaceAll("\\. ", " "));
    }

    // Aufgabe 6: Zeichen auszählen
    private static void countChars(String importedText) {
        for (int i = 0; i < importedText.length(); i++) {
            char importedTextArray = (char) importedText.indexOf(i);
        }

    }

//    public static void main(String args[]) {
//        String str;
//        int i, length, counter[] = new int[256];
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String");
//        str = scanner.nextLine();
//
//        length = str.length();
//
//        // Count frequency of every character and store
//        // it in counter array
//        for (i = 0; i < length; i++) {
//            counter[(int) str.charAt(i)]++;
//        }
//        // Print Frequency of characters
//        for (i = 0; i < 256; i++) {
//            if (counter[i] != 0) {
//                System.out.println((char) i + " --> " + counter[i]);
//            }
//        }
//    }


//----------------------------------------------------------------------------------------------------//

    public static void main(String[] args) {
        boolean run = true;

        while (run) {

            String initText = getInitText();
            //decisionEx(initText);

            replaceUserWords(initText);


            // Wiederholungsmethode
            run = repeat();
        }

    }

}
