package Danny.Woche5.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
 * Verwende dazu die Datei assets/file.txt (new File("assets/file.txt")). Kopiere Sie an einen Ort deiner Wahl.
 *
 * <strong>Erstelle für folgende Aufgaben jeweils eine Methode mit sinnvollem Namen und Rückgabewert!!!</strong>
 * <ol>
 *     <li>Wieviele Wörter enthält der Text</li>
 *     <li>Zähle die Zeichen und gib deren Häufigkeit in Bezug auf die Gesamtanzahl der Zeichen aus</li>
 *
 *     <li>Sortiere die Wörter des Texts und gib dannach den Text aus (sei kreativ) [Mit Bubblesort]</li>
 *     <li>Sortiere die Wörter der Länge nach [Mit Bubblesort]</li>
 * </ol>
 */
public class Aufgabe1_Einlesen_einer_Datei {
    public static void main(String[] args) {
//        h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
// * Verwende dazu die Datei assets/file.txt (new File("assets/file.txt")). Kopiere Sie an einen Ort deiner Wahl.
        File file = new File("C:\\Users\\dan\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");
        // String test = "[Kes 56 i oki n&";
        //System.out.println();
        //System.out.println(createFile(file));
        //countWords(createFile(file));
        countChars(file);
    }

    // Chars Anzahl im String mit Bezug zur Gesammtanzahl
    public static void countChars(File file) {
        StringBuilder stringBuilder2 = new StringBuilder();
        try {
            Scanner myScanner = new Scanner(file);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                stringBuilder2.append(data)
                        .append(System.lineSeparator());
            }
            myScanner.close();
        } catch (FileNotFoundException fn) {
            System.out.println("Error");
            fn.printStackTrace();
        }
        String sB = stringBuilder2.toString().toLowerCase();
        char[] sBChar = sB.toCharArray();

        int[] asccII = new int[255];
        int unknownCharacters = 0;

        for (char myASCIIChar : sBChar) {
            if (myASCIIChar < asccII.length) {
                asccII[myASCIIChar]++;
            } else {
                unknownCharacters++;
                System.out.println("Unkown chars: " + myASCIIChar);
            }
        }

        double overallPercent = 0;

        for (int j = 0; j < asccII.length; j++) {
            int occurrences = asccII[j];
            if (occurrences > 0) {
                double percent = 100.0 / (sBChar.length - unknownCharacters) * occurrences;
                overallPercent += percent;
                System.out.printf("Char " + ((char) j) + " %.2f%s\n", percent, "%");
            }
        }
        System.out.println("Gesamtprozent: " + overallPercent);
        System.out.println("Unbekannte Buchstaben: " + unknownCharacters);
    }


    //    <li>Wieviele Wörter enthält der Text</li>
    public static void countWords(String text) {
        //System.out.println(text);
        int counter = 0;
        String textRep = text.replaceAll(",|\\.|\\[|\t|/|-|„|“|®|\u00AD|:" + "\n", " ").toLowerCase();
        String[] countWords = textRep.split(" +");
        for (String name : countWords) {
            if (name.matches("[a-z]+")) {
                counter++;
            }
        }
        System.out.print(Arrays.toString(countWords));
        System.out.println();
        System.out.println(counter);
    }


    //    h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
    public static String createFile(File file) {

        try {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringBuilder
                        .append(data)
                        .append(System.lineSeparator());

            }
            myReader.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException f) {
            System.out.println("Error");
            f.printStackTrace();
        }
        return "";
    }
}


