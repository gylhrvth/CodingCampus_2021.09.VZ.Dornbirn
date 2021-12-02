package Eray.week6new;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileReaderAndWriterNew {
    public static void main(String[] args) {
        printAll();
    }

    private static void printAll() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        String extractingPath = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\tmp\\output.txt";

        try {
            String text = fileReader(path);
            fileWriter(extractingPath, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
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


    public static String fileReader(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder
                        .append(line)
                        .append(System.lineSeparator());
            }
            return stringBuilder.toString();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

