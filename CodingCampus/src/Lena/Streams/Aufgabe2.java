package Lena.Streams;

import java.io.IOException;

public class Aufgabe2 {
    public static void main(String[] args) throws IOException {
        String path = "assets/file.txt";

        System.out.println("Der Text hat: "+countWords(Aufgabe1.readFile(path))+" Wörter.");
    }

    public static int countWords (String text){
        text = clearString(text);
        String[]wordsToCount = text.split(" ");

        return wordsToCount.length;
    }

    public static String clearString(String string) {
        String cleardString = string
                .replaceAll("\"[·'£–„“†():;,.\\[\\]| \\n\\-]\"", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\r+", " ")
                .replaceAll("\s+", " ");

        return cleardString;
    }
}
