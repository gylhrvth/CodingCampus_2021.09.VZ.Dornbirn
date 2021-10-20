package Eray.week6.uebungsBeispiele;

import java.util.Arrays;
import java.util.Random;

public class FillArray {


    public static void main(String[] args) {
        printArrays();
    }

    private static Random random = new Random();

    private static void printArrays() {
        printArrayWithRandomNumbersFromZeroToHundred();
        printEverySecondValue();
        printEveryFifthValue();
        printArrayWithRandomNumbersFromMinus50ToPlus50();
    }

    private static void printArrayWithRandomNumbersFromZeroToHundred() {
        int[] randomNumbers = new int[10];
        int i = 0;
        for (int number : randomNumbers) {
            randomNumbers[i] = random.nextInt(100);
            i++;
        }

        System.out.println("Das erste Array von den Zahlen 0 - 100");
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println();


    }

    private static void printEveryFifthValue(){
        int[] randomNumbers = new int[10];

        //every fifth number
        for (int j = 0; j < randomNumbers.length; j+=5) {
            randomNumbers[j] = random.nextInt(100);
        }
        System.out.println("Gebe jedes 5 Element im Array aus");
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println();

    }

    private static void printEverySecondValue(){
        int[] randomNumbers = new int[10];

        //every second number
        for (int j = 0; j < randomNumbers.length; j+=2) {
            randomNumbers[j] = random.nextInt(100);
        }
        System.out.println("Gebe jedes 2 Element im Array aus");
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println();

    }

    private static void printArrayWithRandomNumbersFromMinus50ToPlus50() {
        int[] randomNumbers2 = new int[100];
        int i = 0;
        for (int number : randomNumbers2) {
            randomNumbers2[i] = random.nextInt(50 + 50) - 50;
            i++;
        }
        System.out.println("Das zweite Array von den Zahlen -50 bis +50");
        System.out.println(Arrays.toString(randomNumbers2));
        System.out.println();
    }

}
