package Plamena.week3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your statement");
        String input = sc.nextLine();


        System.out.println(reverseInputCharString(input));
        System.out.println(reverseInputWithString(input));
        printLetterCount(input);

    }

    public static void printLetterCount(String input) {

        char[] inputCharacters = input.toLowerCase().toCharArray();
        int[] letters = new int[26];


        for (char character : inputCharacters) {
            int letterIdx = character - 97;
            if (letterIdx >= 0 && letterIdx < letters.length) {
                letters[letterIdx]++;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0)
                System.out.println("There is " + letters[i] + " " + ((char) +(i + 97)) + " in your statement");
        }

    }

    public static String reverseInputWithString(String input) {

        char[] inputToCharArray = input.toCharArray();

        String reverse = "";
        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            reverse += inputToCharArray[i];
        }
        return reverse;
    }

    public static void printReverseInputStringBuilder(String input) {

        char[] inputToCharArray = input.toCharArray();
        char[] inputReversion = new char[inputToCharArray.length];

        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            inputReversion[inputToCharArray.length - (i + 1)] = inputToCharArray[i];
        }

        System.out.println(inputReversion);
    }

    public static String reverseInputCharString(String input) {

        StringBuilder reverseInput = new StringBuilder();

        char[] inputToCharArray = input.toCharArray();

        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            reverseInput.append(input.charAt(i));
        }

        return new String(reverseInput);
    }
}
