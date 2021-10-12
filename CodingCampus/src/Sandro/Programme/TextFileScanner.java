package Sandro.Programme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class TextFileScanner {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";
/*        reverse(path);*/
        countLine(path);
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

    public static int countLine (String path) {


        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            int counter = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                counter++;
                System.out.println(counter);


            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return countLine(path);
    }
}
