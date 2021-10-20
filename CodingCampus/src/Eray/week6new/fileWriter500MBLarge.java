package Eray.week6new;

import Eray.week5.FileReaderAndWriter.FileReader;
import Eray.week5.FileReaderAndWriter.FileWriterCreateNewFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class fileWriter500MBLarge {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        String path = "C:\\Users\\DCV\\Documents\\test.txt";
        try {
            fillFileWhileUnder500MB(500);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fillFileWhileUnder500MB(int sizeInMB) throws IOException {

        Random rnd = new Random();
        String words[] = FileReader.readFile("assets/file.txt").split(" ");

        File f = new File("C:\\Users\\DCV\\Documents\\test.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintStream ps = new PrintStream(fos);

        while (f.length() < 1024L * 1024 * sizeInMB) {
            int countWords = rnd.nextInt(20);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countWords; i++) {
                sb.append(words[rnd.nextInt(words.length)] + " ");
            }
            ps.println(sb);
        }
        ps.close();
    }

}
