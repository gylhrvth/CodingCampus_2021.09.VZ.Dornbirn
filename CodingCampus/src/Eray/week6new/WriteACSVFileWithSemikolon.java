package Eray.week6new;

import java.io.*;

public class WriteACSVFileWithSemikolon {
    public static void main(String[] args) {
        printAll();
    }

    private static void printAll() {

        String readingPath = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\sales_100.csv";
        String extractingPath = "assets/tmp/output.txt";

        try {
            String csvText = fileReader(readingPath);
            String newCSV =  csvText.replaceAll(",", ";");

            fileWriter(extractingPath, newCSV);

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


    private static String fileReader(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
            return stringBuilder.toString();
        } finally {
            System.out.println("Das File wurde erfolgreich einglesen");
            bufferedReader.close();
        }

    }

}
