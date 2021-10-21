package Bartosz.week6;

import java.io.*;

public class Csv2DArray {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv";
        splitFile(path);


    }

    private static String[][] splitFile(String text) {
        String[] textLines = text.split("\\n");             //String Array mit Anzahl Zeilen
        String[][] matrix = new String[textLines.length][];

        for (int row = 0; row < textLines.length; row++) {
            String[] columns = textLines[row].split(",");      // Text wird an jedem Komma geteilt. Jedes geteilte Element gehört zu columns[]
            matrix[row] = columns;
        }

        return matrix;
    }


    private static String assetReader(String path) throws IOException {
        BufferedReader bfReader = new BufferedReader(new FileReader(path));     //new fileReader
        StringBuilder sb = new StringBuilder();                                 //StringBuilder from file

        String line;

        while((line = bfReader.readLine()) != null) {                       // solange nächste Line vorhanden
            sb.append(line).append(System.lineSeparator());                 // hinzufügen zum StringBuilder
        }
        bfReader.close();                                                   // reader schließen
        return sb.toString();                                               //return string text
    }
}
