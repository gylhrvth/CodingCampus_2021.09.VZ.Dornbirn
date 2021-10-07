package Bartosz.week4.FunWithStrings.FwS2Package;

import Lukas.week4.day3.Strings;
import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;
import java.util.Locale;

public class GetArrayInit {

    // Mittwochsaufgaben

    // Init Methode
    public static String[] getArrayForFun() {
        String[] initArray = Strings.ALL_MEMBERS.split(" ");
        return initArray;
    }

    // Aufgabe 1:
    public static void alphabeticSortingRise(String[] paramArray) {
        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if (paramArray[j].compareTo(paramArray[j + 1]) > 0) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(paramArray));
    }

    // Aufgabe 2:
    public static void alphabeticSortingFall(String[] paramArray) {
        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if (paramArray[j].compareTo(paramArray[j + 1]) < 0) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(paramArray));
    }

    // Aufgabe 3:
    public static void longestWord(String[] paramArray) {
        System.out.println("Der längste Name ist/ die längsten Namen sind: ");
        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - 1; j++) {
                if (paramArray[j + 1].length() < paramArray[j].length()) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = tmp;
                }
            }
        }
        System.out.println(paramArray[paramArray.length - 1]);

    }

    // Aufgabe 4:
    public static void shortestWord(String[] paramArray) {
        System.out.println("Der kürzeste Name ist/ die kürzesten Namen sind: ");

        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if (paramArray[j].length() > paramArray[j + 1].length()) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < paramArray[0].length(); i++) {
            if (paramArray[i].length() <= paramArray[i + 1].length()) {
                System.out.println(paramArray[i]);
            }
        }
    }

    //Aufgabe 5:
    public static void mostVowels(String[] paramArray) {
        int vowelsCounter = 0;
        String mostVowelName = "";
        for (int i = 0; i < paramArray.length; i++) {

            int vowelsInsideName = 0;
            char[] names = paramArray[i].toLowerCase(Locale.ROOT).toCharArray();

            for (int j = 0; j < names.length; j++) {
                if (names[j] == 'a') {
                    vowelsInsideName++;
                }
                if (names[j] == 'e') {
                    vowelsInsideName++;
                }
                if (names[j] == 'i') {
                    vowelsInsideName++;
                }
                if (names[j] == 'o') {
                    vowelsInsideName++;
                }
                if (names[j] == 'u') {
                    vowelsInsideName++;
                }
            }

            if (vowelsInsideName > vowelsCounter) {
                vowelsCounter = vowelsInsideName;
                mostVowelName = paramArray[i];
            }
        }
        System.out.println("Der Name: " + mostVowelName + " beinhaltet " + vowelsCounter + " Selbstlaute");
    }
}
