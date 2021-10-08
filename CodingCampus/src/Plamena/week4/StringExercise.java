package Plamena.week4;

import Lukas.week4.day3.Aufgabe1;
import Lukas.week4.day3.Strings;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args) {
        String testData = Strings.ALL_MEMBERS;


        System.out.println("Create string array: ");
        String[] dataArray = splitAndPrintArray(testData, " ");

        sortStringArrAlphUp(dataArray);
        System.out.println("Sort string array ascending");
        System.out.println(Arrays.toString(dataArray));

        sortStringArrAlphDown(dataArray);
        System.out.println("Sort string array descending");
        System.out.println(Arrays.toString(dataArray));

        System.out.println("Longest input: ");
        System.out.println(getLongestInput(dataArray));

        System.out.println("Shortest input: ");
        System.out.println(getShortestInput(dataArray));

        printVowelsSingleCount(dataArray);
        printVowelsCount(dataArray);




    }

    public static void printVowelsCount(String[] dataArray){
        int vowels = 0;
        int wordIdx = 0;
        int countMax = 0;
        for (int i = 0; i < dataArray.length; i++) {
            char[] tmp = dataArray[i].toLowerCase().toCharArray();
            int counter = 0;
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] == 'a' || tmp[j] == 'o' || tmp[j] == 'u' || tmp[j] == 'i' || tmp[j] == 'e') {
                    counter++;
                }
            }
            if (counter >= vowels) {
                if (counter > vowels) {
                    countMax = 0;
                }
                vowels = counter;
                wordIdx = i;
                countMax++;
            }
        }
        System.out.println("The name with the most vowels counted is " + dataArray[wordIdx] + " with " + vowels + " vowels. There are although " + (countMax - 1) + " more names that contain the same number of vowels.");

    }

    public static void printVowelsSingleCount(String[] dataArray) {
        int vowels = 0;
        int wordIdx = 0;
        int countMax = 0;

        String biggestVowelNames = "";

        for (int i = 0; i < dataArray.length; i++) {
            int counter = 0;
            if (dataArray[i].toLowerCase().contains("a")) {
                counter++;
            }
            if (dataArray[i].toLowerCase().contains("e")) {
                counter++;
            }
            if (dataArray[i].toLowerCase().contains("o")) {
                counter++;
            }
            if (dataArray[i].toLowerCase().contains("u")) {
                counter++;
            }
            if (dataArray[i].toLowerCase().contains("i")) {
                counter++;
            }
            if (counter >= vowels) {
                if (counter > vowels) {
                    countMax = 0;
                }
                vowels = counter;
                wordIdx = i;
                countMax++;
            }
        }

        System.out.println("The name with the most unique vowels counted is " + dataArray[wordIdx] + " with " + vowels + " unique vowels. There are although " + (countMax - 1) + " more names that contain the same number of vowels.");

    }

    public static String getShortestInput(String[] dataArray) {
        int minIdx = 0;
        for (int i = 0; i < dataArray.length - 1; i++) {
            if (dataArray[i].length() < dataArray[minIdx].length()) {
                minIdx = i;
            }
        }

        return dataArray[minIdx];
    }

    public static String getLongestInput(String[] dataArray) {
        int maxIdx = 0;
        for (int i = 0; i < dataArray.length - 1; i++) {
            if (dataArray[i].length() > dataArray[maxIdx].length()) {
                maxIdx = i;
            }
        }

        return dataArray[maxIdx];
    }

    public static void sortStringArrAlphDown(String[] dataArray) {
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = 0; j < dataArray.length - 1; j++) {
                if (dataArray[j].compareTo(dataArray[j + 1]) < 0)
                    swapStrings(dataArray, j);
            }
        }
    }

    public static void sortStringArrAlphUp(String[] dataArray) {
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = 0; j < dataArray.length - 1; j++) {
                if (dataArray[j].compareTo(dataArray[j + 1]) > 0)
                    swapStrings(dataArray, j);
            }
        }
    }

    public static void swapStrings(String[] dataArray, int i) {
        String tmp = dataArray[i];
        dataArray[i] = dataArray[i + 1];
        dataArray[i + 1] = tmp;
    }

    public static String[] splitAndPrintArray(String data, String regex) {
        String[] dataArray = data.split(regex);
        System.out.println(Arrays.toString(dataArray));
        return dataArray;
    }
}
