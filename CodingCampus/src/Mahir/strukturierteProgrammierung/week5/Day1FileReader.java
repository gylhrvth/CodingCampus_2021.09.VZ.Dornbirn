package Mahir.strukturierteProgrammierung.week5;

import Mahir.strukturierteProgrammierung.week4.Day4StringManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1FileReader {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Mahir\\Week5\\test.txt";


        String result = FileReader.readFile(path);
        System.out.println(result);
        Day4StringManipulation.countallChars(result);



    }

    public static class FileReader {
        public static String readFile(String path) {
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
        }

    }
}
