package Stefan.thirdWeek.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyArrays {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        int[] zahlen = new int[20];


        // Random Ausgabe Arrey befüllt mit Zahlen
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rnd.nextInt(100);

        }
        System.out.println(Arrays.toString(zahlen));


        // Manuelle Ausgabe des befüllten Arrays
        System.out.print("[");
        for (int i = 0; i < zahlen.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(zahlen[i]);
        }
        System.out.println("]");


        //Nur die geraden Zahlen im Array
        System.out.print("Die geraden Zahlen sind: ");
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] % 2 == 0) {
                System.out.print(+zahlen[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();


        //Kleinste Zahl im Array und die Position
        int pos = 0;
        int min = zahlen[pos];

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
                pos = i;
            }
        }
        System.out.print("Minnimum (auf Index " + pos + "): " + min);
        System.out.println();


        //Grösste Zahl im Array und die Position
        int position = 0;
        int max = zahlen[position];

        for (int i = 0; i < zahlen.length; i++) {
            if (max < zahlen[i]) {
                max = zahlen[i];
                position = i;
            }

        }
        System.out.println("Maximun (auf Index " + position + "): " + max);
        System.out.println();


        //Summe der Zahlen vom Array
        int sum = 0;
        for (int i : zahlen) {
            sum += i;
        }
        System.out.println("Die summe der Zahlen im is: " +sum);
        System.out.println();


        //Durchschnitt der Summe des Arrays
        int summe = 0;
        double durchschnitt = 0;

        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        durchschnitt = summe / (double) zahlen.length;

        System.out.println("Der durchschnittswert der Zahlen ist " + durchschnitt);
        System.out.println();

        // Primzahlen aus dem Array ausgeben
        System.out.print("Die Primzahlen sind: ");
        for (int i = 0; i < zahlen.length; i++) {
            if (isAPrim(zahlen[i])) {
                System.out.print(+ zahlen[i] + ", ");
            }
        }
        System.out.println();
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




