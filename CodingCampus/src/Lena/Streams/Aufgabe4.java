package Lena.Streams;

import java.io.IOException;
import java.util.Locale;

public class Aufgabe4 {
    public static void main(String[] args) throws IOException {
        String path = "CodingCampus/src/Lena/FilesExcercise/newFileFromIntelliJ.txt";

        printCountedWords(Aufgabe3.bubbleSortStrings(Aufgabe1.readFile(path)));

    }

    public static void printCountedWords(String[]sorrtedWords){

        int counter=0;

        for (int i = 1; i < sorrtedWords.length; i++) {
            counter++;
            if(!sorrtedWords[i].toLowerCase(Locale.ROOT).equals(sorrtedWords[i-1].toLowerCase(Locale.ROOT))){
                System.out.println(sorrtedWords[i-1]+" kam "+counter+"mal vor");
                counter=0;
            }


        }
    }
}
