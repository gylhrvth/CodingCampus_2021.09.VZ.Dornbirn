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
 *     <li>Sortiere die Wörter des Texts und gib dannach den Text aus (sei kreativ) [Mit Bubblesort]</li>
 *     <li>Sortiere die Wörter der Länge nach [Mit Bubblesort]</li>
 * </ol>
 */
public class Aufgabe1_Einlesen_einer_DateiMitChar {
    public static void main(String[] args) {
//        h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
// * Verwende dazu die Datei assets/file.txt (new File("assets/file.txt")). Kopiere Sie an einen Ort deiner Wahl.
        File file = new File("C:\\Users\\dan\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");
        // String test = "[Kes 56 i oki n&";
        System.out.println();
        //System.out.println(createFile(file));
        countWords(createFile(file));

    }

    //    <li>Wieviele Wörter enthält der Text</li>

    public static void countWords(String text) {
        //System.out.println(text);

       String textLower = text.toLowerCase();
        char[] textChar = textLower.toCharArray();
        char[] onlyLetters = new char[textChar.length];
        for (int i = 0; i < textChar.length;i++) {
            if(textChar[i] >= 97 && textChar[i] <= 122 || textChar[i] == 32) {
                onlyLetters[i] = textChar[i];
            }
        }
        
        System.out.println(onlyLetters.toString());
        int counter = 0;
        String textRep = onlyLetters.toString();
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


