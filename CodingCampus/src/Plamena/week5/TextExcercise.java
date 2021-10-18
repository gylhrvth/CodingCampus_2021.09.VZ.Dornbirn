package Plamena.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextExcercise {
    public static void main(String[] args) {

        String path = "assets/file.txt";
        //System.out.println("Number of words in text: " + wordCount(readFile(path)));
        //System.out.println("Number of signs in text: " + signCount(readFile(path)));
        //signFrequency(readFile(path));
        sortWordsLength(readFile(path));
        // sortWordsAlph(readFile(path));


    }

    private static String readFile(String path) {
        String text = "";
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            sc.close();
            text = sb.toString();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return text;
    }

    private static int wordCount(String text) {
        int words = 0;
        //    words = Plamena.week4.TextAnalysis.wordsCount(text);
        text = text.replaceAll("[·'£–„“†():;,.\\[\\]| \n\\-]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");
        String[] wordCounter = text.split("\s");
        words = wordCounter.length;
        return words;
    }

    private static int signCount(String text) {
        int signs = 0;
        char[] charArr = text.toCharArray();
        signs = charArr.length;
        return signs;
    }

    private static void signFrequency(String text) {
        char[] charArr = text.toLowerCase().toCharArray();
        int[] tmp = new int[221];

        for (char character : charArr) {
            int idx = character - ' ';
            if (idx >= 0 && idx < tmp.length) {
                tmp[idx]++;
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            float percentage = ((float) tmp[i] / charArr.length) * 100;
            if (tmp[i] != 0) {
                System.out.print("There are " + tmp[i] + " '" + (char) (i + ' ') + "' in this text. That's ");
                System.out.printf("%.2f ", percentage);
                System.out.println(" % of all characters.");
            }
        }
    }

    private static void sortWordsAlph(String text) {

        text = text.replaceAll("[·'£–„“†():;,.\\t\\[\\]| \n\\-]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");
        String[] words = text.split("\s");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - j; j++) {
                if (words[j + 1].compareTo(words[j]) < 0) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
                if (words[j + 1].compareTo(words[j]) == 0) {
                    words[j + 1] = "";
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo("") != 0) {
                System.out.println(words[i]);
            }
        }
    }

    private static void sortWordsLength(String text) {
        text = text.replaceAll("[·'£–„“†():;,.\\t\\[\\]| \n\\-]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");
        String[] words = text.split("\s");
        for (int i = 0; i < words.length - 1; i++) {
            for (int k = 0; k < words.length - 1 - i; k++) {
                boolean swap = false;
                int comparisionLength = words[k + 1].length() - words[k].length();
                if (comparisionLength < 0) {
                    swap = true;
                } else if (comparisionLength == 0) {
                    if (words[k + 1].compareTo(words[k]) < 0) {
                        swap = true;
                    }
                }
                if (swap) {
                    String tmp = words[k];
                    words[k] = words[k + 1];
                    words[k + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            if(i > 0 && words[i-1].compareTo(words[i]) != 0 && !words[i].matches("[A-ZÄÖÜ]*[a-z]+[A-Z].*"))
                System.out.println(words[i]+" ["+words[i].length()+"]");
        }
    }

}
