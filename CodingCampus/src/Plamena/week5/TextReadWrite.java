package Plamena.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextReadWrite {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\Desktop\\test.txt";
        flipLinesAndChars(path);

    }

    private static void flipLinesAndChars (String path){

        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String [] lines = new String [lineCount(path)];


            int idx = 0;
            while(sc.hasNextLine()){
                lines[idx]= sc.nextLine();
                ++idx;
            }
            for (int i = 0; i < lines.length; i++) {
                char[] tmp = lines[lines.length-i-1].toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                    System.out.print(tmp[tmp.length - j - 1]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException fnfe){
           fnfe.printStackTrace();
        }
    }
    private static void flipRows(String path) {

        String [] text = new String [lineCount(path)];

        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()){
                for (int i = 0; i < text.length; i++) {
                    text[i] = sc.nextLine();
                }
            }

            for (int i = 0; i < text.length; i++) {
                System.out.println(text[text.length-i-1]);
            }
            sc.close();

        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }

    private static int lineCount(String path){

        int lineCount = 0;
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine()) {
                String tmp = sc.nextLine();
                lineCount++;
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return lineCount;

    }


    private static void readFile(String path) {

        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                sb.append(data + "\n");
            }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }


    private static void flipRowInput(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                char[] tmp = row.toCharArray();
                for (int i = 0; i < tmp.length / 2; i++) {
                    char tmpChar = tmp[i];
                    tmp[i] = tmp[tmp.length - i - 1];
                    tmp[tmp.length - i - 1] = tmpChar;
                }
                sc.close();
                System.out.println(tmp);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        }
    }



    private static void printBackwards(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                char[] rowToChar = row.toCharArray();
                for (int i = 0; i < rowToChar.length; i++) {
                    System.out.print(rowToChar[rowToChar.length-i-1]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }




    private static void flipWords(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuffer sb = new StringBuffer();
            String output = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tmp = line.split(" ");
                for (int i = 0; i < tmp.length; i++) {
                    if (i > 0) {
                        sb.append(" ");
                    }
                    sb.append(tmp[tmp.length - i - 1]);
                }
                output = sb.toString();
                System.out.println(output);
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

}
