package Eray.week6.uebungsBeispiele;

import java.util.Arrays;

public class NumberOperationReplaceAll3 {
    public static void main(String[] args) {

        printAll();
    }

    private static void printAll() {
        String numbers = "749813247132984712039487123049871204398712039487";
        replaceAllNumbersFromZeroToNine(numbers);
        replaceAllNumbersFromOneToNine(numbers);
        replaceAllNumbersFromTwoToFour(numbers);
        replaceAllNumbersFrom1To3And6To9(numbers);
    }

    private static void replaceAllNumbersFromZeroToNine(String numbers) {
        char[] numbersArray = numbers.toCharArray();
        char[] deletingNumbersArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < deletingNumbersArray.length; j++) {
                if (numbersArray[i] == deletingNumbersArray[j]) {
                    numbersArray[i] = ' ';
                }
            }

        }
        System.out.println("Alle Zahlen von 0 bis 9 gelöscht");
        System.out.println(Arrays.toString(numbersArray));
    }

    private static void replaceAllNumbersFromOneToNine(String numbers) {
        char[] numbersArray = numbers.toCharArray();
        char[] deletingNumbersArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < deletingNumbersArray.length; j++) {
                if (numbersArray[i] == deletingNumbersArray[j]) {
                    numbersArray[i] = ' ';
                }
            }

        }
        System.out.println("Alle Zahlen von 1 bis 9 gelöscht");
        System.out.println(Arrays.toString(numbersArray));
    }

    private static void replaceAllNumbersFromTwoToFour(String numbers) {
        char[] numbersArray = numbers.toCharArray();
        char[] deletingNumbersArray = {'2', '3', '4'};

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < deletingNumbersArray.length; j++) {
                if (numbersArray[i] == deletingNumbersArray[j]) {
                    numbersArray[i] = ' ';
                }
            }

        }
        System.out.println("Alle Zahlen von 2 bis 4 gelöscht");
        System.out.println(Arrays.toString(numbersArray));
    }

    private static void replaceAllNumbersFrom1To3And6To9(String numbers) {
        char[] numbersArray = numbers.toCharArray();
        char[] deletingNumbersArray = {'1', '2', '3', '6', '7', '8', '9'};

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < deletingNumbersArray.length; j++) {
                if (numbersArray[i] == deletingNumbersArray[j]) {
                    numbersArray[i] = ' ';
                }
            }

        }
        System.out.println("Alle Zahlen von 1 bis 3 und 6 bis 9 gelöscht");
        System.out.println(Arrays.toString(numbersArray));
    }

}
