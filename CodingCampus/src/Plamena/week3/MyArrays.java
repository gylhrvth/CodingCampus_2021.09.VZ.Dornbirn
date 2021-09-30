package Plamena.week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {

        // TODO Print array with random numbers
        System.out.println("Enter the length of the array with random numbers");
        int[] array = printArray();

        //TODO Print only even numbers
        System.out.println("Print even numbers from array");
        printEvenNumbers(array);

        //TODO Print only prime numbers
        System.out.println("Print prime numbers from array");
        printPrimeNumbers(array);

        //TODO Get the smallest number
        int min = getMin(array);

        //TODO Get the greatest number
        int max = getMax(array);

        //TODO Print the sum of all values inside array

        //     int sum = IntStream.of(array).sum();

        System.out.println("Sum of values: " + sum(array));

        //TODO Print average of all values inside array
        System.out.println("Average of values: " + ((double) sum(array)) / array.length);

        //TODO Print third greatest number of array



    }

    public static int[] printArray() {
        Random rnm = new Random();
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int[] array = new int[lengthOfArray];

        System.out.println("Print array");

        for (int i = 0; i < array.length; i++) {
            array[i] = rnm.nextInt(50);
        }

        System.out.println(Arrays.toString(array));

        return array;
    }

    public static void printEvenNumbers(int[] array) {
        System.out.print("[");
        boolean setComma = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (setComma) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
                setComma = true;
            }
        }
        System.out.println("]");
    }

    public static void printPrimeNumbers(int[] array) {
        System.out.print("[");
        boolean setComma = false;
        for (int i = 0; i < array.length; i++) {

            if (isAPrim(array[i])) {
                if (setComma) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
                setComma = true;
            }
        }
        System.out.println("]");
    }

    public static int getMin(int[] array) {
        int minIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIdx]) {
                minIdx = i;
            }
        }
        System.out.println("Smallest value od this array is: " + array[minIdx] + " on position " + minIdx);
        return array[minIdx];
    }

    public static int getMax(int[] array) {
        int maxIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIdx]) {
                maxIdx = i;
            }
        }
        System.out.println("Greatest value in this array is: " + array[maxIdx] + " on position " + maxIdx);
        return array[maxIdx];
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static boolean isAPrim(int value) {
        for (int i = 2; i < 9; i++) {
            if (value % i == 0 && value != i) {
                return false;
            }
        }
        return true;
    }

}
