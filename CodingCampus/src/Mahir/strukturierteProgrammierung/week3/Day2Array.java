package Mahir.strukturierteProgrammierung.week3;

//TODO: Quellekode von mir durchlesen

//TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren

//TODO: Array auflisten mit Arrays.toString() und manuell

//TODO: Alle Gerade Zahlen auflisten

//TODO: Primzahlen (nur die Primzahl Experten)

//TODO: Kleinste Zahl aus der Array (und deren Index)

//TODO: Größte Zahl aus der Array (und deren Index)

//TODO: Summe der Zahlen ausgeben

//TODO: Durchschnitt der Zahlen ausgeben


import java.util.Arrays;
import java.util.Random;


public class Day2Array {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        int lengthOfArray = 20;
        int[] array = new int[lengthOfArray];

        // manuel
        int[] arr = {7, 58, -13, 110, 72, 38, 25};

        System.out.println(arr[5]);
        System.out.println();

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

        // Init
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        // Print even numbers
        System.out.println("the even numbers are ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

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


        //highest number
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
                pos = i + 1;
            }
        }

        System.out.println("highest number is  " + min + "  on position  " + pos);

        //total result and avarage
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = num + array[i];

        }

        System.out.println("the total result of the array is  " + num);
        System.out.println("avarage of array is  " + (double)num / array.length);


    }


}



