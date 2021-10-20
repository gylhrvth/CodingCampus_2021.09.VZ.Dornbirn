package Ingo.week5.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArraySort2D {

    public static void main(String[] args) {

        String text = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv";

    }
    public static String fileReader(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        // Variante Easy !!!
        while (true) {
            // Zeile verarbeiten
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append(System.lineSeparator());
        }
/*         Variante ein bisschen komplexer ;-)  !!!
        String line;
        while ((line = reader.readLine()) != null) {
             Zeile verarbeiten
            sb.append(line).append(System.lineSeparator());
        }
*/      reader.close();
        return sb.toString();

    }
}
