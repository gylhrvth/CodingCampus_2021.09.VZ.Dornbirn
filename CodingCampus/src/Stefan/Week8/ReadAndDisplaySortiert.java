package Stefan.Week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndDisplaySortiert {

    public static void main(String[] args) throws IOException {

        String text = readFile("C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekEight\\sales.csv");

        printCsv(printCsvFormatet(text));


    }

    //Methode 2: File formatieren
    private static String[][] printCsvFormatet(String text) {
        String[] rows = text.split("\\n");
        String[][] aufgeteilt = new String[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            rows[i] = rows[i].replaceAll("\".*?,.*?\"", "Unknown");
            aufgeteilt[i] = rows[i].split(",");

        }
        return aufgeteilt;
    }

    private static String[][] printCsv(String[][] aufgeteilt) {
        for (int i = 0; i < aufgeteilt.length; i++) {
            for (int j = 0; j < aufgeteilt[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%55s", aufgeteilt[i][j]);
                } else {
                    System.out.printf("%35s", aufgeteilt[i][j]);
                }
            }
            System.out.println();
        }
        return aufgeteilt;
    }

    //Methode 3: Sortieren mit Abfrage
    public static void sortList (String[][] aufgeteilt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nach welcher Spalte wollen Sie sortieren: [Region] [Country] [Item Type] ");
        String sort = scanner.next();

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
