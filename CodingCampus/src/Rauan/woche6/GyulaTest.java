package Rauan.woche6;

import java.util.Scanner;

public class GyulaTest {
    public static void main(String[] args) {

        //schleifen  - Aufgabe 1
        System.out.println("Aufgabe 1");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //Aufgabe 2
        System.out.println("Aufgabe 2");
        for (int i = -30; i <= 30; i += 3) {
            System.out.println(i);
        }
        //Aufgabe 3
        System.out.println("Aufgabe 3");
        int i = 0;
        while (i <= 10) {
            i++;
            if (i > 6) {
                System.out.println();
                System.out.println();
            }
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Aufgabe 1, Methode");
        printLineStipplel("X", 10);

        //  printLineStipplel("X",10);

        System.out.println("Aufgabe 2, Methode");
        printRowStipple("X", 3);

        System.out.println("Aufgabe 3, Methode");
        printStipplel("X", 3);

        System.out.println("Input Aufgabe:");
        input();

    }

    //Methode, Aufgabe 1
    private static void printLineStipplel(String character, int breit) {
        int line = 10;
        for (int i = 0; i < 10; i++) {
            System.out.print(character);
            System.out.print(" ");
        }
        System.out.println();
    }

    //Aufgabe 2
    private static void printRowStipple(String character, int height) {
        int line = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(character);
            System.out.println(" ");
        }
        System.out.println();
    }



    // private static void printLineStipple(String chars, int length) {
    //System.out.println("Methoden Aufgabe 1");
    //for (int i = 0; i <= length; i++) {
    //  System.out.print(chars + "\s");

    // }
    // System.out.println();
    // }
    private static void printStipplel(String character, int height) {
        int breit = 3;
        int heigh = 3;
        for (int i = 0; i < breit; i++) {
            System.out.print(character);
            System.out.print(" ");
        }
        System.out.println();
        int j = 0;
        while (j < heigh) {
            j++;
            if (j > 1) {
                System.out.println();
                System.out.println();
            }
            System.out.println(character);
        }
        System.out.println();
    }

    // Input
    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen text ein");
        String input = sc.nextLine();

        while (input.isEmpty()) {
            System.out.println("try again");
            input = sc.nextLine();
        }
        System.out.println("wie oft soll der text ausgegeben werden");
        while (!sc.hasNextLine()) {
            System.out.println("type again");
            sc.nextLine();
        }
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(input);

        }
    }
}




