package Eray.week6new;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CommaSeparatedValue {
    public static void main(String[] args) {
        printAll();
    }


    private static void printAll() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\sales_100.csv";
        try {
            String csvText = fileReader(path);

            //Unsorted Version of Array
            // print2dArray(createListed2dArray(csvText));

            //Sorted Version of Array
            sortArray(createListed2dArray(csvText));


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void sortArray(String[][] listedArray) {
        Scanner scanner = new Scanner(System.in);
        printSelectionMenu();
        int user = scanner.nextInt();


        for (int i = 0; i < listedArray.length; i++) {
            for (int j = 1; j < listedArray.length - i - 1; j++) {
                if (listedArray[j][user].compareTo(listedArray[j + 1][user]) > 0) {
                    String[] tmp = listedArray[j];
                    listedArray[j] = listedArray[j + 1];
                    listedArray[j + 1] = tmp;
                }
            }
        }
        print2dArray(listedArray);
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

    private static void print2dArray(String[][] listedArray) {
        for (String[] zeilen : listedArray) {
            for (String spalten : zeilen) {
                System.out.printf("%55s", spalten);
            }
            System.out.println();
        }
    }

    private static String[][] createListed2dArray(String csvText) {
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
            bufferedReader.close();
            System.out.println("Das File wurde erfolgreich eingelesen");
        }
    }

}


