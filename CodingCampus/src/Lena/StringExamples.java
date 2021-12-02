package Lena;


import Lukas.week4.day3.Strings;
import Lukas.week4.day4.Aufgabe1;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        String[] test2 = Aufgabe1.TEXT_TO_ANALYSE_2.split(" ");

        String [] teilnehmner = Strings.ALL_MEMBERS.split(" ");

       // printSortedArrayAsc(teilnehmner);
     //   printSortedArrayDsc(getMembersArray());
      //  getLongestWord(getMembersArray());
      //  getShortestWord(getMembersArray());
      //  printWordWithMostVowels(getMembersArray());
        String[] test = {"a", " ", "Ba3","deebeio", "aaa", "\nhallo", "123abc", "Da", ".:", ",beistrich", "AAA" };

        printSortedArrayAsc(teilnehmner);


        //  printRealWordWithMostVowels(test);

    }

    public static String[] getMembersArray() {
        return Strings.ALL_MEMBERS.split(" ");
    }

    public static void printSortedArrayAsc(String[] arr) {
        Collator col = Collator.getInstance(Locale.GERMANY);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (col.compare(arr[j].toLowerCase(), arr[j + 1].toLowerCase()) > 0) {
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
        String wordWithMostVowels="";
        int countOtherWords=0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            if (arr[i].toLowerCase().contains("a")) {
                counter++;
            }
            if (arr[i].toLowerCase().contains("e")) {
                counter++;
            }
            if (arr[i].toLowerCase().contains("i")) {
                counter++;
            }
            if (arr[i].toLowerCase().contains("o")) {
                counter++;
            }
            if (arr[i].toLowerCase().contains("u")) {
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
            char[]word = arr[i].toLowerCase().toCharArray();

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
