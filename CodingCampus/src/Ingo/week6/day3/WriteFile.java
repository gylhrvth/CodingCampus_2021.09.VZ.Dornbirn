package Ingo.week6.day3;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        try {
            String input = readFile("assets/file.txt");
            writeFile("assets/tmp/output.txt", input);
            System.out.println(input);

        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
    }

    public static void writeFile(String path, String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        try {
            writer.write(data);
        } finally {
            try {
                writer.close();
            } catch (IOException exc) {
                //noop
            }
        }
    }

    public static String readFile(String path) throws IOException {
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
            //Tu das immer
            try {
                reader.close();
            } catch (IOException exc) {
                //Falls exception beim schließen auftritt
            }
        }
    }
}
