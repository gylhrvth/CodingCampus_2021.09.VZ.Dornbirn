package Stefan.WeekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class textManipulation {
    public static void main(String[] args) {

        String path = "/Users/DCV/CodingCampus_2021.09.VZ.Dornbirn/CodingCampus/src/Stefan/FileReader/textTest";

        flipLines(path);

        //Dreht jede einzelne Zeile um vom Anfang bis Ende
//        try {
//            File f = new File(path);
//            Scanner sc = new Scanner(f);
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//
//
//                for (int i = line.length() - 1; i >= 0; i--) {
//                    System.out.print(line.charAt(i));
//
//                }
//                System.out.println();
//
//            }
//            sc.close();
//        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        }


        //Zählt die wieviel Zeilen im Text File sind
//        long l = System.currentTimeMillis(); // Systemzeit merken => Dauer berechnen!
//        try {
//            BufferedReader in = new BufferedReader(new FileReader(path));
//            int count = 0;
//            while ( in.readLine() != null ) {
//                count++;
//            }
//            System.out.println("Anzahl: " + count);
//            System.out.println("Dauer: " + (System.currentTimeMillis()-l)); // Dauer ausgeben.
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }

    //Zählt die wieviel Zeilen im Text File sind und speichert sie in counLines
    private static int countLines (String path) {
        int countLines = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                countLines++;

            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return countLines;
    }

    //Gibt die Text File von der letzten Zeil bis zur ersten aus
    private static void flipLines (String path) {
        String[] flippedLines = new String[countLines(path)];
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            int i = 0;
            while (sc.hasNextLine()) {
                flippedLines[i] = sc.nextLine();
                i++;
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        for (int i = flippedLines.length - 1; i >= 0 ; i--) {
            System.out.println(flippedLines[i]);
        }
    }

}
