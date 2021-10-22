package Stefan.WeekSix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UebungenDatenströme {
    public static void main(String[] args) {
        String path = "assets/file.txt";

        String text = fileReader(path);

        //Methode 1
        //Lies das File mit Hilfe von Scanner oder BufferedRead ein und gib es aus.
        //System.out.println(text);

        //Methode 2
        //Liest den Text ein und zählt die Wörter -> mit Ausagbe
//        System.out.println("Es sind: " + wordCounter(text) + " Wörter im Text vorhanden!");


        //Methode 3
        //Gibt die Anzahl des zuvor abgefragten Wortes aus
        wordCounterInput(text);



    }

    //Methode 1 = File Reader
    public static String fileReader(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            String text = "";
            while (myReader.hasNextLine()) {
                text += (myReader.nextLine());
                text += (System.lineSeparator());
            }
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }

    //Methode 2 = Zählt alle Wörter im Text
    public static int wordCounter(String path) {
        int counterWords = 0;
        String[] words = path.split(" ");
        for (int i = 0; i < words.length; i++) {
            counterWords++;
        }
        return counterWords;
    }

    //Methode 3 = Gibt die Anzahl des zuvor abgefragten Wortes aus
    public static void wordCounterInput (String path) {
        System.out.println("Gebens Sie ein Wort aus dessen häufigkeit Sie wissen wollen: ");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        System.out.println(test);
    }
}
