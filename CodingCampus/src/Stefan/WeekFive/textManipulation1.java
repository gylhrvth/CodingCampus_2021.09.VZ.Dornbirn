package Stefan.WeekFive;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class textManipulation1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekFive\\file.txt";

        System.out.println(wordCounter(path));

    }


    private static int wordCounter(String path) {

        int countWords = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            String counter = "";
            while (sc.hasNextLine()) {
                counter += sc.nextLine();
            }
            sc.close();
            counter = counter.replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                    .replaceAll("\n+", " ")
                    .replaceAll("\s+", " ");

            String[] words = counter.split(" ");
            countWords = words.length;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return countWords;
    }

}

