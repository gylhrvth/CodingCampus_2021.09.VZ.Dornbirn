package Eray.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseTextString {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Eray\\week5\\FileReaderAndWriter\\testBook.txt";
       // flipWordsInLine(path);
        //flipLines(path);
        flipLinesWithWords(path);
    }


    //First Task
    private static void flipWordsInLine(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String testBook = sc.nextLine();
                char[] reverseLines = testBook.toCharArray();

                System.out.println(flipCharWords(reverseLines));
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }


    private static int countLines(String path) {
        int lineCounter = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String testBook = sc.nextLine();
                lineCounter++;

            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return lineCounter;
    }



    private static void flipLines(String path) {

        String[] changeLines = new String[countLines(path)];

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);


            int i = 0;
            while (sc.hasNextLine()) {
                changeLines[i] = sc.nextLine();

                ++i;
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


        for (int i = changeLines.length - 1; i >= 0; i--) {
            System.out.println(changeLines[i]);

        }

    }

    private static void flipLinesWithWords(String path) {

        String[] changeLines = new String[countLines(path)];

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);


            int i = 0;
            while (sc.hasNextLine()) {
                changeLines[i] = sc.nextLine();
                ++i;
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        for (int i = changeLines.length - 1; i >= 0; i--) {
            char[] reverseLines = changeLines[i].toCharArray();
            System.out.println(flipCharWords(reverseLines));
        }

    }


    private static char[] flipCharWords(char[] reverseLines){
        for (int i = 0; i < reverseLines.length / 2; i++) {
            char tmp = reverseLines[i];
            reverseLines[i] = reverseLines[reverseLines.length - i - 1];
            reverseLines[reverseLines.length - i - 1] = tmp;

        }
        return reverseLines;
    }
}
