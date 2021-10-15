package Lukas.week5.day4;

import java.io.*;
import java.util.Scanner;

public class Csv {
    public static void main(String[] args) {
        //Greedy vs non greedy regbert!
        String goodGreedyExample = "\"Land, Venezula, Band\",\"LVB\",10000";
        System.out.println(goodGreedyExample);
        System.out.println("Das ist Gierbert: "+goodGreedyExample.replaceAll("\".*,.*\"", "Unknown"));
        System.out.println("Das ist Gönnbert (gönn dir!): "+goodGreedyExample.replaceAll("\".*?,.*?\"", "Unknown"));

        try {
            String text = readFile("assets/population-figures-by-country-csv_csv.csv");

            printCsvBeautified(text);
        } catch (IOException exc) {
            System.out.println("Du dödel, gib mir kein falsches File!!!");
        }

        try {
            String text = readFile2("assets/population-figures-by-country-csv_csv.csv");

            printCsvBeautified(text);
        } catch (IOException exc) {
            System.out.println("Du dödel, gib mir kein falsches File!!!");
        }
    }

    private static void printCsvBeautified(String text) {
        String[] rows = text.split("\\n");
        for (String row : rows) {
            row = row.replaceAll("\".*?,.*?\"", "Unknown");
            String[] columns = row.split(",");
            for (int i = 0; i < columns.length; i++) {
                if (i == 0) {
                    System.out.printf("%52s", columns[i]);
                } else {
                    System.out.printf("%15s", columns[i]);
                }
            }
            System.out.println();
        }
    }

    private static String readFile(String path) throws FileNotFoundException {
        File f = new File(path);
        Scanner sc = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb
                    .append(sc.nextLine())
                    .append(System.lineSeparator());
        }
        sc.close();
        return sb.toString();
    }

    private static String readFile2(String path) throws IOException {
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
