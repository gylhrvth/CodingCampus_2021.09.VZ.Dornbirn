package Oemer.Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereader {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Process Line of text file
                char[] inputArray = line.toCharArray();

                for (int i = inputArray.length - 1; i >= 0; i--) {
                    System.out.print(inputArray[i]);
                }
                System.out.println();


            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }// 1.Aufgabe


}
