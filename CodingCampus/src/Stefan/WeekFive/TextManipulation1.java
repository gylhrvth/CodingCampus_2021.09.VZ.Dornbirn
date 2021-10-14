package Stefan.WeekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextManipulation1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekFive\\file.txt";

        //Gibt die gesamten vorhandenen Zeichen aus ind ihre Menge
        String text = readFileToString(path);
        letterCounter(text);

        //Gibt die Gesamte Anzahl der vorhandenen Wörter aus
//        System.out.println(wordCounter(path));

        //Lies alle wörter
//        String[] splittText = text.split(" ");
//        System.out.println(sortWithBubble(splittText));

        //Sortiere
        //sortWithBubble(path);
    }

    //Zählt alle Zeichen und gibt deren Menge und Prozent an
    private static String letterCounter(String param) {
        String neuer = param.toLowerCase();
        char[] character = neuer.toCharArray();
        int[] counter = new int[159];
        System.out.println("Gezählte Buchstaben im Array: ");
        for (int i = 0; i < character.length; i++) {
            char myChar = character[i];
            int indexOfCounter = myChar - 97;
            if (indexOfCounter >= 0 && indexOfCounter < counter.length) {
                counter[indexOfCounter]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            double prozent = (double) counter[i] / character.length * 100;
            if (counter[i] != 0) {
                System.out.printf(("[" + (char) (i + 97)) + "]" + " = " + counter[i] + ",  %.2f%s\n", prozent, " %");
            }
        }
        return neuer;
    }

    public static String readFileToString(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            String text = "";
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
                text += System.lineSeparator();
            }
            return text;
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
        return "";
    }

    public static String sortWithBubble(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[i]) < 0) {
                    String word = words[i];
                    words[i] = words[j];
                    words[j] = word;
                }
            }
            System.out.println(words[i]);
        }
        return "";
    }
}

