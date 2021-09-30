package Mahir.Week3;

import java.util.Arrays;
import java.util.Random;

public class Day2ArrayMethod {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        int lengthOfArray = 20;
        int[] array = new int[lengthOfArray];

//TODO: Quellekode von mir durchlesen

//TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren
        init(array);

//TODO: Array auflisten mit Arrays.toString() und manuell
        manual(array);

//TODO: Alle Gerade Zahlen auflisten
        evenNumbers(array);

//TODO: Primzahlen (nur die Primzahl Experten)

//TODO: Kleinste Zahl aus der Array (und deren Index)
        lowestNumber(array);

//TODO: Größte Zahl aus der Array (und deren Index)
        highestNumber(array);

//TODO: Summe der Zahlen ausgeben
        resultAndAvarage(array);

//TODO: Durchschnitt der Zahlen ausgeben

    }
    public static void init(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

    }
    public static void manual(int[]array){
        array[0] = rnd.nextInt(100);

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(20 + array[i]);
        }
        System.out.println("]");
        System.out.println();
    }
    public static void evenNumbers(int[]array){
        System.out.println("the even numbers are ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

    }
    public static void lowestNumber(int[]array){
        // lowest number
        int min = array[0];
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i + 1;
            }
        }

        System.out.println("lowest number is " + min + "on position " + pos);
    }

    public static void highestNumber(int[]array){
        int min = array[0];
        int pos = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
                pos = i + 1;
            }
        }

        System.out.println("highest number is  " + min + "  on position  " + pos);
    }
    public static void resultAndAvarage(int[]array){
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = num + array[i];

        }

        System.out.println("the total result of the array is  " + num);
        System.out.println("avarage of array is  " + (double)num / array.length);
    }

}
