package Eray.week6.uebungsBeispiele;

import java.util.Locale;

public class SplitAndSort {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        String text = "Heute wird ein guter Tag ! Heute wird der beste Tag überhaupt ! Heute wird ein spitzen super Tag !";
        //Aufgabe1 Splite und ersetze
        System.out.println("Wähle aus welches Wort du ersetzen willst");
        System.out.println(text);
        System.out.println();
        System.out.println(StringBuilder(splitAndPutTogether(text, "Tag")));

        //Aufgabe2 Splite und Sortiere
        System.out.println("Der Text wird Alphabetisch geordnet");
        System.out.println(text);
        String newText = StringBuilderForSorting(split(text));
        System.out.println(newText);


    }

    private static String[] split(String text) {
        String[] words = text.split(" ");
        swap(words);
        return words;
    }

    private static String[] swap(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].toLowerCase(Locale.ROOT).compareTo(words[j + 1].toLowerCase(Locale.ROOT)) > 0) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
        return words;
    }


    private static String StringBuilderForSorting(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }


    private static String[] splitAndPutTogether(String text, String replace) {
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(replace)) {
                words[i] = words[i].replaceAll(replace, "");
            }
        }

        return words;
    }

    private static String StringBuilder(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
            if (words[i].equals("")) {
                stringBuilder.append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }


}
