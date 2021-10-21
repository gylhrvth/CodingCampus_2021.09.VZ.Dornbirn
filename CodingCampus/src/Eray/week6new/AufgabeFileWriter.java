package Eray.week6new;

import java.io.*;
import java.util.Scanner;

public class AufgabeFileWriter {
    public static void main(String[] args) {
        printAll();
    }

    private static void printAll() {

        String extractingPath = "assets/tmp/output.txt";

        try {
            fileWriter(extractingPath, readUserInputUntilEmptyInput());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readUserInputUntilEmptyInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Gebe einen Text ein sobald du kein Leerzeichen eingibst und Enter drückst wird der Text exportiert");
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

    private static void fileWriter(String path, String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        try {
            bufferedWriter.write(text);
        } finally {
            try {
                System.out.println("Die Datei wurde erfolgreich erstellt !");
                bufferedWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }


}
