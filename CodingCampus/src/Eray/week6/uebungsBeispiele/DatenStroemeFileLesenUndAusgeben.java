package Eray.week6.uebungsBeispiele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatenStroemeFileLesenUndAusgeben {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        try {
            String text = readFile(path);
            System.out.println(text);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    private static String readFile(String path) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append(System.lineSeparator());
        }
        bufferedReader.close();
        return stringBuilder.toString();


    }
}
