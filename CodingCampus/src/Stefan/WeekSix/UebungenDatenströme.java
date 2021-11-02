package Stefan.WeekSix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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

//        wordCounterInput(text);

        //Methode 4
        //Tauscht ein eingegebenes Wort mit einem anderem eingegebenen Wort
        wordChangeInput(text);

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
    public static void wordCounterInput (String text) {
        System.out.println("Gebens Sie ein Wort aus dessen häufigkeit Sie wissen wollen: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int counter = 0;
        String[] words = text.split(" ");

        for (String s : words) {
            if (Objects.equals(s, word)) {
                counter++;
            }
        }
        System.out.println("Das Wort " + word + " kommt " + counter + " im Text vor!");
    }

    //Methode 4 = Tauscht ein Wort mit einem anderen
    public static void wordChangeInput (String text) {
        System.out.println("Gebens Sie ein Wort ein das sie tauschen wollen: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Geben sie das ersetzende Wort ein");
        String word1 = scanner.next();


        String words = text.replaceAll(word, word1);
        System.out.println(words);

    }
}
