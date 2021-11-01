package Rauan.woche6;


import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        try {
          //  String path = "assets/file.txt";
            writeFile("assets/tmp/output.txt", readUserInput());
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();
            sb.append(input).append(System.lineSeparator());
            if (input.isEmpty()) {
                break;
            }
        }
        return sb.toString();
    }


    private static void writeFile(String path, String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        try {
            writer.write(data);
        } finally {
            try {
                writer.close();
            } catch (IOException exc) {
            }
        }
    }

    private static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb
                        .append(line)
                        .append(System.lineSeparator());
            }
            return sb.toString();
        } finally {
            try {
                reader.close();
            } catch (IOException exc) {
            }
        }
    }
}
