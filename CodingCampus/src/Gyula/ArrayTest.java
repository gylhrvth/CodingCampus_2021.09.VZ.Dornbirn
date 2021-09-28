package Gyula;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 5;
        int a3 = -4;
        int a4 = 0;

        int[] a = {2, 5, -4, 0};
        //         index-0   ... index-lengh-1
        System.out.println(a[0]);

        int lengthOfArray = 10;
        int[] b = new int[lengthOfArray];

        b[0] = rnd.nextInt(100);

        for (int i = 0; i < b.length; i++) {
            b[i] = 20 + rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(b));
        System.out.print("[");
        for (int i = 0; i < b.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(20 + b[i]);
        }
        System.out.println("]");


        //TODO: Quellekode von mir durchlesen

        //TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren

        //TODO: Array auflisten mit Arrays.toString() und manuell

        //TODO: Alle Gerade Zahlen auflisten

        //TODO: Primzahlen (nur die Primzahl Experten)

        //TODO: Kleinste Zahl aus der Array (und deren Index)

        //TODO: Größte Zahl aus der Array (und deren Index)

        //TODO: Summe der Zahlen ausgeben

        //TODO: Durchschnitt der Zahlen ausgeben

    }
}
