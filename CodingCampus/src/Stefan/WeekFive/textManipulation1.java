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
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            String[] words = path.split(" ");
            while (sc.hasNextLine()) {
//                String line = sc.nextLine();

                int counter = 0;
                for (int counter1 = 0; counter1 < words.length + 1; counter1++) {
                    counter++;

                }
                return counter;
            }
            sc.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        return 0;
    }


}

