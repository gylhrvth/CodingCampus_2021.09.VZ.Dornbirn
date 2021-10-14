package Stjepan.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stweek5day2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stjepan\\Training\\textfile.txt";
//        flipedLinesAll(path);
        flipLines(path);

    }

    public static void flipLines(String path) {
        String[] flipedLines = new String[countLines(path)];
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            int i = 0;
            while (sc.hasNextLine()) {
                flipedLines[i] = sc.nextLine();
                i++;

            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        for (int i = flipedLines.length - 1; i >= 0; i--) {
            System.out.println(flipedLines[i]);
        }
    }

    public static int countLines(String path) {
        int getLineCount = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                getLineCount++;
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return getLineCount;
    }

    public static void flipedLinesAll(String path) {
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

        for (int i = flippedLines.length - 1; i >= 0; i--) {
            for (int j = flippedLines[i].length() - 1; j >= 0; j--) {

                System.out.print(flippedLines[i].charAt(j));
            }

            System.out.println();
        }
    }
}