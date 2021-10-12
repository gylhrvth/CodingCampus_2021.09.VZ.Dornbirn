package Ingo.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) {


        String path = "C:\\Users\\terra\\Desktop\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

        flipLines(path);

    }

    private static void flipLines(String path) {

        String[] flippedLines = new String[countLines(path)];


        try {
            File file = new File(path);
            Scanner myScan = new Scanner(file);

            int i = 0;
            while (myScan.hasNextLine()) {
                flippedLines[i] = myScan.nextLine();
                i++;
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.toString();
        }

        for (int i = flippedLines.length - 1; i >= 0; i--) {

            System.out.println(flippedLines[i]);
        }

    }

    private static int countLines(String path) {
        int countLines = 0;

        try {
            File file = new File(path);
            Scanner myScan = new Scanner(file);

            while (myScan.hasNextLine()) {
                String line = myScan.nextLine();
                countLines++;
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.toString();
        }
        return countLines;
    }

}
