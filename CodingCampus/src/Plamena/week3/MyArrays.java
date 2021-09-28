package Plamena.week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MyArrays {
    public static void main(String[] args) {

        Random rnm = new Random();

        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int[] array = new int[lengthOfArray];


        System.out.println("Array erstellen und auflisten");

        for (int i = 0; i < array.length; i++) {
            array[i] = rnm.nextInt(50);

        }

        System.out.println(Arrays.toString(array));

        //     for (int i = 0; i < lengthOfArray; i++) {
        //         System.out.print(array[i] + ", ");
        //     }

        System.out.println("Gerade Zahlen auflisten");


        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.println("Primzalhen aulisten");

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (isAPrim(array[i])) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");


        int min = array[0];
        int pos = 0;
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i + 1;
            }
        }
        System.out.println("Die kleinste Zahl ist: " + min);
        System.out.println("Befindet sich an Position: " + pos);

        int max = array[0];

        for (int i = 0; i < lengthOfArray; i++) {
            if(array[i]>max){
                max = array[i];
                pos= i+1;
            }
        }
        System.out.println("Die größte Zahl ist: " + max);
        System.out.println("Befindet sich an Position: " + pos);

   //     int sum = IntStream.of(array).sum();

        int sum = 0;

        for (int i = 0; i < lengthOfArray; i++) {
            sum = sum + array[i];
        }

        System.out.println("Summe der Zahlen ist: " + sum);
        System.out.println("Der Durchschnitt beträgt: " +sum/lengthOfArray);

    }

    public static boolean isAPrim(int value) {
        for (int i = 2; i < 9; i++) {
            if (value % i == 0 && value!=i) {
                return false;
            }
        }
        return true;
    }

}
