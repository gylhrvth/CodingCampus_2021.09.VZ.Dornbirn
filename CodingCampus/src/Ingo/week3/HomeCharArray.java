package Ingo.week3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeCharArray {

    public static void main(String[] args) {
        System.out.println("Bitte gib eine Variable ein: ");
        String myString = scanner.next();
        System.out.println("check scanner");

        char[] myCharArray = myString.toLowerCase().toCharArray();
        int[] letterCount = new int[26];

        for (int i = 0; i < myCharArray.length; i++) {
            char myChar = myCharArray[i];
            int indexOfLetterCcunt = myChar - 97;
            if (indexOfLetterCcunt >= 0 && indexOfLetterCcunt < letterCount.length){
                letterCount[indexOfLetterCcunt]++;
            }
        }
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] != 0) {
                System.out.println(((char) (i - 97)) + " kommt " + letterCount[i] + " mal vor");
            }
        }


    }

    public static Scanner scanner = new Scanner(System.in);

    public static void array() {
        System.out.println("Bitte gebe eine Variable ein");
        String myString = scanner.next();

        char[] myCharArray = myString.toLowerCase().toCharArray();
        int[] letterCount = new int[26];


        for (int i = 0; i < myCharArray.length; i++) {

            char myChar = myCharArray[i];
            int indexOfLetterCount = myChar - 97;
            if (indexOfLetterCount >= 0 && indexOfLetterCount < letterCount.length) {
                letterCount[indexOfLetterCount]++;
            }
        }

        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] != 0) {
                System.out.println(((char) (i + 97)) + " kommt " + letterCount[i] + " mal vor");
            }
        }


    }
}
