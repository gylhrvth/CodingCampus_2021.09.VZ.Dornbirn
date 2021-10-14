package Stjepan;

import java.util.Arrays;
import java.util.Random;

public class StArray {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        int[] zahlen = new int[20];
        // random angaben auswerfen

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rnd.nextInt(100);

        }
        System.out.println(Arrays.toString(zahlen));

        System.out.print("[");
        for (int i = 0; i < zahlen.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(zahlen[i]);
        }
        System.out.println("]");

        // nur geraden zahlen

        for (int i = 0; i < zahlen.length; i++)
            if (zahlen[i] % 2 == 0) {
                System.out.print(zahlen[i] + ", ");
            }
        // grösste zahl mit arry position
        int position = 0;
        int max = zahlen[position];

        for (int i = 0; i < zahlen.length; i++) {
            if (max < zahlen[i]) {
                max = zahlen[i];
                position = i;
            }


        }
        System.out.println("Maximum (auf index" + position + "): " + max);


        // summe der zahlen im array

        int sum = 0;
        for (int i : zahlen) {
            sum += i;
        }
        System.out.println(sum);


        // Durchschnitt der Summe im Array

        double durchschnitt = 0;
        int summe = 0;

        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];


        }
        durchschnitt = summe / (double) zahlen.length;

        System.out.println("Der durchschnitt des arrays ist " + durchschnitt);

        for (int i = 0; i < zahlen.length; i++) {

        }

        // Primzahlen aus dem Array ausgeben
        System.out.print("Die Primzahlen sind: ");
        for (int i = 0; i < zahlen.length; i++) {
            if (isAPrim(zahlen[i])) {
                System.out.print(+ zahlen[i] + ", ");
            }
        }
    }



    public static boolean isAPrim(int value) {
        for (int testValue = 2; testValue <= (int) Math.sqrt(value); testValue++) {
            if (value % testValue == 0) {
                return false;
            }
        }

        return true;
    }
}
