package Stefan.WeekSix;

import java.util.Random;
import java.util.Scanner;

public class UebungenVonLukas {


    public static void main(String[] args) {
        /**
         * Schleifen
         */

        //Zähle in einer for-Schleife von 0 bis inklusive 10 und gib die Zahlen aus.
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

        //Zähle in einer while-Schleife von 0 bis inklusive 10 und gib die Zahlen aus.
//        int i = 0;
//        while (i<=10) {
//            System.out.println(i);
//            i++;
//        }

        //Zähle in einer for-Schleife von 0 bis exklusive 10 und gib die Zählvariable aus.
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

        //Zähle in einer while-Schleife von 0 bis exklusive 10 und gib die Zählvariable aus.
//        int j = 0;
//        while (j < 10) {
//            System.out.println(j);
//            j++;
//        }

        //Zähle in einer Schleife von 0 bis inklusive 10 gib nur jede gerade Zahl aus.
//        for (int i = 0; i <= 10 ; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        //Modifiziere die Zählvariable so, dass die Zählvariable nur jede gerade Zahlen enthält
        //?????????????????????????????????????????????????????


        /**
         * Methoden und Schleifen
         */

        //Methode 1:
        //Erstelle eine Methode die eine bestimmte Anzahl parameterisierbarer Zeichen einer Zeile ausgibt. (printChars("x", 10)
//        printChars(10, "x");


        //Methode 2:
        // Erstelle eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt.
//        printSquare(10, "A");

        //Methode 3:
        //Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,
        //weiters soll der Parameter backslash angegeben werden können. Wenn backslash wahr ist,
        //soll die Diagonale von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.
//        printSlash(3, "x");

        //Methode 4:
        //Erstelle eine Methode welche ein Dreick von variabler Größe und mit angegebene Zeichen ausgibt.
        //Dabei sollen die angegebene Größe die Höhe des Dreicks sein.
        //Nimm an dass die Zahl immer Ungerade ist.
//        printTriangle(5,"x");

        //Methode 5:
        //Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt.
        //Die Größe soll dabei die Höhe des Rhombus sein.
//        printRhombus(9, "x");

        //Methode 6:
        //Erstelle eine Methode welche ein X von variabler Größe und mit angegebene Zeichen ausgibt.
//        printX(3, "x");

        //Scanner Eingabe mit Ausgabe:
        //Lies mit Hilfe des berühmten Scanners einen String des Benutzers ein und gib diesen aus.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Gib was ein: ");
//        String input = scanner.nextLine();
//        System.out.println("Sie haben: " + input);

        //Scanner Eingabe mit Ausgabe:
        //Frag solange nach einer Zahl bis auch eine eingegeben wurde, das Programm darf bei Fehleingabe nicht abstürzen.
        //???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Gib eine Zahl ein: ");
//        int input = scanner.nextInt();
//        System.out.println("Sie haben: " + input);


        //Arreys
        //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.


    }

    /**
     * Arrays Methoden
     */








    /**
     * Methoden & Schleifen
     * @param param
     * @param zeichen
     */
    //Methode 1:
    public static void printChars(int param, String zeichen) {

        for (int i = 0; i < param; i++) {
            System.out.print(zeichen);
        }
    }

    //Methode 2:
    public static void printSquare(int param, String zeichen) {

        String spaces = " ";

        for (int i = 0; i < param; i++) {
            System.out.print(zeichen);
        }

        System.out.println();
        for (int k = 0; k < param - 2; k++) {
            System.out.print(zeichen);
            for (int i = 0; i < param - 2; i++) {
                System.out.print(spaces);
            }
            System.out.println(zeichen);
        }

        for (int j = 0; j < param; j++) {
            System.out.print(zeichen);
        }
    }

    //Methode 3:
    public static void printSlash(int param, String zeichen) {
        String spaces = " ";
        for (int i = 0; i < param; i++) {
            System.out.println(zeichen);
            for (int j = -1; j < i; j++) {
                System.out.print(spaces);
            }
        }
        System.out.println();

        for (int i = param; i > 0; i--) {
            for (int j = +1; j < i; j++) {
                System.out.print(spaces);
            }
            System.out.println(zeichen);
        }
    }

    //Methode 4:
    public static void printTriangle(int hight, String zeichen) {
        int nhight = hight * 2 - 1;
        String spaces = " ";
        for (int i = 1; i < hight + 1; i++) {
            for (int k = 0; k < nhight; k++) {
                if ((k > (nhight / 2) - i) && (k < (nhight / 2) + i)) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(spaces);
                }
            }
            System.out.println();
        }
    }

    //Methode 5:
    public static void printRhombus(int hight, String zeichen) {
        String spaces = " ";
        for (int i = 0; i < hight; i++) {
            if (hight < i * 2 + 2) {
                for (int j = 1; j < hight - i; j++) {
                    System.out.print(spaces);
                }
                for (int j = hight; j < i * 2 + 2; j++) {
                    System.out.print(zeichen);
                }
                System.out.println("");
            }
        }
        for (int i = hight - 1; i > 0; i--) {

            for (int j = 0; j < hight - i; j++) {
                System.out.print(spaces);
            }
            for (int j = hight - i; j < i; j++) {
                System.out.print(zeichen);
            }
            System.out.println("");
        }
    }

    //Methode 6:
    public static void printX(int hight, String zeichen) {
        String spaces = " ";
        int stars = hight;
        for (int i = hight; i > 0; i--) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(spaces);
            }
            for (int j = hight - i; j < i; j++) {
                System.out.print(zeichen);
            }
            System.out.println("");
            if (i - (stars - i) == 1) {
                i = 0;
            }
        }

        for (int i = 0; i < hight; i++) {
            if (hight < i * 2 + 2) {
                for (int j = 1; j < hight - i; j++) {
                    System.out.print(spaces);
                }
                for (int j = hight; j < i * 2 + 2; j++) {
                    System.out.print(zeichen);
                }
                System.out.println("");
            }
        }
    }
}
