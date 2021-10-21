package Lena.ReadWriteStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CSVExcercise {

    public static void main(String[] args) throws IOException {
        String path = "assets/population-figures-by-country-csv_csv.csv";


        matrixToString(fillMatrix(readFile(path)));
        sortByUserInput(fillMatrix(readFile(path)));

    }



    public static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String text;
            while ((text = br.readLine()) != null) {
                sb
                        .append(text).
                        append(System.lineSeparator());
            }
            br.close();
        } catch (FileNotFoundException fnfExc) {
            System.out.println("Das File kann nicht gefunden werden");
        } catch (IOException exc) {
            System.out.println("IOException");
        }

        return sb.toString();
    }

    public static String[][] fillMatrix(String string) {
        String[] tempRows = string.split("\n");
        String[][] matrix = new String[tempRows.length][];

        for (int i = 0; i < tempRows.length; i++) {
            tempRows[i] = tempRows[i].replaceAll("\".*?,.*?\"", "Unknown").replaceAll(",,", ",0,0");
            matrix[i] = tempRows[i].split(",");
        }

        return matrix;
    }

    public static void matrixToString(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%55s", matrix[i][j]);
                } else if (j == 1) {
                    System.out.printf("%15s", matrix[i][j]);
                } else {
                    System.out.printf("%20s", matrix[i][j]);
                }

            }
            System.out.println();

        }
    }

    private static void sortByUserInput(String[][] matrix) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nach welchem Jahr von 1960 bis 2016 möchten Sie sortieren?");
        int column = sc.nextInt();
        // int column = 0;

       /* for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i].equals("Year_" + year)) {
                column = i;
            }
        }*/

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length - 1 - i; j++) {

                try {
                    if (Long.parseLong(matrix[j][column]) > Long.parseLong(matrix[j + 1][column])) {
                        String[] temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;
                    }
                } catch (NumberFormatException nfex) {
                    for (int k = 0; k < matrix.length; k++) {
                        for (int l = 1; l < matrix.length - 1 - k; l++) {
                            if (matrix[k][column].compareTo(matrix[k + 1][column]) > 0) {
                                String[] temp = matrix[l];
                                matrix[l] = matrix[l + 1];
                                matrix[l + 1] = temp;
                            }
                        }
                    }
                }
            }
        }

        matrixToString(matrix);


    }

}
