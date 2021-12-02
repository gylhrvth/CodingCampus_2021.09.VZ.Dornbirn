package Plamena.week6.TestExcercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataStreams {
    public static void main(String[] args) {

    }
    private static void textWithReplacedWords(String path){
        StringBuilder sb = new StringBuilder();
        String line;
        Scanner sc = new Scanner(System.in);

        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));

            while((line = reader.readLine()) != null){
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        String text = sb.toString();
        System.out.println("Enter the word you want to replace: ");
        String wordToReplace = sc.nextLine();
        System.out.println("Enter the word you want to put instead " + wordToReplace);
        String replacement = sc.nextLine();
        text = text.replaceAll(wordToReplace + " ", replacement + " ");
        System.out.println(text);
    }


    private static void wordOccurences(String path) {
        String line;
        StringBuilder sb = new StringBuilder();
        String text = "";
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            text = sb.toString();
            text = text.replaceAll("[·'£–„“†():;,.\\t\\[\\]| \n\\-]", " ")
                    .replaceAll("\\s+", " ")
                    .replaceAll("\\n+", " ");
            String[] textToString = text.split(" ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        String[] textToWords = text.split(" ");
        System.out.println("Which words do you want to count?");

        String input = sc.nextLine();
        String[] wordsToCount = input.split("[, ]");
        int[] counter = new int[wordsToCount.length];
        for (int i = 0; i < wordsToCount.length; i++) {
            for (int j = 0; j < textToWords.length; j++) {
                if (wordsToCount[i].matches(textToWords[j])) {
                    counter[i]++;
                }
            }
        }
        for (int i = 0; i < wordsToCount.length; i++) {
            System.out.println("\"" + wordsToCount[i] + "\"" + " appears " + counter[i] + " times in this text.");
        }

    }

    private static int countWords(String path) {
        StringBuilder sb = new StringBuilder();
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        String text = sb.toString();
        text = text.replaceAll("[·'£–„“†():;,.\\t\\[\\]| \n\\-]", " ")
                .replaceAll("\\s+", " ")
                .replaceAll("\\n+", " ");
        String[] wordsArr = text.split(" ");
        return wordsArr.length;
    }

    private static void countChar(String path, char [] charactersToCount) {
        StringBuilder sb = new StringBuilder();
        String line = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        String text = sb.toString();
        char[] charArr = text.toLowerCase().toCharArray();
        int[] charOcc = new int[255];

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charOcc.length; j++) {
                if (charArr[i] == j) {
                    charOcc[j]++;
                }
            }
        }
        for (int j = 0; j < charactersToCount.length; j++) {
            for (int i = 0; i < charOcc.length; i++) {
                //if(charOcc[i] != 0){
                //if (i == characterToCount) {
                if (i == charactersToCount[j]){
                    System.out.println((char) i + " appears " + charOcc[i] + " times in this text");
                }
            }
        }
    }

    private static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";

            while ((line = br.readLine()) != null) {
                sb.append(line)
                        .append(System.lineSeparator());
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return sb.toString();
    }
}
