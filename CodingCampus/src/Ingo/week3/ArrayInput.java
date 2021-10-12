package Ingo.week3;

import java.util.Scanner;

public class ArrayInput {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        reverseArrayVarianteA();
//        System.out.println();
//        reverseArrayVarianteB();

        array();

    }

    public static void reverseArrayVarianteA() {
        System.out.println("Bitte gebe eine Variable ein");
        String myString = scanner.next();

        char[] myCharArray = myString.toCharArray();


        String reverse = "";
        for (int i = myCharArray.length - 1; i >= 0; i--) {
            reverse += myCharArray[i];
        }
        System.out.println(reverse);
    }

    public static void reverseArrayVarianteB() {
        System.out.println("Bitte gebe eine Variable ein");
        String myString = scanner.next();

        char[] myCharArray = myString.toCharArray();

        char[] reverseCharArray = myString.toCharArray();


        for (int i = 0; i < myCharArray.length; i++) {
            reverseCharArray[myCharArray.length - i - 1] = myCharArray[i];
        }

        String reverse = new String(reverseCharArray);
        System.out.println(reverse);
    }

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
