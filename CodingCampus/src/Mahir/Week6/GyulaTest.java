package Mahir.Week6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GyulaTest {
    public static void main(String[] args) {
        //reversecount();                       //Aufgabe 1
        //countEveryThird();                    //Aufgabe 2
        //whileLoop();                          //Aufgabe 3
        //printLineStipple("x",10);             //Methoden Aufgabe 1
        //printRowStipple("x",10);              //Methoden Aufgabe 2
        //printStrippleL("x",10);               //Methoden Aufgabe 3
        //input();                              //Input

        //minimum(rndIntArr(20));               //Arrays Aufgabe 2 Minimum
        //maximum(rndIntArr(20));               //Arrays Aufgabe 2 Maximum
        


    }
    private static void avarage(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];

            
        }
    }
    
    private static void maximum (int[] arr){
        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(tmp < arr[i]){
                tmp = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max value from the Array is " + tmp);
    }

    private static void minimum (int[] arr){
        int tmp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(tmp > arr[i]){
                tmp = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min value from the Array is " + tmp);
    }

    private static void getFirstAndLast (int[] arr){


    }
    private static int[] rndIntArr (int length){
        Random rnd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }
        return arr;
    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie einen Text ein:");

        String text = scanner.nextLine();
        while (text.isEmpty()) {
            System.out.println("invalid input pleas try again");
            text = scanner.nextLine();
        }

        System.out.println("Wie oft soll der Text ausgegeben werden:");
        while (!scanner.hasNextInt()) {
            System.out.println("invalid input pleas try again");
            scanner.nextLine();
        }
        int times = scanner.nextInt();
        for (int i = 0; i <= times; i++) {
            System.out.println(text);

        }
    }

    private static void printStrippleL(String chars, int length) {
        System.out.println("Methoden Aufgabe 3");
        printLineStipple(chars, length);
        printRowStipple(chars, length);
        System.out.println();
    }

    private static void printRowStipple(String chars, int length) {
        //System.out.println("Methoden Aufgabe 2");
        for (int i = 0; i <= length; i++) {
            System.out.print(chars + "\n");

        }
        System.out.println();

    }

    private static void printLineStipple(String chars, int length) {
        //System.out.println("Methoden Aufgabe 1");
        for (int i = 0; i <= length; i++) {
            System.out.print(chars + "\s");

        }
        System.out.println();
    }

    private static void whileLoop() {
        System.out.println("Aufgabe 3");
        int i = 0;
        while (i <= 10) {
            i++;
            if (i > 5) {
                System.out.println();
                System.out.println();
            }
            System.out.println(i);
        }
        System.out.println();
    }

    private static void countEveryThird() {
        System.out.println("Aufgabe 2");
        for (int i = -30; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            }

        }
        System.out.println();
    }

    private static void reversecount() {
        System.out.println("Aufgabe 1");
        for (int i = 10; i >= 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
