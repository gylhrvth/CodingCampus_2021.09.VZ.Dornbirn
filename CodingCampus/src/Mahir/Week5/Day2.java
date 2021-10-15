package Mahir.Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";
/*
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Aufgabe 1 ");
                reverseText(line);

                //reverseWords(line);

            }
            scanner.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
*/
        task2ReverseLineOrder(path);
    }


    private static void reverseText(String txt) {
        String[] text = txt.split(" ");
        String tmp = "";
        for (int i = text.length - 1; i >= 0; i--) {
            tmp += text[i] + " ";

        }
        System.out.println(tmp);

    }

    private static void task2ReverseLineOrder(String path) {
        // Initialize
        String[] fileContent = new String[getLineCount(path)];

        // Fill the array
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            int idx = 0;
            while (myReader.hasNextLine()) {
                fileContent[idx] = myReader.nextLine();
                ++idx;
            }
            myReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        // Logic
        for (int i = fileContent.length - 1; i >= 0; i--) {
            System.out.println(fileContent[i]);
        }
    }

    private static int getLineCount(String path) {
        int lineCount = 0;

        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                ++lineCount;
            }
            myReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return lineCount;
    }

}
