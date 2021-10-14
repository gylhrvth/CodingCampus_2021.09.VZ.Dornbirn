package Sandro.Programme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class TextFileScanner {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

/*        reverse(path);*/
        flipLines(path);
    }

    public static void reverse(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                StringBuilder sb = new StringBuilder(line);
                System.out.println(sb.reverse());
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static int countLines(String path) {
        int counter = 0;

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                counter++;
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return counter;
    }

    public static void flipLines(String path) {

        String[] flippedLines = new String[countLines(path)];

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            int i = 0;
            while (sc.hasNextLine()) {
                flippedLines[i] = sc.nextLine();
                i++;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        for (int i = flippedLines.length - 1; i >= 0; i--) {
            System.out.println(flippedLines[i]);

        }
    }
}
