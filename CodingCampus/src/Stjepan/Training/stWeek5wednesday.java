package Stjepan.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class stWeek5wednesday {
    public static void main(String[] args) {
        printAllMethods();

    }

    public static void printAllMethods() {
        String path = "C:\\Users\\DCV\\Desktop\\file.txt";

        //first Task
//        System.out.println("Zähle alle Wörter: ");
//        countWordsMainMethod(path);
//        System.out.println();

        //second Task
        System.out.println("Zähle die Zeichen und gib deren Häufigkeit in Bezug auf die Gesamtanzahl der Zeichen aus");
        System.out.println();
        String text = fileReaderInText(path);
        letterCounter(text);

    }


    public static void countWordsMainMethod(String path) {
        String textGesamt = fileReaderInText(path);
        int countWords = 0;
        int countArrayWords = countWordsInText(textGesamt);
        System.out.println(countArrayWords);

    }

    public static int countWordsInText(String textGesamt) {
        textGesamt = textGesamt
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\s+", " ");
        String[] howMuchWordsAreInMyArray = textGesamt.split(" ");

        return howMuchWordsAreInMyArray.length;
    }


    public static String fileReaderInText(String path) {

        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            String textGesamt = sb.toString();
            sc.close();
            return textGesamt;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return "";
    }

    private static void letterCounter(String text) {

        char[] character = text.toCharArray();
        int[] characterTable = new int[255];

        for (int i = 0; i < character.length; i++) {
            char myASCII = character[i];
            if(myASCII < characterTable.length){
                characterTable[myASCII]++;
            }
        }

        for (int i = 0; i < characterTable.length; i++) {
            System.out.println("Der Buchstabe " + ((char)i) + " kommt " + characterTable[i] + " mal vor" );
        }

        






        
    }
}
