package Saadaq.Week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderubungen {
    public static void main(String[] args) throws IOException {
        System.out.println();
        String path2 = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv";
        StringBuilder sb2 = new StringBuilder(path2);

        String text = readFile(path2);
        System.out.println(text);


        // Path file difination
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv";

        // Create empty builder, capacity 16

        //readFile(path);
        //System.out.println(readFile(path));


    }// End of Class

    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));

        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line)
                        .append(System.lineSeparator());

            }
            return sb.toString();
        } finally {
            try {
                reader.close();
            } catch (IOException exc) {
                // falls exception beim schliessen auftritt
            }
        }
    }

}// End of Main
