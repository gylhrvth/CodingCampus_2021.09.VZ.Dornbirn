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
public class Aufgabe1_Einlesen_einer_Datei {
    public static void main(String[] args) {
//        h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
// * Verwende dazu die Datei assets/file.txt (new File("assets/file.txt")). Kopiere Sie an einen Ort deiner Wahl.
        File file = new File("C:\\Users\\dan\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");

        System.out.println();
        System.out.println(createFile(file));
       // countWords(createFile(file));

    }

    //    <li>Wieviele Wörter enthält der Text</li>

    public static  void countWords(StringBuilder stringBuilder){
        String newStringBuilder = stringBuilder.toString();
        String[] countWords = newStringBuilder.split(" ");

        int wordCounter = 0;
        for (int i = 0; i < countWords.length; i++) {
            if(countWords[i].matches("[a-z]+")){
                wordCounter++;
                System.out.println(Arrays.toString(countWords));
            }
        }
        System.out.println(countWords);
    }





    //    h1>Einlesen und einer Datei und verarbeiten der Daten</h1>
    public static StringBuilder createFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }
        } catch (FileNotFoundException f) {
            System.out.println("Error");
            f.printStackTrace();
        }
        return stringBuilder;
    }
}


