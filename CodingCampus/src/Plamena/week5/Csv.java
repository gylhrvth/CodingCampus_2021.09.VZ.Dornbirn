package Plamena.week5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Csv {
    public static void main(String[] args) {

        String path = "assets/sales_100.csv";
        try {
            printMatrix(splitText(readFileBR(path)));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }

    private static void printMatrix(String[][] matrix) {
        int[] columnsWidth = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (columnsWidth[i] < matrix[j][i].length()) {
                    columnsWidth[i] = matrix[j][i].length();
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int dist = 5;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%" + (columnsWidth[j]+dist) + "s", matrix[i][j]);
            }
            System.out.println();
        }

    }


    private static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which row do you want to sort? Please enter row number!");

        try {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid row number!");
                sc.nextInt();
            }
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        }

        return sc.nextInt();
    }

    private static String[][] splitText(String text) {
        String[] rows = text.split("\\n");
        String[][] matrix = new String[rows.length][];

        for (int row = 0; row < rows.length; row++) {
            String[] columns = rows[row].split(",");
            matrix[row] = columns;
        }

        return matrix;
    }

/*    private static void sortColumns(String[][] matrix) {
        int colNumber;
        for (int i = 0; i < matrix.length; i++) {
            if (i > 0) {
                Arrays.sort(matrix,  new Comparator<String[]>(){

                }
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }*/

    private static String readFileBR(String path) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        String lines;

        while ((lines = bf.readLine()) != null) {
            sb.append(lines)
                    .append(System.lineSeparator());
        }
        bf.close();

        return sb.toString();
    }
}
