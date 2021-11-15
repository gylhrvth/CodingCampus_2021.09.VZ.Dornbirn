package Rauan.Aufgaben.woche5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderAufgabe {
    public static void main(String[] args) throws FileNotFoundException {
            File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirnh\\assets\\population-figures-by-country-csv_csv.csv");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) ;
            System.out.println(scan.nextLine());

    }
}


