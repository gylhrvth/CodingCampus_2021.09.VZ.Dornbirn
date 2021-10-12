package Gyula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileProcessor {
    public static void main(String[] args) {
        String path = "C:\\Users\\gyula.horvath\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                // Process Line of text file

                System.out.println(line);

            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }


    // TODO: 1. Textfile lesen und jede Zeile in sich umdrehen

    // TODO: 2. Textfile lesen und die Reinfolge der Zeilen umdrehen

    // TODO: 3. Textfile lesen und sowohl die Reinfolge der Zeilen wie die Zeilen in sich umdrehen


}
