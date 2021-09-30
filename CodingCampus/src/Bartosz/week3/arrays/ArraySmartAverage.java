package Bartosz.week3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmartAverage {
    public static void main(String[] args) {
        guesses(init());

    }

    public static int init() {
        System.out.println("Wie viele Leute schätzen?");
        Scanner amountPPL = new Scanner(System.in);
        int amount = amountPPL.nextInt();
        return amount;
    }   // return amount

    public static float[] guesses(int amount) {

        float[] guesses = new float[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("whats your guess?");
            Scanner guessScanner = new Scanner(System.in);
            float guess = guessScanner.nextFloat();
            guesses[i] = guess;
        }

        System.out.println("Guesses are : " + Arrays.toString(guesses));

        return guesses;
    }   // return guesses array

    public static void result(char[] guesses) {
        for (int i = 0; i < guesses.length + 1; i++) {
            float number1 = guesses[i];
            float number2 = guesses[i + 1];
            float summ = number1 + number2;
            summ(number1, number2);
            System.out.println("Ergebniss ist : " + summ / guesses.length);
        }
    }    // returns nothing , prints result

    public static float summ(float number1, float number2) {    // returns summ of array
        float summ = number1 + number2;
        summ(summ, number2);
        return summ;
    }
}