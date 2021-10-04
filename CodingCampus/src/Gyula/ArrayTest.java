package Gyula;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        // Check: Quellekode von mir durchlesen

        // Check: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren

        int[] arrayOne = new int[20];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = rnd.nextInt(100);
        }

        //TODO: Array auflisten mit Arrays.toString() und manuell
        printCompletteArray(arrayOne);

        //TODO: Alle Gerade Zahlen auflisten
        printEvenNumbers(arrayOne);

        //TODO: Primzahlen (nur die Primzahl Experten)
        printPrimNumbers(arrayOne);

        //TODO: Kleinste Zahl aus der Array (und deren Index)
        printMinValue(arrayOne);

        //TODO: Größte Zahl aus der Array (und deren Index)
        printMaxValue(arrayOne);

        //TODO: Summe der Zahlen ausgeben
        printSumOfValues(arrayOne);

        //TODO: Durchschnitt der Zahlen ausgeben
        printAvarageOfValues(arrayOne);
    }

    public static void printCompletteArray(int[] values){
        System.out.println("printCompletteArray()");
        System.out.println(Arrays.toString(values));

        System.out.print("[");
        boolean printComma = false;
        for (int i = 0; i < values.length; i++) {
            if (printComma) {
                System.out.print(", ");
            }
            System.out.print(values[i]);
            printComma = true;
        }
        System.out.println("]");
    }

    public static void printEvenNumbers(int[] values){
        System.out.println("printEvenNumbers()");
        System.out.print("[");
        boolean printComma = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                if (printComma) {
                    System.out.print(", ");
                }
                System.out.print(values[i]);
                printComma = true;
            }
        }
        System.out.println("]");
    }

    public static void printPrimNumbers(int[] values){
        System.out.println("printPrimNumbers()");
        System.out.print("[");
        boolean printComma = false;
        for (int i = 0; i < values.length; i++) {
            if (isAPrim(values[i])) {
                if (printComma) {
                    System.out.print(", ");
                }
                System.out.print(values[i]);
                printComma = true;
            }
        }
        System.out.println("]");
    }

    public static boolean isAPrim(int value){
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {return false;}
        }
        return true;
    }

    public static void printMinValue(int[] values){
        System.out.println("printMinValue");
        int idxMinValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[idxMinValue]){
                idxMinValue = i;
            }
        }
        System.out.println("On index " + idxMinValue + " is " + values[idxMinValue]);
    }

    public static void printMaxValue(int[] values){
        System.out.println("printMaxValue");
        int idxMinValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > values[idxMinValue]){
                idxMinValue = i;
            }
        }
        System.out.println("On index " + idxMinValue + " is " + values[idxMinValue]);
    }


    public static void printSumOfValues(int[] values){
        System.out.println("printSumOfValues");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }


    public static void printAvarageOfValues(int[] values){
        System.out.println("printAvarageOfValues");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println((double)sum/values.length);
    }


}
