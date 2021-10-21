package Eray.week6new;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndDisplaySortiertExtended {
    private static final String INT_REGEX = "[0-9]+";
    private static final String FLOAT_REGEX = "[0,00-9,00]+";

    public static void main(String[] args) {
        printAll();
    }

    private static void printAll() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\sales_100.csv";

        try {
            String csvText = fileReader(path);
            // printArray(create2dArray(csvText));

            sortArray(create2dArray(csvText));

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void printArray(String[][] listedArray) {
        for (String[] zeilen : listedArray) {
            for (String spalten : zeilen) {
                System.out.printf("%55s", spalten);
            }
            System.out.println();
        }
    }

    private static void sortArray(String[][] listedArray) {

        Scanner scanner = new Scanner(System.in);
        printSelectionMenu();
        int user = scanner.nextInt();

        for (int i = 0; i < listedArray.length; i++) {
            for (int j = 1; j < listedArray.length - i - 1; j++) {
                if(user == 5 || user == 6 || user == 7 || user == 8 ) {
                    if (isInt(listedArray[j][user], listedArray[j + 1][user])) {
                        String[] tmp = listedArray[j];
                        listedArray[j] = listedArray[j + 1];
                        listedArray[j + 1] = tmp;
                    }
                }else if(user == 9 || user == 10 || user == 11 || user == 12 || user == 13 ){

                    if (isFloat(listedArray[j][user], listedArray[j + 1][user])) {
                        String[] tmp = listedArray[j];
                        listedArray[j] = listedArray[j + 1];
                        listedArray[j + 1] = tmp;
                    }
                }

            }
        }
        printArray(listedArray);
    }


    private static boolean isFloat(String lhs, String rhs) {
        String newLHS = lhs.replaceAll("\\.",",");
        String newRHS = rhs.replaceAll("\\.",",");

        if (newLHS.matches(FLOAT_REGEX) && newRHS.matches(FLOAT_REGEX)) {
            float lhsInt = Float.parseFloat(newLHS);
            float rhsInt = Float.parseFloat(newRHS);

            return lhsInt > rhsInt;
        }

        return lhs.compareTo(rhs) > 0;
    }

    private static boolean isInt(String lhs, String rhs) {
        if (lhs.matches(INT_REGEX) && rhs.matches(INT_REGEX)) {
            int lhsInt = Integer.parseInt(lhs);
            int rhsInt = Integer.parseInt(rhs);

            return lhsInt > rhsInt;
        }

        return lhs.compareTo(rhs) > 0;
    }

    private static String[][] create2dArray(String csvText) {
        String[] zeilen = csvText.split("\\n");
        String[][] listedArray = new String[zeilen.length][];

        for (int i = 0; i < listedArray.length; i++) {
            String[] spalten = zeilen[i].split(",");
            listedArray[i] = spalten;
        }

        return listedArray;
    }


    private static String fileReader(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
            return stringBuilder.toString();
        } finally {
            System.out.println("Das File wurde erfolgreich einglesen");
            bufferedReader.close();
        }


    }

    private static void printSelectionMenu() {
        System.out.println("Gebe ein nach welcher Spalte sortiert werden soll? [Region  |  Country  |  Item Type  |  Sales Channel]");
        System.out.println("[0]  für Region ");
        System.out.println("[1]  für Country ");
        System.out.println("[2]  für Item Type ");
        System.out.println("[3]  für Sales Channel ");
        System.out.println("[4]  für Order Priority   ");
        System.out.println("[5]  für Order Date      ");
        System.out.println("[6]  für Order ID   ");
        System.out.println("[7]  für Ship Date        ");
        System.out.println("[8]  für Units Sold      ");
        System.out.println("[9]  für Unit Price    ");
        System.out.println("[10] für Unit Cost        ");
        System.out.println("[11] für Total Revenue      ");
        System.out.println("[12] für Total Cost    ");
        System.out.println("[13] für Total Profit        ");
    }
}
