package Ingo.week4;

import java.util.Arrays;
import java.util.Locale;

public class StringSorting {

    public static String ALL_MEMBERS = "Rauan Mahir Eray Ömer Plamena Sandro Stefan Danny Gerry Ingo Lena Bartosz Sadaaq Stjepan Lukas";

    public static void main(String[] args) {
        String[] membersArray = ALL_MEMBERS.split(" ");

        //Sortiere das Array Alphabetish aufsteigend und Alphabetisch absteigend
        //gebe true ein wenn du das Alphabet aufsteigend willst und false  wenn du das Alphabet absteigend willst

        System.out.println("Alphabetisch geordnet");
        arraySortAlphabet(membersArray, true);
        System.out.println(Arrays.toString(membersArray));


        System.out.println();
        //gebe das Element mit dem höchsten Zeichen aus
        //gebe true ein wenn du den höchsten Wert willst und false für den niedrigsten Wert

        System.out.println("Der Name mit dem meisten oder wenigsten Zeichen");
        String lengthStringOfArray = arrayLengthFinder(membersArray, true);
        System.out.println(lengthStringOfArray);


        System.out.println();
        //finde das Wort mit den meisten Selbstlauten
        System.out.println("Das Wort mit den meisten Selbstlauten");
        containsVowel(membersArray);


    }

    public static void containsVowel(String[] membersArray) {

        int countVowels = 0;
        String mostVowelName = "";
        for (int i = 0; i < membersArray.length; i++) {
            int counter = 0;
            char[] names = membersArray[i].toLowerCase(Locale.ROOT).toCharArray();
            for (int j = 0; j < names.length; j++) {
                if (names[j] == 'a') {
                    counter++;
                }
                if (names[j] == 'e') {
                    counter++;
                }
                if (names[j] == 'i') {
                    counter++;
                }
                if (names[j] == 'o') {
                    counter++;
                }
                if (names[j] == 'u') {
                    counter++;
                }
            }

            if (counter > countVowels) {
                countVowels = counter;
                mostVowelName = membersArray[i];
            }
        }
        System.out.println("Der Name: " + mostVowelName + " beinhaltet " + countVowels + " Selbstlaute");
    }

    public static String arrayLengthFinder(String[] membersArray, boolean longestLength) {
        if (longestLength) {
            for (int i = 0; i < membersArray.length; i++) {
                if (membersArray[i].length() > membersArray[i + 1].length()) {
                    return membersArray[i];
                }
            }
        } else {
            for (int i = 0; i < membersArray.length; i++) {
                if (membersArray[i].length() < membersArray[i + 1].length()) {
                    return membersArray[i];
                }
            }
        }
        return "";

    }

    public static void arraySortAlphabet(String[] membersArray, boolean ascending) {
        if (ascending) {
            for (int i = 0; i < membersArray.length; i++) {
                for (int j = 0; j < membersArray.length - 1 - i; j++) {
                    if (membersArray[j].compareTo(membersArray[j + 1]) > 0) {
                        swap(j, membersArray);
                    }
                }
            }
        } else {
            for (int i = 0; i < membersArray.length; i++) {
                for (int j = 0; j < membersArray.length - 1 - i; j++) {
                    if (membersArray[j].compareTo(membersArray[j + 1]) < 0) {
                        swap(j, membersArray);
                    }
                }
            }
        }
    }

    public static void swap(int i, String[] membersArray) {
        String tmp = membersArray[i];
        membersArray[i] = membersArray[i + 1];
        membersArray[i + 1] = tmp;
    }
}
