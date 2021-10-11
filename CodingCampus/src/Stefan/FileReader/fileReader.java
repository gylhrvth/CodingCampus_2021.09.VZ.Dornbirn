package Stefan.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) {
        String path = "/Users/DCV/CodingCampus_2021.09.VZ.Dornbirn/CodingCampus/src/Stefan/FileReader/textTest";
        System.out.println(readFile(path));
    }


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
