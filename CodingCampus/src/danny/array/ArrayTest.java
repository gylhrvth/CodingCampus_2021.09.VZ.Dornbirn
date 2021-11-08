package danny.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static Random rnd = new Random();

    public static void main(String[] args) {
//        int a1 = 2;
//        int a2 = 5;
//        int a3 = -4;
//        int a4 = 0;
//
//        int[] a = {2, 5, -4, 0};
//        //         index-0   ... index-lengh-1
//        System.out.println(a[0]);
//
//        int lengthOfArray = 10;
//        int[] b = new int[lengthOfArray];
//
//        b[0] = rnd.nextInt(100);
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = 20 + rnd.nextInt(100);
//        }
//        System.out.println(Arrays.toString(b));
//        System.out.print("[");
//        for (int i = 0; i < b.length; i++) {
//            if (i > 0) {
//                System.out.print(", ");
//            }
//            System.out.print(20 + b[i]);
//        }
//        System.out.println("]");


        //TODO: Quellekode von mir durchlesen
        //gelesen

        //TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren

        int[] rand = new int[20];

        for (int i = 0; i < rand.length; i++) {
            rand[i] = rnd.nextInt(20);
        }

        //TODO: Array auflisten mit Arrays.toString() und manuell

        System.out.print(Arrays.toString(rand));

        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i] + ", ");
        }
        System.out.println();
        System.out.println("----------");

        //TODO: Alle Gerade Zahlen auflisten

        for (int i = 0; i < rand.length; i++) {
            if (rand[i] % 2 == 0 && rand[i] != 0) {
                System.out.print(+rand[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("----------");

        //TODO: Primzahlen (nur die Primzahl Experten)

        int prime = rand.length;
        boolean primeZ = true;

        for (int i = 0; i < prime; i++) {
            for (int j = 2; j <= prime; j++) {
                if (prime % j == 0) {
                    primeZ = false;
                }
            }
            if (primeZ) {
                System.out.println(prime + " ist eine Primzahl ");
            }
            prime--;
        }

        //TODO: Kleinste Zahl aus der Array (und deren Index)
        int counter = 0;
        int a = rand[rand.length - 1];
        for (int i = 0; i < rand.length; i++) {
            if (rand[i] < rand.length && rand[i] < a) {
                a = rand[i];
            }
        }
        for (int i = 0; i < rand.length; i++)
            if (a == rand[i]) {
                counter = i + 1;
                break;
            }

        System.out.println("Die kleinste Zahl ist " + a + " und befindet sich an der Stelle " + counter);
        System.out.println("----------");
        //TODO: Größte Zahl aus der Array (und deren Index)
        int counter1 = 0;
        int b = 0;
        for (int i = 0; i < rand.length; i++) {
            if (rand[i] > 0 && rand[i] > b) {
                b = rand[i];
            }
        }
        for (int i = 0; i < rand.length; i++)
            if (b == rand[i]) {
                counter1 = i + 1;
                break;
            }

        System.out.println("Die größte Zahl ist " + b + " und befindet sich an der Stelle " + counter1);
        System.out.println("----------");
        //TODO: Summe der Zahlen ausgeben
        int sum = 0;
        for (int x = 0; x < rand.length; x++) {
            sum += rand[x];
        }
        System.out.println("Die Summe der Zahlen ist " + sum);
        System.out.println("----------");

        //TODO: Durchschnitt der Zahlen ausgeben

        int durschS = sum / rand.length;

        System.out.println("Der Durchschnitt der Zahlen ist " + durschS);
        System.out.println("----------");

        //TODO: 3 Größten Zahln aus der Array (und deren Index)

        int[] array2 = new int[rand.length];
        int counter2 = 4;
        int[] count = new int[counter2];

        for (int i = 0; i < rand.length; i++) {
            int x = rand[i];
            array2[x] = x;
        }
        System.out.println(Arrays.toString(array2));
        int e = 0;
        int r = rand.length - 1;
        for (int s = 0; s <= rand.length - 1; s++) {
            if (array2[r] != 0 && counter2 > 0) {
                count[e] = array2[r];
                counter2--;
                e++;
            }
            r--;
        }
        System.out.print("Die 4 größten Zahlen lauten " + Arrays.toString(count));
        System.out.println();
    }
}



