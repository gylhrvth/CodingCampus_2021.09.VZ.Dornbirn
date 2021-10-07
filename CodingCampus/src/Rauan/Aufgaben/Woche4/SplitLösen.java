package Rauan.Aufgaben.Woche4;

import Lukas.week4.day3.Strings;

import java.util.Arrays;
import java.util.Locale;

public class SplitLösen {
    public static void main(String[] args) {

        String allMembers = Strings.ALL_MEMBERS;
        String[] splitText = allMembers.split(" ");


        System.out.println(Arrays.toString(splitText));
        System.out.println();

        AlphaPetischeAufsteigend(splitText);
        AlphaPetischeAbsteigend(splitText);
        meistensZeichnen(splitText);
        mindestensZeichnen(splitText);
        meistenSelbstlauten(splitText);

    }
    public static String[] splitText() {
        return Strings.ALL_MEMBERS.split(" ");
    }
    public static void AlphaPetischeAufsteigend(String[] arr) {
        System.out.println("AlphapetAufsteigend");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int i1 = arr[j].compareTo(arr[j + 1]);
                if (i1 > 0) {
                    //oder if(arr[j].compareTo(arr[j+1]>0){
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }

    public static void AlphaPetischeAbsteigend(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int i1 = arr[j].compareTo(arr[j + 1]);
                if (i1 < 0) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println("Alphabetisch absteigend:" + Arrays.toString(arr));
    }

    public static void meistensZeichnen(String[] arr) {
        System.out.println("das Element mit den meisten Zeichen");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
        System.out.println();
    }

    public static void mindestensZeichnen(String[] arr) {
        System.out.println("das Element mit den mindestens Zeichen");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;

                }

            }

        }
        System.out.println(arr[arr.length - 1]);
        System.out.println();
    }

    public static void meistenSelbstlauten(String[] arr) {

        int acutalMostVowels = 0;
        String wordWithMostVowels = "";
        int countOtherWords = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            if (arr[i].toLowerCase(Locale.ROOT).contains("a")) {
                counter++;
            }
            if (arr[i].toLowerCase(Locale.ROOT).contains("e")) {
                counter++;
            }
            if (arr[i].toLowerCase(Locale.ROOT).contains("i")) {
                counter++;
            }
            if (arr[i].toLowerCase(Locale.ROOT).contains("o")) {
                counter++;
            }
            if (arr[i].toLowerCase(Locale.ROOT).contains("u")) {
                counter++;
            }
            if (counter == acutalMostVowels) {
                countOtherWords++;
            }
            if (counter > acutalMostVowels) {
                acutalMostVowels = counter;
                wordWithMostVowels = arr[i];
            }

        }
        System.out.println("Das Wort mit den meisten Selbstlauten ist: " + wordWithMostVowels + ". Es hat " + acutalMostVowels + " Selbstlaute.");
        if (countOtherWords > 0) {
            System.out.println("Es gibt noch " + countOtherWords + " mit " + acutalMostVowels + " Selbstlauten.");
        }

    }
}




