package Eray.week6.uebungsBeispiele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class DatenStroemeCountCharacters {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        try {
            String text = readFile(path);
            lengthOfCharacter(text);
            System.out.println();
            lengthOfWord(text, "Text");
            System.out.println();
            countHowOftenCharactersRepeats(text, 'e');


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    private static void countHowOftenCharactersRepeats(String text, char searchCharacter) {
        char[] totalAmountOfText = text.toLowerCase(Locale.ROOT).toCharArray();
        long countHowOftenACharacterRepeats = 0;

        for (int i = 0; i < totalAmountOfText.length; i++) {
            if (totalAmountOfText[i] == searchCharacter) {
                countHowOftenACharacterRepeats++;
            }
        }
        System.out.print("Der Buchstabe " + searchCharacter + " kommt " + countHowOftenACharacterRepeats + "  mal vor");

    }

    private static void lengthOfWord(String text, String searchWord) {
        String[] totalAmountOfText = text.split(" ");
        int countHowOftenWordRepeats = 0;
        for (int i = 0; i < totalAmountOfText.length; i++) {
            if (countHowOftenWordRepeats < 1) {
                if (totalAmountOfText[i].equals(searchWord)) {
                    countHowOftenWordRepeats++;
                    System.out.print("Das Wort " + searchWord + " ist " + totalAmountOfText[i].length() + " Zeichen lang. und kommt " + countHowOftenWordRepeats + " mal vor");
                }
            }
        }

    }

    private static void lengthOfCharacter(String text) {
        char[] totalAmountOfText = text.toCharArray();
        System.out.println("Der Text hat "+ totalAmountOfText.length + " Zeichen");
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
