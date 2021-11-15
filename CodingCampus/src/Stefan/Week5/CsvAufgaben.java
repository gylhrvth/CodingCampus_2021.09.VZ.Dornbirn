package Stefan.Week5;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>Die 2te Dimension</h1>
 * Lies das file assets/population-figures-by-country-csv_csv.csv in ein 2-Dimensionales String Array ein.<br>
 * Frag dannach den Benutzer nach welcher Spalte sortiert werden soll.<br>
 * Sortiere die Zeilen des 2-Dimensionalen Arrays nach der entsprechenden Spalte.<br>
 * Ignoriere dabei die Header Zeile! Diese soll immer oben stehen.<br>
 * Es soll automatisch erkannt werden ob es sich um eine Spalte mit Zahlen oder Strings handelt. Tip.: (Integer.parseInt(text) wirft eine NumberFormatException wenn es sich nicht um eine Zahl handelt.)
 */

public class CsvAufgaben {
    public static void main(String[] args) {
        try {
            String text = readFile("assets/population-figures-by-country-csv_csv.csv");
            String[][] textMatrix = splitFile(text);
            System.out.println(textMatrix[1][1]);
//            sorter(text);
        } catch (IOException e) {
            System.out.println("Kein richtiges File");
        }
    }

    private static void sorter(String path) {
        System.out.print("Was möchten Sie tun: ");
        Scanner scanner = new Scanner(System.in);
        int sorterCsv = scanner.nextInt();
        System.out.println(sorterCsv);
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



    //Der File Reader
    private static String readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = bufferedReader.readLine()) != null) {

            sb.append(line).append(System.lineSeparator());
        }

        bufferedReader.close();
        return sb.toString();
    }
}
