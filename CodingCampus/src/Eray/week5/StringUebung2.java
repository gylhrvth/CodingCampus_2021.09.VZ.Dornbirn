package Eray.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringUebung2 {
    public static void main(String[] args) {
        printAllMethods();
    }

    private static void printAllMethods() {
        String path = "C:\\Users\\DCV\\Documents\\loveBook";
        fileReaderMainMenu(path);
    }

    private static void findWordsInTextMainMenu(String text) {

        text = text
                .replaceAll("['–:;,.]", " ");


        String[] myText = text.split(" ");

        System.out.println(Arrays.toString(myText));


    }

    private static String fileReaderMainMenu(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();


            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return "";
    }


}
