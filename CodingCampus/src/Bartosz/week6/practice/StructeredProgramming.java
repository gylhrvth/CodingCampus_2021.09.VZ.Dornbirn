package Bartosz.week6.practice;

import java.util.Scanner;

public class StructeredProgramming {
    public static void main(String[] args) {
        loops2();

    }


    private static void menu(){
        System.out.println("/----------------------Übungsaufgaben Menu----------------------\\");
    }

    private static int inputScan() {
        int input = 0;
        System.out.println();


        return input;
    }

    private static void loops1() {
        System.out.println("----------------------Ex 1----------------------");
        System.out.println("For Schleife:");
        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + " ,");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("While Schleife:");
        int counter = 0;
        while (counter <= 10)
            if (counter < 10) {
                System.out.print(counter + " ,");
                counter++;
            } else {
                System.out.print(counter);
                counter++;
            }
        System.out.println();
        System.out.println("----------------------Ex 2----------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("----------------------Ex 3----------------------");
        for (int i = 0; i <= 10; i +=2) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("----------------------Ex 4----------------------");
        for (int i = 10; i >= -10 ; i--) {
            if(i > -9) {
                System.out.print(" " + i + " ,");
            }else {
                System.out.print(" " + i);
            }
        }
    }

    private static int intScanner() {
        Scanner numbersScanner = new Scanner(System.in);
        return numbersScanner.nextInt();
    }

    private static void printBox(int height, int width){
        for (int h = 0; h <= height; h++) {         // h = reihen gib so lange Reihen aus bis die höhe erreicht ist

            if(h == 0 || h == height) {                 // wenn die erste oder letzte Reihe dran ist
                for (int j = 0; j < width; j++) {       // gib so lange X aus bis die Breite von Variable width erreicht ist
                    System.out.print("X");
                }
                System.out.println();                   // zeilenumbruch nach der ausgegebenen ersten Zeile

            } else {                                        // wenn nicht die erste oder letzte Reihe dran ist

                for (int i = 0; i <= width-1; i++) {           // gib die Zeichen aus bis die Breite erreicht ist
                    if(i == 0 || i == width-1){                    // wenn das erste oder letzte zeichen in der Reihe
                        System.out.print("X");                     // gib X aus
                    } else {                                       // sonst (zwischen dem ersten und letzten Zeichen)
                        System.out.print(".");                      // gib . aus
                    }
                }
                System.out.println();                           // nach ausgegebener Zeile Zeilenumbruch
            }
        }
    }

    private static void loops2() {
        System.out.println("----------------------Ex 5 a)----------------------");

        System.out.println("Geben Sie eine Höhe ein!");
        int height = intScanner();

        System.out.println("Geben sie eine Breite ein!");
        int width = intScanner();

        printBox(height, width);


        System.out.println("----------------------Ex 5 b)----------------------");
        System.out.println("Geben Sie die Höhe & Breite ein");
        int number = intScanner();
        System.out.println("Geben Sie das Zeichen ein!");
        Scanner sc = new Scanner(System.in);
        String borderCharString = sc.next();
        char borderChar = borderCharString.charAt(0);
    }

}

