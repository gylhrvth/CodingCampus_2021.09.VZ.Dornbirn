package Lukas.week5.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterStreams {
    public static void main(String[] args) {
        /**
         * Einlesen mit Scanner
         */
        long start = System.currentTimeMillis();
        try {
            File file = new File("c:\\Users\\DCV\\Desktop\\file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        long durationDirectOutput = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        try {
            File file = new File("c:\\Users\\DCV\\Desktop\\file.txt");
            Scanner scanner = new Scanner(file);
            String text = "";
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
                //text += "\n";
                text += System.lineSeparator();
            }
            scanner.close();
            text = text.replaceAll("Wikipedia", "CodingCampus");
            System.out.println(text);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        long durationStringConcatenation = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();

        try {
            File file = new File("c:\\Users\\DCV\\Desktop\\file.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb
                        .append(scanner.nextLine())
                        .append(System.lineSeparator());
            }
            scanner.close();
            String text = sb.toString().replaceAll("Wikipedia", "CodingCampus");
            System.out.println(text);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        long durationStringBuilder = System.currentTimeMillis() - start;

        System.out.printf("Duration direct Output [%dms]\n", durationDirectOutput);
        System.out.printf("Duration String concatenation [%dms]\n", durationStringConcatenation);
        System.out.printf("Duration String builder [%dms]\n", durationStringBuilder);
    }
}
