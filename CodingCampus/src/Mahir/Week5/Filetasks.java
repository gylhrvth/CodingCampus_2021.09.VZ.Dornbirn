package Mahir.Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Filetasks {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";

        countAllWords(path);


    }

    private  static void countAllSpecialChars(String pathOfTextToCount){
        try {
            File file = new File(pathOfTextToCount);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

            }
            scanner.close();
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }




    }

private static void countAllWords(String textToCountWords){

    int counter = 0;

    try {
        File file = new File(textToCountWords);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            line = line.replaceAll("[0-9]|\\.[\n]", " ");
            if (line.isEmpty()){
                continue;
            }
            String[] splitFile = line.split("\\s+");
            counter += splitFile.length;



        }
        scanner.close();
    } catch (FileNotFoundException fnfe) {
        fnfe.printStackTrace();
    }
    System.out.println("The text has " + counter + " words");

}

}