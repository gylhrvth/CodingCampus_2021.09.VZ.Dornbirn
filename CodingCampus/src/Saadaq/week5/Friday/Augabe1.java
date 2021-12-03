package Saadaq.week5.Friday;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Augabe1 {
    public static void main(String[] args) {

        try {
            String text = readFile("assets/population-figures-by-country-csv_csv.csv");
            String[][] textMatrix = spliteFile(text);
            printCsvBautified(textMatrix);
            int rowUser = menuUser(textMatrix);
            String[][] sortArray = sortColumstoRowUserScan(textMatrix, rowUser);
            printCsvBautified(sortArray);

        } catch (IOException e) {
            System.out.println("Gib mir ein richtiges File");
        }
    }

    public static String[][] sortColumstoRowUserScan(String[][] textMatrix, int rowUser) {
        Boolean isNumber = itsAnumber(textMatrix, 1, rowUser - 1);
        if (isNumber == true) {
            for (int i = 1; i < textMatrix.length; i++) {
                int rowNumber = parseInt(textMatrix[i][rowUser - 1]);
                int biggesRow = rowNumber;
                for (int j = i; j < textMatrix.length; j++) {
                    Boolean isAnumberTo = itsAnumber(textMatrix, j, rowUser - 1);
                    if (isAnumberTo == true) {
                        int curentNumber = parseInt(textMatrix[j][rowUser - 1]);
                        if (curentNumber > biggesRow) {
                            String[] temp = textMatrix[i];
                            textMatrix[i] = textMatrix[j];
                            textMatrix[j] = temp;
                            biggesRow = curentNumber;
                        }
                    } else {
                        String[] temp = textMatrix[i];
                        textMatrix[i] = textMatrix[j];
                        textMatrix[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("Keine gültige Eingabe");
            menuUser(textMatrix);
        }
        return textMatrix;
    }

    public static boolean itsAnumber(String[][] textMatrix, int i, int j) {
        try {
            int rowNumber = parseInt(textMatrix[i][j]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    public static void printCsvBautified(String[][] textMatrix) {
        for (int j = 0; j < textMatrix.length; j++) {
            for (int i = 0; i < textMatrix[j].length; i++) {
                if (i == 0) {
                    System.out.printf("%52s", textMatrix[j][i]);
                } else {
                    System.out.printf("%15s", textMatrix[j][i]);
                }
            }
            System.out.println();
        }
    }

    public static int menuUser(String[][] textMatrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nach welcher Spalte soll sotiert werden");
        for (int i = 2; i < textMatrix[0].length; i++) {
            System.out.println(i + 1 + " = " + textMatrix[0][i]);
        }
        System.out.println("-----");
        int sortColumns = scanner.nextInt();

        return sortColumns;
    }

    private static String[][] spliteFile(String text) {
        String[] textLines = text.split("[\\n]");
        String[][] matrix = new String[textLines.length][];

        for (int row = 0; row < textLines.length; row++) {
            String[] columns = textLines[row].replaceAll("\".*?,.*?\"", "Unknown").split(",");
            matrix[row] = columns;
        }
        return matrix;
    }

    private static String readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new FileReader(path)));
        StringBuilder sb = new StringBuilder();

        //Varinte Easy
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append(System.lineSeparator());
        }
        //Variante Komplexer
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            //zeile verabeiten
//            sb.append(line).append(System.lineSeparator());
//    }
        bufferedReader.close();
        return sb.toString();


    }


}// End of Class
