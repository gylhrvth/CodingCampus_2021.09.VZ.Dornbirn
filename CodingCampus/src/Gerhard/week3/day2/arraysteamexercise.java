package Gerhard.week3.day2;

//TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren

import java.util.Arrays;
import java.util.Random;

public class arraysteamexercise {


    public static Random rnd = new Random();


    public static void main(String[] args) {
//TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe auto:" + "\u001B[0m");
        int[] anArray = new int[20];

        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            anArray[i] = rand.nextInt(11);
        }
        //TODO: Array auflisten mit Arrays.toString() und manuell

        System.out.print(Arrays.toString(anArray));
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe manuell:" + "\u001B[0m");
        for (int j = 0; j < anArray.length; j++) {

            System.out.print(anArray[j]);
            System.out.print(", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe gerade Zahlen:" + "\u001B[0m");
        //TODO: Alle Gerade Zahlen auflisten
        int gerade = 0;
        for (int k = 0; k < anArray.length; k++) {
            if (anArray[k] % 2 == 0) {


                System.out.print(anArray[k]);
                System.out.print(", ");

            }
        }
        //TODO: Primzahlen (nur die Primzahl Experten)
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe der Primzahlen: (not working)" + "\u001B[0m");

        for (int i = 0; i < anArray.length; i++) {
            boolean isPrimzahl = true;
            for (int j = 2; j < anArray[i] && isPrimzahl; j++) {

                if ((anArray[i] % j) == 0) {
                    isPrimzahl = false;
                }
            }
            if (anArray[i]== 0) isPrimzahl = false;
            if (anArray[i]== 1) isPrimzahl = false;
                if (isPrimzahl) {
                    System.out.print(anArray[i]);
                    System.out.print(", ");
                }
        }
        //TODO: Kleinste Zahl aus der Array (und deren Index)
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe der kleinsten Zahl aus dem Array:" + "\u001B[0m");
        // int pos = 0;
        int min = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < anArray[min]) {
                min = i;
                //      pos = i;
            }

        }

        System.out.print("Index = " + min + ", Kleinste Zahl des Arrays: " + anArray[min]);

        //TODO: Größte Zahl aus der Array (und deren Index)
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe der gröten Zahl aus dem Array:" + "\u001B[0m");
        // int pos = 0;
        int max = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > anArray[max]) {
                max = i;
                //      pos = i;
            }

        }
        System.out.print("Index = " + max + ", Größte Zahl des Arrays: " + anArray[max]);

        //TODO: Summe der Zahlen ausgeben

        System.out.println();
        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe der Summe aller Zahlen im Array:" + "\u001B[0m");

        //TODO: Summe der Zahlen ausgeben

        int sum = 0;
        for (int value : anArray) {
            sum += value;
        }
        System.out.println("Die Summe aller Zahlen im Array: " + (sum));

        System.out.println();
        System.out.println("\u001B[36m" + "Ausgabe des Durchschnitts aller Zahlen im Array:" + "\u001B[0m");


        //TODO: Durchschnitt der Zahlen ausgeben
        double cutthrough = 20;
        double result = sum / cutthrough;

        System.out.println("Der Durchschnitt aller Zahlen im Array: " + (result));
    }

}




