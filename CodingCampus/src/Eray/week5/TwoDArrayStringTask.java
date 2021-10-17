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

            String path = "assets/population-figures-by-country-csv_csv.csv";
            String text = readFile(path);
            System.out.println("---Search for Land and Year---");
            splitFileLukas(text);
            System.out.println("---Sort by column---");
            splitFileSort(text);
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

        /*
         * Unter der Voraussetzung du willst wirklich nur die entsprechende Einwohnerzahl zu einem Jahr von einem Land rausfinden.
         * Folgendes sollte man auch in mehrere Methoden aufteilen!
         *
         * Die Aufgabe wäre eigentlich gewesen, nach einer bestimmten Spalte zu sortieren. Siehe: splitFileLukas2
         */

        int countryRowIndex = -1;

        for (int row = 0; row < twoDArray.length; row++) {
            if (twoDArray[row][0].contains(country)) {
                countryRowIndex = row;
                break;
            }
        }

        int yearColumnIndex = -1;

        String[] header = twoDArray[0];
        for (int column = 0; column < header.length; column++) {
            if (header[column].contains(year)) {
                yearColumnIndex = column;
                break;
            }
        }

        if (countryRowIndex == -1 || yearColumnIndex == -1) {
            System.out.printf("Das Land [%s] und das Jahr [%s] konnten nicht gefunden werden...\n", country, year);
        } else {
            System.out.printf("Das Land %s hatte zum Jahr %s %s Einwohner.\n", country, year, twoDArray[countryRowIndex][yearColumnIndex]);
        }
    }

    private static void splitFileSort(String text) {
        /*
         * Folgendes sollte man auch in mehrere Methoden aufteilen!
         */

        //CSV "reparieren"
        text = text.replaceAll("\".*?,.*?\"", "UNKNOWN");

        String[] texLines = text.split("\\n");


        String[][] twoDArray = new String[texLines.length][];


        for (int i = 0; i < texLines.length; i++) {
            String[] columns = texLines[i].split(",");
            twoDArray[i] = columns;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe ein nach welcher Spalte du sortieren möchtest: ");
        String sortColumn = scanner.nextLine();

        int sortColumnIndex = -1;

        String[] header = twoDArray[0];
        for (int column = 0; column < header.length; column++) {
            if (header[column].contains(sortColumn)) {
                sortColumnIndex = column;
                break;
            }
        }

        if (sortColumnIndex == -1) {
            System.out.printf("Die Spalte [%s] konnte nicht gefunden werden...\n", sortColumn);
            return;
        }
        //Bubblesort nach dem gefundenen Spaltenindex
        for (int i = 0; i < twoDArray.length; i++) {
            //Wir starten bei Zeile 1, nicht 0, der Header soll bleiben wo er ist!
            for (int j = 1; j < twoDArray.length - 1 - i; j++) {
                //Wert in der aktuellen Zeile der gefundenen Spalte
                String lhs = twoDArray[j][sortColumnIndex];
                //Wert in der nächsten Zeile der gefundenen Spalte
                String rhs = twoDArray[j + 1][sortColumnIndex];

                boolean swap = false;

                if (sortColumnIndex > 1) {
                    //Es handelt sich um eine Spalte mit Zahlen
                    long lhsLong = 0;
                    long rhsLong = 0;
                    //Prüfen ob ein Dateneintrag vorhanden ist
                    if (!lhs.isEmpty()) {
                        //In einen long umwandeln, int ist zu klein
                        lhsLong = Long.parseLong(lhs);
                    }
                    //Prüfen ob ein Dateneintrag vorhanden ist
                    if (!rhs.isEmpty()) {
                        //In einen long umwandeln, int ist zu klein
                        rhsLong = Long.parseLong(rhs);
                    }
                    if (lhsLong - rhsLong > 0) {
                        swap = true;
                    }
                } else if (lhs.compareTo(rhs) > 0) {
                    //Lexikografisch vergleichen
                    swap = true;
                }

                if (swap) {
                    String[] tmp = twoDArray[j];
                    twoDArray[j] = twoDArray[j + 1];
                    twoDArray[j + 1] = tmp;
                }
            }
        }

        //Gebe nur die geordnete Spalte aus
        for (String[] row : twoDArray) {
            System.out.printf("%55s %10s\n", row[0], row[sortColumnIndex]);
        }

        //Gebe alle Spalten aus
//        for (String[] row : twoDArray) {
//            for (String column : row) {
//                System.out.printf("%55s", column);
//            }
//            System.out.println();
//        }
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
