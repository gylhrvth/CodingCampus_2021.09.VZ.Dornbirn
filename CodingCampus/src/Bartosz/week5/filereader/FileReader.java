package Bartosz.week5.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReader {
    public static String runFileReaderOneline(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            StringBuilder stringBuilder = new StringBuilder();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }

            myReader.close();
            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }   // version 1

    //---------------------------------------------------\\
    public static String reverseThisLine(String line) {
        char[] lineToReverse = line.toCharArray();

        char[] reversedLineArray = new char[lineToReverse.length];
        int counter = 0;
        while (counter < lineToReverse.length - 1) {
            for (int i = lineToReverse.length - 1; i < lineToReverse.length && i >= 0; i--) {
                reversedLineArray[counter] = lineToReverse[i];
                counter++;
            }

        }
        String updatedText = String.copyValueOf(reversedLineArray);
        return updatedText;
    }

    public static String runFileReaderEx1(String path) {

        try {       // Soll ausgeführt werden, wenn kein Fehler passiert.

            File f = new File(path);    // neue File mit Pfad
            Scanner sc = new Scanner(f);    // Scanner des Files

            while (sc.hasNextLine()) {       // Solange der Scanner eine Nächste Zeile findet
                String line = sc.nextLine();    // die Zeile in puffer speichern

                System.out.print(reverseThisLine(line));   // Ausgabe (umgedrehter Zeileninhalt (Puffer des Scanners))
                System.out.println();
            }
            sc.close(); // Scanner schließen, sobald keine neue Zeile eingelesen wird

        } catch (FileNotFoundException FileNotFoundException) {  // Wenn ein Fehler innerhalb von "try" passiert wird der codeblock innerhalb von catch ausgeführt
            FileNotFoundException.printStackTrace();
        }
        return "";
    }

    //----------------------------------------------------\\
    public static void runFileReaderEx2(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            int counter = 0;
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                counter++;
            }


            sc.close();
        } catch (FileNotFoundException FileNotFoundException) {  // Wenn ein Fehler innerhalb von "try" passiert wird der codeblock innerhalb von catch ausgeführt
            FileNotFoundException.printStackTrace();
        }
    }

    public static int countLines(String line) {
        String text = line.replaceAll("(?m)^\\s+$", "");
        int linesCount = 0;
        if (line.contains("\n")) {
            linesCount++;
        }

        return linesCount;
    }

    //-------------------------------------------\\
}
