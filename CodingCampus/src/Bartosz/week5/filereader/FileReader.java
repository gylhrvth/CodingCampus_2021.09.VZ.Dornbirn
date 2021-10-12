package Bartosz.week5.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {
    public static String runFileReader(String path) {
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
