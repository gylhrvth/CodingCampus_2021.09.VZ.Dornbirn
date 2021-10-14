package Stefan.WeekFive;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class textManipulation1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\WeekFive\\file.txt";

        //Gibt die gesamten vorhandenen Zeichen aus ind ihre Menge
        String text = readFileToString(path);
        letterCounter(text);

        //Gibt die Gesamte Anzahl der vorhandenen Wörter aus
//        System.out.println(wordCounter(path));


    }

    public static String readFileToString(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            String text = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                text += line;
            }
            scanner.close();
            return text;
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
        return "";
    }

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




    //Zählt aller Wörter im String und gibt sie aus
//    private static int wordCounter(String path) {
//
//        int countWords = 0;
//        try {
//            File f = new File(path);
//            Scanner sc = new Scanner(f);
//
//            String counter = "";
//            while (sc.hasNextLine()) {
//                counter += sc.nextLine();
//            }
//            sc.close();
//            counter = counter.replaceAll("[\\(\\):,]|\\.[ \n]", " ")
//                    .replaceAll("\n+", " ")
//                    .replaceAll("\s+", " ");
//
//            String[] words = counter.split(" ");
//            countWords = words.length;
//        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        }
//        return countWords;
//    }

}

