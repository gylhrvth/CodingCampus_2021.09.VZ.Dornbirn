package Ingo.week5.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";

        countWords(path);
        countLines(path);

        try {
            File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");
            Scanner scanner = new Scanner(file);
            int wordCounter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                wordCounter++; // Alle zeilen im text zählen !!!


            }
            System.out.println(wordCounter);
            scanner.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        System.out.println();

    }

    public static void countWords(String text) {

        int counter = 0;
        try {
            File file = new File(text);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();


                line = line.replaceAll("[0-9]|\\.[\n]", " ");
                if (line.isEmpty()) {
                    continue;
                }
                String[] text1 = line.split("\\s+");

                counter += text1.length;

            }
            scanner.close();
            System.out.println(counter);

        } catch (FileNotFoundException fnfo) {
        }
    }

    public static void countLines(String text) {
        try {
            File file = new File(text);
            Scanner scanner = new Scanner(file);
            int lineCounter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                lineCounter++; // Alle zeilen im text zählen !!!

            }
            System.out.println(lineCounter);
            scanner.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static void countAllSpecialChars(String text) {
        char[] chars = text.toCharArray();

        try {
            File file = new File(text);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

            }

        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }
}
