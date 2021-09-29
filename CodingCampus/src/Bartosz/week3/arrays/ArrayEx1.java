package Bartosz.week3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx1 {

    public static Random rnd = new Random();            // Random methode importieren

    public static int[] init() {

        System.out.println("Legen Sie die Breite des Arrays fest! (1 - 20) ");
        Scanner scannerArrayLength = new Scanner(System.in);
        int arrayLength = scannerArrayLength.nextInt();     // Scanner Array Länge

        int[] myArray = new int[arrayLength];       // Array initialisieren

        for (int i = 0; i < myArray.length; i++) {      // Befüllen der Index mit Zufallszahlen
            myArray[i] = rnd.nextInt(100);
        }

        return myArray;     // Rückgabe der Indexwerte
    }

    public static void printEvenNumbers(int[] myArray) {
        System.out.print("[");  // manuelles Array öffnen

        for (int aindex = 0; aindex < myArray.length-1; aindex++) {

            if(myArray[aindex] % 2 == 0) {      // wenn der modulo Zahl dividiert durch zwei 0 ist Zahl ausgeben
                System.out.print(myArray[aindex]);
                System.out.print(", ");
            }
        }
        System.out.print("]");  // manuelles Array schließen
    }

    public static void printPrimeNumbers(int[] values){
        System.out.println("Prime numbers:");
        System.out.print("[");
        boolean printComma = false;
        for (int i = 0; i < values.length; i++) {
            if (isAPrime(values[i])) {
                if (printComma) {
                    System.out.print(", ");
                }
                System.out.print(values[i]);
                printComma = true;
            }
        }
        System.out.println("]");
    }

    public static boolean isAPrime(int value){
        for (int i = 2; i < value-1; i++) {
            if (value % i == 0) {
                //System.out.println(value + " is NOT prim");
                return false;
            }
        }
        //System.out.println(value + " is a prim");
        return true;
    }

    public static void summMethod(int[] myArray) {

        System.out.print("[");
        double summ = 0;
        for (int j = 0; j < myArray.length; j++) {
            summ = myArray[j] + summ;
            System.out.print(myArray[j]);
            if(j < myArray.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        double result = summ / myArray.length;
        System.out.println("Summe ist : " + summ);
        System.out.println("Durchschnitt ist : " + result);
    }

    public static int[] sortedNumber(int[] myArray) {
        Arrays.sort(myArray);
        System.out.println("The smallest Number inside the array is : " + myArray[0] + " on index 0");
        System.out.println("The biggest Number inside the array is : " + myArray[myArray.length-1] + " on index " + myArray.length);
        return myArray;
    }



    public static void main(String[] args) {
        int[] myArray = init();
        printPrimeNumbers(myArray);
    }

}
