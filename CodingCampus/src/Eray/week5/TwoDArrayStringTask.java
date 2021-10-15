package Eray.week5;

import javax.print.DocFlavor;
import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TwoDArrayStringTask {


    public static void main(String[] args) {
        mainMenuToPrint();
    }

    private static void mainMenuToPrint() {
        try {
            //Methoden Aufrufe

            String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv";
            String text = readFile(path);
            splitFileLukas(text);

        } catch (IOException e) {
            System.out.println("Bitte gebe ein File Pfad!");
        }
    }

    private static void splitFile(String text) {
        String[] texLines = text.split("\\n");
        String[][] twoDArray = new String[texLines.length][];

        for (int i = 0; i < texLines.length; i++) {
            String[] columns = texLines[i].split(",");
            twoDArray[i] = columns;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe ein welches Jahr du ausgeben möchtest: ");
        String year = scanner.nextLine();

        System.out.println("Bitte gebe ein welches Land du haben möchtest: ");
        String country = scanner.nextLine();


        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j].contains(year)) {
                    if (twoDArray[i][j].contains(country)) {
                        System.out.printf("%50s", twoDArray[i][j]);
                    }
                }

            }
        }
    }

    private static void splitFileLukas(String text) {
        String[] texLines = text.split("\\n");
        String[][] twoDArray = new String[texLines.length][];

        for (int i = 0; i < texLines.length; i++) {
            String[] columns = texLines[i].split(",");
            twoDArray[i] = columns;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe ein welches Jahr du ausgeben möchtest: ");
        String year = scanner.nextLine();

        System.out.println("Bitte gebe ein welches Land du haben möchtest: ");
        String country = scanner.nextLine();


        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j].contains(year)) {
                    if (twoDArray[i][j].contains(country)) {
                        System.out.printf("%50s", twoDArray[i][j]);
                    }
                }

            }
        }
    }

    private static String readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();


        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //zeile verarbeiten
            sb.append(line).append(System.lineSeparator());
        }
        bufferedReader.close();
        return sb.toString();
    }
}
