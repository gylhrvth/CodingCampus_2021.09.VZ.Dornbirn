package Lena;


import Lukas.week4.day3.Aufgabe1;
import Lukas.week4.day3.Strings;

import java.util.Arrays;
import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        printSortedArrayAsc(getMembersArray());
        printSortedArrayDsc(getMembersArray());
        getLongestWord(getMembersArray());
        getShortestWord(getMembersArray());
        printWordWithMostVowels(getMembersArray());
        printRealWordWithMostVowels(getMembersArray());

    }

    public static String[] getMembersArray() {
        return Strings.ALL_MEMBERS.split(" ");
    }

    public static void printSortedArrayAsc(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Alphabetisch aufsteigend: " + Arrays.toString(arr));
    }

    public static void printSortedArrayDsc(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Alphabetisch absteigend: " + Arrays.toString(arr));
    }

    public static void getLongestWord(String[] arr) {
        String longest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (longest.length() < arr[i].length()) {
                longest = arr[i];
            }

        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (longest.length() == arr[i].length()) {
                count++;
            }

        }

        System.out.println("Das längste Wort ist: " + longest);
        if (count > 0) {
            System.out.println("Es gibt aber noch " + count + " weitere Wörter mit " + longest.length() + " Buchstaben");
        }
    }

    public static void getShortestWord(String[] arr) {
        String shortest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (shortest.length() > arr[i].length()) {
                shortest = arr[i];
            }

        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (shortest.length() == arr[i].length()) {
                count++;
            }

        }

        System.out.println("Das kürzeste Wort ist: " + shortest);
        if (count > 0) {
            System.out.println("Es gibt aber noch " + count + " weitere Wörter mit " + shortest.length() + " Buchstaben");
        }
    }

    public static void printWordWithMostVowels(String[] arr) {

        int acutalMostVowels = 0;
        String wordWithMostVowels = "";
        int countOtherWords=0;
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


            if(counter==acutalMostVowels){
                countOtherWords++;
            }
            if (counter > acutalMostVowels) {
                acutalMostVowels = counter;
                wordWithMostVowels = arr[i];
            }

        }
        System.out.println("Das Wort mit den meisten Selbstlauten ist: " + wordWithMostVowels + ". Es hat " + acutalMostVowels + " Selbstlaute.");
        if(countOtherWords>0){
            System.out.println("Es gibt noch "+countOtherWords+" mit "+acutalMostVowels+" Selbstlauten.");
        }
    }

    public static void printRealWordWithMostVowels(String[] arr) {

        int countVowels = 0;
        String wordWithMostVowels = "";
        int countOtherWords=0;

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            char[]word = arr[i].toLowerCase(Locale.ROOT).toCharArray();

            for (int j = 0; j < word.length; j++) {
                if(word[j]=='a'){
                    counter++;
                }
                if(word[j]=='e'){
                    counter++;
                }
                if(word[j]=='i'){
                    counter++;
                }
                if(word[j]=='o'){
                    counter++;
                }
                if(word[j]=='u'){
                    counter++;
                }


            }

            if(counter==countVowels){
                countOtherWords++;
            }
            if (counter > countVowels) {
                countVowels = counter;
                wordWithMostVowels = arr[i];
            }

        }
        System.out.println("Das richtige Wort mit den meisten Selbstlauten ist: " + wordWithMostVowels + ". Es hat " + countVowels + " Selbstlaute.");
        if(countOtherWords>0){
            System.out.println("Es gibt noch "+countOtherWords+" Wörter mit "+countVowels+" Selbstlauten.");
        }
    }


}
