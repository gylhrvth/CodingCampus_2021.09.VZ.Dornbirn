package Bartosz.week5.day3Aufagaben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    protected static void fileReader() {
        File filePath = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Bartosz\\week5\\day3Aufagaben\\Assets\\text-file.txt");

        if (filePath.isDirectory()) {
            System.out.println("this is a directory, not a file!");
        } else {

            try {
                Scanner scan = new Scanner(filePath);
                StringBuilder esmeralda = new StringBuilder();

                while(scan.hasNextLine()) {
                    esmeralda.append(scan.nextLine());
                }
                String text = esmeralda.toString();
                System.out.println(text);

                scan.close();

            } catch (FileNotFoundException exc) {
                exc.printStackTrace();
            }

        }
    }
}
