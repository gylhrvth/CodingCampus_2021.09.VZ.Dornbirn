package Plamena.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextExcercise {
    public static void main(String[] args) {

        String path = "assets/file.txt";
       // System.out.println("Number of words in text: " + wordCount(path));
        //System.out.println("Number of signs in text: " + signCount(path));
        //signFrequency(path);
        sortWordsLength(path);


    }

    private static int wordCount(String path) {
        int words = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            sc.close();
            String text = sb.toString();
            //    words = Plamena.week4.TextAnalysis.wordsCount(text);
            text = text.replaceAll("[·'£–„“†():;,.\\[\\]| \n\\-]", " ")
                    .replaceAll("\n+", " ")
                    .replaceAll("\s+", " ");
            String[] wordCounter = text.split("\s");
            words = wordCounter.length;
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return words;
    }

    private static int signCount(String path) {
        int signs = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append("\n");
            }
            sc.close();
            char[] charArr = sb.toString().toCharArray();
            signs = charArr.length;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return signs;
    }

    private static void signFrequency(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            char[] charArr = sb.toString().toLowerCase().toCharArray();
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
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    private static void sortWordsAlph (String path) {

        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()){
                sb.append(sc.nextLine());
            }
            String text = sb.toString();
            text = text.replaceAll("[·'£–„“†():;,.\\[\\]| \n\\-]", " ")
                    .replaceAll("\n+", " ")
                    .replaceAll("\s+", " ");
            String[] words = text.split("\s");

            for (int i = 0; i < words.length-1; i++) {
                for (int j = 0; j < words.length-1; j++) {
                    if(words[j+1].compareTo(words[j]) < 0){
                        String tmp = words[j];
                        words[j] = words[j+1];
                        words[j+1] = tmp;
                    }
                    if(words [j+1].compareTo(words[j]) == 0){
                        words[j+1] ="";
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {
                if(words[i].compareTo("") != 0 )
                System.out.println(words[i]);
            }

        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }

    }

    private static void sortWordsLength(String path){
        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()){
                sb.append(sc.nextLine());
            }
            String text = sb.toString();
            text = text.replaceAll("[·'£–„“†():;,.\\[\\]| \n\\-]", " ")
                    .replaceAll("\n+", " ")
                    .replaceAll("\s+", " ");
            String[] words = text.split("\s");

            for (int i = 0; i < words.length-1; i++) {
                for (int j = 0; j < words.length-1; j++) {
                    if(words[j+1].length() > words[j].length()){
                        String temp = words[j];
                        words[j] = words[j+1];
                        words[j+1] = temp;
                    }
                    if(words [j+1].compareTo(words[j]) == 0){
                        words[j+1] ="";
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {
                if(words[i].compareTo("") != 0 )
                    System.out.println(words[i]);
            }

        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }

}
