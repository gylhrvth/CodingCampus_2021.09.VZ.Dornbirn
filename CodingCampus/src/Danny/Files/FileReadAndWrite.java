package Danny.Files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReadAndWrite {


    public static void main(String[] args) {

        // Text mit Scanner einlesen
        // Satz umdrehen anhand der Chars
        // Text ausgeben

        // Text mit Scanner einlesen
        // Text von Hinten ausgeben
        // Text ausgeben

        String path = "/Users/dan/Desktop/ScanText.txt";
        //scanTextAndOutputCharsInLineBackwards(path);
        //scanTextAndOutputTextLinesBackward(path);
        scanTextAndOutputCharsInLineBackwardsAndTextLinesBackward(path);
    }

//    public static String readFile(String path) {
//        try {
//            File file = new File(path);
//            Scanner myReader = new Scanner(file);
//
//            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
//
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                stringBuilder.append(data);
//            }
//
//            myReader.close();
//            return stringBuilder.toString();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return "";
//    }


    public static void scanTextAndOutputCharsInLineBackwardsAndTextLinesBackward(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            int countLines = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                countLines++;
            }
            String[] textArray = new String[countLines];
            File file1 = new File(path);
            Scanner myReader1 = new Scanner(file1);
            while (myReader1.hasNextLine()) {
                for (int i = 0; i < textArray.length; i++) {
                    String data = myReader1.nextLine();
                    textArray[i] = data;
                }
            }
            for (int i = textArray.length - 1; i >= 0; i--) {
                char[] textCharArray = textArray[i].toCharArray();
                for (int j = textCharArray.length - 1; j >= 0; j--) {
                    System.out.print(textCharArray[j]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occurred.");
            fnfe.printStackTrace();
        }
    }

    public static void scanTextAndOutputTextLinesBackward(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            int countLines = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                countLines++;
            }
            String[] textArray = new String[countLines];
            File file1 = new File(path);
            Scanner myReader1 = new Scanner(file1);
            while (myReader1.hasNextLine()) {
                for (int i = 0; i < textArray.length; i++) {
                    String data = myReader1.nextLine();
                    textArray[i] = data;
                }
            }
            for (int i = textArray.length - 1; i >= 0; i--) {
                System.out.println(textArray[i]);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occurred.");
            fnfe.printStackTrace();
        }
    }


    public static void scanTextAndOutputCharsInLineBackwards(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);


            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] dataChar = data.toCharArray();

                for (int i = dataChar.length - 1; i >= 0; i--) {
                    System.out.print(String.valueOf(dataChar[i]));
                }
                System.out.println();
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occurred.");
            fnfe.printStackTrace();

        }
    }
}


