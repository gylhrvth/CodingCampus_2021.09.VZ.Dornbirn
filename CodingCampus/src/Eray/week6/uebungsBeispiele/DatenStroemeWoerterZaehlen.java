package Eray.week6.uebungsBeispiele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DatenStroemeWoerterZaehlen {
    public static void main(String[] args) {
        printWords();

    }

    private static void printWords() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        try {
            String text = readFile(path);

            String[] words = text.split(" ");
            System.out.println("Der Text enthält " + words.length + " Wörter");

            countHowOftenAWordRepeats(text);

            userInputReplaceWords(text);


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    private static void countHowOftenAWordRepeats(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie an welches Wort sie suchen wollen?");
        String userInputWord = scanner.nextLine().toLowerCase(Locale.ROOT);

        String[] words = text.toLowerCase(Locale.ROOT).split(" ");
        int countUserInputWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(userInputWord)) {
                countUserInputWord++;

            }
        }

        System.out.println("Das Wort " + userInputWord + " kommt " + countUserInputWord + " mal vor");
    }

    private static void userInputReplaceWords(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie an welches Wort sie ersetzen wollen?");
        String userInputWord = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Bitte geben sie das neue Wort an durch welches sie es ersetzen wollen?");
        String userInputNewReplacedWord = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Das Wort " +userInputWord + " wird durch " + userInputNewReplacedWord + " ersetzt");
        String[] words = text.toLowerCase(Locale.ROOT).split(" ");
        int countUserInputWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(userInputWord)) {
               words[i] = userInputNewReplacedWord;
            }
        }

        System.out.print(Arrays.toString(words));


    }



    private static String readFile(String path) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append(System.lineSeparator());
        }
        bufferedReader.close();
        return stringBuilder.toString();


    }
}
