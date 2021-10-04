package Oemer.Week3;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        int[] array1 = new int[]{2010, 2015, 2020};
        System.out.println(java.util.Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Index: " + i + ">" + array1[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein:");

        String input = scanner.nextLine();

        System.out.println(input);


        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + "  ");
        }
        System.out.println();
    }


    public static void printReverse(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();

    }


    public static String reverseString(char[] letters) {
        String tmp = "";
        for (int i = 0; i < letters.length; i++) {
            tmp += letters[i];
        }
        return tmp;
    }

    public static String reverseStringWithArray(char[] letters) {
        char[] tmp = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            tmp[i] = letters[i];
        }
        String reverseString = new String(tmp);
        return reverseString;
    }

    public static String reverseStringInPlace(char[] letters) {
        char tmp;
        for (int i = 0; i < letters.length; i++) {

        }
        return new String(letters);
    }


    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();


    }

}