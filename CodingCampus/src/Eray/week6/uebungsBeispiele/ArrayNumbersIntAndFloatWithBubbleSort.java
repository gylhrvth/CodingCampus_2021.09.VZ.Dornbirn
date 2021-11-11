package Eray.week6.uebungsBeispiele;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumbersIntAndFloatWithBubbleSort {
    public static void main(String[] args) {
        printSortedArray();
    }

    private static void printSortedArray() {
        System.out.println("Sorted Array with Data Type Int: ");
        printIntArraySorted();

        System.out.println();

        System.out.println("Sorted Array with Data Type Float: ");
        printFloatArraySorted();
    }

    private static final Random random = new Random();

    private static void printIntArraySorted() {
        int[] randomNumbers = new int[20];

        for (int j = 0; j < randomNumbers.length; j++) {
            randomNumbers[j] = random.nextInt(50);
        }
        swapInt(randomNumbers);


        System.out.println(Arrays.toString(randomNumbers));
    }

    private static void printFloatArraySorted() {
        float[] randomNumbers = {0.3f, 3.3f, 1.3f, 5.2f, 1.2f, -5.3f, -2.2f, -10.2f, 0.00f, 20.00f};
        swapFloat(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
    }

    protected static void swapFloat(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    float tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }

    private static void swapInt(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }
}
