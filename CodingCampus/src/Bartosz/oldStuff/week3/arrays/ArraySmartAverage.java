package Bartosz.oldStuff.week3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmartAverage {
    public static int init() {
        System.out.println("Wie viele Leute schätzen?");
        Scanner amountPPL = new Scanner(System.in);
        int amount = amountPPL.nextInt();
        return amount;
    }   // return amount

    public static float[] guesses(int amount) {

        float[] guesses = new float[amount];

        for (int i = 0; i < amount; i++) {      // Solange Werte einscannen bis alle die schätzen wert haben
            System.out.println("Deine schätzung?");
            Scanner guessScanner = new Scanner(System.in);
            float guess = guessScanner.nextFloat();
            guesses[i] = guess;
        }

        System.out.println("Schätzungen sind: " + Arrays.toString(guesses));

        return guesses;
    }   // return guesses array

    public static float calcResult(float[] guesses) {    // returns summ of array
        float summ = 0;
        for (int i = 0; i < guesses.length; i++) {
            summ += guesses[i];
        }
        float result = summ / guesses.length;
        return result;
    }

    public static void main(String[] args) {
        int players = init();     // Anzahl der Leute die raten

        float[] userGuesses = guesses(players);   // Jeder gibt eine Schätzung ab -> wert wird in array abgespeichert
        System.out.println("Durchschnitt ist : " + calcResult(userGuesses));
    }

}

