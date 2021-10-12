package Stefan.WeekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class textManipulation {
    public static void main(String[] args) {

        String path = "/Users/DCV/CodingCampus_2021.09.VZ.Dornbirn/CodingCampus/src/Stefan/FileReader/textTest";


        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();


                for (int i = line.length() - 1; i >= 0; i--) {
                    System.out.print(line.charAt(i));

                }
                System.out.println();

            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }


}
