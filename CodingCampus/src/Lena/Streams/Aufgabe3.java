package Lena.Streams;

import java.io.IOException;
import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Aufgabe3 {
    public static void main(String[] args) throws IOException {
        String path = "CodingCampus/src/Lena/FilesExcercise/newFileFromIntelliJ.txt";

       System.out.println(Arrays.toString(bubbleSortStrings(Aufgabe1.readFile(path))));
        System.out.println();
      //  System.out.println(Arrays.toString(bubbleSortStringsWithCollator(Aufgabe1.readFile(path))));
        // Arrays.toString(bubbleSortStrings(Aufgabe1.readFile(path)));
    }

    public static String[] bubbleSortStringsWithCollator(String text){
        text=Aufgabe2.clearString(text);
        String [] sortedWords = text.split(" ");
        Collator collator = Collator.getInstance(Locale.GERMAN);

        for (int i = 0; i < sortedWords.length; i++) {
            for (int j = 0; j < sortedWords.length-1-i; j++) {
                if(collator.compare(sortedWords[j].toLowerCase(Locale.ROOT), sortedWords[j+1].toLowerCase(Locale.ROOT))>0){
                    String temp = sortedWords[j];
                    sortedWords[j]=sortedWords[j+1];
                    sortedWords[j+1]=temp;
                }
            }

        }

        return sortedWords;
    }

    public static String[] bubbleSortStrings(String text){
        //   System.out.println(text);
       String clearedText=Aufgabe2.clearString(text);
      //  System.out.println(clearedText);
        String [] sortedWords = clearedText.split(" ");

     //   System.out.println(Arrays.toString(sortedWords));
        // Collator collator = Collator.getInstance(Locale.GERMAN);

        for (int i = 0; i < sortedWords.length; i++) {
            for (int j = 0; j < sortedWords.length-1-i; j++) {
                if(sortedWords[j].toLowerCase(Locale.ROOT).compareTo(sortedWords[j+1].toLowerCase(Locale.ROOT))>0){
                    String temp = sortedWords[j];
                    sortedWords[j]=sortedWords[j+1];
                    sortedWords[j+1]=temp;
                }
            }

        }



        return sortedWords;
    }
}
