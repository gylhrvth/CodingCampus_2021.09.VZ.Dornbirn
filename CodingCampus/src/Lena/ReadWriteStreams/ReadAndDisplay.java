package Lena.ReadWriteStreams;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadAndDisplay {

    public static void main(String[] args) throws IOException {
        String path = "assets/sales_100.csv";
        // System.out.println(readFile(path));
        String data = readFile(path);
        // System.out.println(data);
        String[][] sortedMatrix = sortMatrixByColumn(dataStringToArray(data));
      //  writeDataToCSV(sortedMatrix);


    }

    private static void writeDataToCSV(String[][] matrix) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("assets/tmp/matrix.txt"));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                bf.write(matrix[i][j] + ", ");
            }
            bf.write(System.lineSeparator());

        }

        bf.close();
    }

    private static int askColumnToSortFromUserInput(String[][] matrix) {
        Scanner sc = new Scanner(System.in);
        boolean columnCheck = false;
        int columnToSort = -1;
        while (!columnCheck) {
            System.out.println("Welche Spalte soll sortiert werden?");
            while (!sc.hasNextInt()) {
                System.out.println("Das ist keine Zahl");
                sc.nextLine();
            }
            columnToSort = sc.nextInt();

            if (columnToSort >= 0 && columnToSort < matrix[0].length) {
                columnCheck = true;
            } else {
                System.out.println("Diese Spalte ist nicht vorhanden");
            }

        }
        return columnToSort;
    }



    private static String[][] sortMatrixByColumn(String[][] matrix) {
        int column = (askColumnToSortFromUserInput(matrix) - 1);

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 1; i < matrix.length - 1 - j; i++) {
                if (matrix[i][column].compareTo(matrix[i + 1][column]) > 0) {
                    String[] temp = matrix[i];
                    matrix[i] = matrix[i + 1];
                    matrix[i + 1] = temp;
                }

            }
        }
        printMatrix(matrix);
        return matrix;
    }


    private static String readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb
                    .append(line)
                    .append(System.lineSeparator());
        }
        br.close();

        return clearString(sb.toString());
    }

    private static String[][] dataStringToArray(String data) {
        String[] tempRows = data.split("\n");
        String[][] dataMatrix = new String[tempRows.length][];

        for (int i = 0; i < tempRows.length; i++) {
            dataMatrix[i] = tempRows[i].split(",");

        }
        return dataMatrix;
    }

    private static void printMatrix(String[][] matrix) {
        int spacesBetweenColumns = 5;
        int[] columnsSizes = getColumnSizes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-" + (columnsSizes[j] + spacesBetweenColumns) + "s", matrix[i][j]);
            }
            System.out.println();

        }
    }

    private static int[] getColumnSizes(String[][] matrix) {
        int maxSize = 0;
        int[] columnSizes = new int[matrix[0].length];
        int columnsArrayIndex = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (maxSize < matrix[i][j].length()) {
                    maxSize = matrix[i][j].length();
                }
            }
            columnSizes[columnsArrayIndex] = maxSize;
            columnsArrayIndex++;
            maxSize = 0;

        }


        return columnSizes;
    }

    private static String clearString(String string) {
        String cleardString = string
                .replaceAll("\"[·'£–„“†():;,.\\[\\]| \\n\\-]\"", " ")
                .replaceAll("\r+", "")
                .replaceAll("\\s+", " ");

        return cleardString;
    }
}
