package Stefan.WeekEight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplayOptimiert {
    public static void main(String[] args) throws IOException {

        String text = readFile("C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekEight\\sales.csv");

        printCsvFormatet(text);
    }

    //Methode 2: File einlesen und formatieren
    private static void printCsvFormatet(String text) {
        String[] rows = text.split("\\n");
        for (String row : rows) {
            row = row.replaceAll("\".*?,.*?\"", "Unknown");
            String[] columns = row.split(",");
            for (int i = 0; i < columns.length; i++) {
                if (i == 0) {
                    System.out.printf("%52s", columns[i]);
                } else {
                    System.out.printf("%35s", columns[i]);
                }
            }
            System.out.println();
        }
    }

    //Methode 1: File einlesen
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
