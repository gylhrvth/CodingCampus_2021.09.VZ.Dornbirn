package Lena.BigFilesExcercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ReadFile {


    public static String readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        while (br.readLine() != null) {
            sb
                    .append(br.readLine())
                    .append(System.lineSeparator());
        }
        br.close();

        return clearString(sb.toString());

    }

    public static String getRandomWordFromFile() throws IOException {
        String[] words = readFile("assets/file.txt").split(" ");
        Random random = new Random();
        return words[random.nextInt(words.length - 1)];
    }
    private static String clearString(String string) {
        String cleardString = string
                .replaceAll("\"[·'£–„“†():;,.\\[\\]| \\n\\-]\"", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\r+", " ")
                .replaceAll("\\s+", " ");

        return cleardString;
    }
}
