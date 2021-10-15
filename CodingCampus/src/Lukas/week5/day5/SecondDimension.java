package Lukas.week5.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecondDimension {
    public static void main(String[] args) {
        try {
            String text = readFile("assets/population-figures-by-country-csv_csv.csv");
            String[][] textMatrix = splitFile(text);

            System.out.println(textMatrix[19][4]);

        } catch (IOException e) {
            System.out.println("Gib mir ein richtiges File!!!");
        }
    }

    private static String[][] splitFile(String text) {
        String[] textLines = text.split("[\\n]");
        String[][] matrix = new String[textLines.length][];

        for (int row = 0; row < textLines.length; row++) {
            String[] columns = textLines[row].split(",");
            matrix[row] = columns;
        }

        return matrix;
    }

    private static String readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        //Variante Easy
        while (true) {
            //zeile verarbeiten
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append(System.lineSeparator());
        }
        //Variante Komplexer
//        String line;
//        while((line = bufferedReader.readLine()) != null) {
//            //zeile verarbeiten
//            sb.append(line).append(System.lineSeparator());
//        }
        bufferedReader.close();
        return sb.toString();
    }
}
