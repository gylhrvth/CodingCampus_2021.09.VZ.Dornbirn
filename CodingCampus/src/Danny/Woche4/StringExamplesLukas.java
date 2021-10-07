package Danny.Woche4;


import Lukas.week4.day3.Strings;

import java.util.Arrays;

public class StringExamplesLukas {

//    Strings und Arrays</h1>

    public static void main(String[] args) {
// * <i>Verwende für folgende Aufgabe die Lukas.week4.day3.Strings.ALL_MEMBERS Variable.</i>
//        Zerlege den String in ein Array.

        String[] membersArray = Strings.ALL_MEMBERS.split(" ");
        System.out.println(Arrays.toString(membersArray));
//        sortAndPrintStringAlphabethUpper(membersArray);
//        sortAndPrintStringAlphabethLower(membersArray);
        smallestLengthChar(membersArray);
        biggestLengthChar(membersArray);
        stringContains(membersArray);
        System.out.println();
        zaehlenString(membersArray);
    }

    //    <li>Sortiere das Array alphabetisch aufsteigend und gib es aus<br><small>verwende compareTo</small></li>
    public static void sortAndPrintStringAlphabethUpper(String[] membersArray) {
        for (int i = 0; i < membersArray.length; i++) {
            int index = i;
            String smallest = membersArray[i];
            for (int x = i; x < membersArray.length; x++) {
                if (membersArray[x].compareTo(smallest) < 0) {
                    index = x;
                    smallest = membersArray[x];
                }
            }
            if (membersArray[i].compareTo(smallest) != 0) {
                String temp = membersArray[i];
                membersArray[i] = membersArray[index];
                membersArray[index] = temp;
            }
        }
        System.out.println(Arrays.toString(membersArray));
    }

    //    <li>Sortiere das Array alphabetisch absteigend und gib es aus<br><small>verwende compareTo</small></li>
    public static void sortAndPrintStringAlphabethLower(String[] membersArray) {
        for (int i = 0; i < membersArray.length; i++) {
            int index = i;
            String smallest = membersArray[i];
            for (int x = i; x < membersArray.length; x++) {
                if (membersArray[x].compareTo(smallest) > 0) {
                    index = x;
                    smallest = membersArray[x];
                }
            }
            if (membersArray[i].compareTo(smallest) != 0) {
                String temp = membersArray[i];
                membersArray[i] = membersArray[index];
                membersArray[index] = temp;
            }
        }
        System.out.println(Arrays.toString(membersArray));
    }

    //    <li>Gib das/die Element(e) mit den wenigsten Zeichen aus<br><small>verwende length()</small></li>
    public static void smallestLengthChar(String[] membersArray) {
        int smallerstCharIndex = 0;
        int counter = 0;

        for (int i = 0; i < membersArray.length - 1; i++) {
            if (membersArray[i].length() < membersArray[smallerstCharIndex].length()) {
                smallerstCharIndex = i;

            }
            if (membersArray[i].length() == membersArray[smallerstCharIndex].length()) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println(membersArray[smallerstCharIndex]);
        } else {
            for (int i = 0; i < membersArray.length - 1; i++) {
                if (membersArray[i].length() == membersArray[smallerstCharIndex].length()) {
                    System.out.print(membersArray[i] + ", ");
                }
            }
        }
        System.out.println();
    }

    //    <li>Gib das/die Element(e) mit den meisten Zeichen aus<br><small>verwende length()</small></li>
    public static void biggestLengthChar(String[] membersArray) {
        int smallerstCharIndex = 0;
        int counter = 0;


        for (int i = 0; i < membersArray.length - 1; i++) {
            if (membersArray[i].length() > membersArray[smallerstCharIndex].length()) {
                smallerstCharIndex = i;

            }
            if (membersArray[i].length() == membersArray[smallerstCharIndex].length()) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println(membersArray[smallerstCharIndex]);
        } else {
            for (int i = 0; i < membersArray.length - 1; i++) {
                if (membersArray[i].length() == membersArray[smallerstCharIndex].length()) {
                    System.out.print(membersArray[i] + ", ");
                }
            }
        }
        System.out.println();
    }

    public static void stringContains(String[] membersArray) {
        int indexBiggestCount = 0;
        int biggestCount = 0;

        for (int i = 0; i < membersArray.length; i++) {
            int count = 0;
            if (membersArray[i].contains("a")) {
                count++;
            }
            if (membersArray[i].contains("e")) {
                count++;
            }
            if (membersArray[i].contains("i")) {
                count++;
            }
            if (membersArray[i].contains("o")) {
                count++;
            }
            if (membersArray[i].contains("u")) {
                count++;
            }
            if (count > biggestCount) {
                indexBiggestCount = i;
                biggestCount = count;

            }
        }

        System.out.println("Das Wort mit den meisten Selbstlauten heißt " + membersArray[indexBiggestCount]);
    }

    public static void zaehlenString(String[] membersArray) {

        int indexBiggestCount = 0;
        int biggestCount = 0;

        char[] selbstlaute = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < membersArray.length; i++) {
            char[] membersChar = membersArray[i].toCharArray();
            int count = 0;

            for (int j = 0; j < membersChar.length - 1; j++) {
                for (int k = 0; k < selbstlaute.length; k++) {
                    if (membersChar[j] == selbstlaute[k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > biggestCount) {
                indexBiggestCount = i;
                biggestCount = count;
            }

        }

        System.out.println("Das Wort mit den meisten Selbstlauten heißt " + membersArray[indexBiggestCount]);
        System.out.println("Es hat  " + biggestCount + " Selbstlaute.");

    }

}
