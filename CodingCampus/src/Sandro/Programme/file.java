package Sandro.Programme;

import java.io.*;
import java.util.Scanner;

public class file {

    public static void main(String[] args) throws IOException {
        //Lies solange eingaben vom Benutzer, bis eine Leerzeile eingegeben wird.
        // Dann schreibe die Eingaben in eine Datei.
        // Der Pfad soll lauten assets/tmp/output.txt.


        try {
            //String input = readFile("assets/file.txt");
            writeFile("assets/tmp/output.txt", readUserInputUntilEmptyInput());

        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
    }


    public static String readFile(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            return sb.toString();
        } finally {
            try {
                reader.close();
            } catch (IOException exc) {
                System.out.println("Fehler beim Schließen");
            }
        }
    }


    public static void writeFile(String path, String data) throws IOException {

//      FileWriter file = new FileWriter(path);
//      BufferedWriter writer = new BufferedWriter(file);
//      längere Version (muss so deklariert werden, wenn der FileWriter in der Methode öfters gebraucht wird

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
;
        try {
            writer.write(data);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String readUserInputUntilEmptyInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = scanner.nextLine();
            sb.
                    append(input).
                    append(System.lineSeparator());
            if (input.isEmpty()) {
                break;
            }
        }
        return sb.toString();
    }
}


