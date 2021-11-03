package Stefan.WeekEight;

import java.io.*;
import java.util.Scanner;

public class ReadAndDisplay {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekEight\\sales.csv";

        String text = readFile(path);

        System.out.println(text);


    }

    private static String readFile(String path) throws IOException {
        File f = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(f));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb
                    .append(line)
                    .append(System.lineSeparator());
        }
        reader.close();
        return sb.toString();
    }
}
