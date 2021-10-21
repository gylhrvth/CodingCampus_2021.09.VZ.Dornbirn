package Stefan.WeekSix;

import java.util.Arrays;
import java.util.Random;

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
        //Gibt das ganze Array aus
//        randomNumbers();

        //Gibt den 2, 5, und 10 Wert aus
//        randomNumbers1();

        //Gibt jeden 2ten Index aus
//        randomNumbers2();


        //Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
//        randomNumbersCrazyRange();

        //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000.
        //Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt.
        //Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben).
        //In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.
//        randomNumbersThMin();
//        randomNumbersThMax();
//        randomDurchschnitt();
//        randomBubbleSortAufsteigen();
//        randomBubbleSortAbsteigend();

        //Verwende das gegebene String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
        //Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
        // Der Aufruf und die Ausgabe erfolgt in der main Methode.

        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Ömer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
//        bubbleSortStringAufsteigen(names);
//        bubbleSortStringAbsteigend(names);


    }


    /**
     * Arrays Methoden
     */


    //String Names Aufsteigend Sortiert
    public static void bubbleSortStringAufsteigen(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    String word = names[i];
                    names[i] = names[j];
                    names[j] = word;
                }
            }
            System.out.println(names[i]);
        }
    }

    //String Names Absteigend Sortiert
    public static void bubbleSortStringAbsteigend(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) > 0) {
                    String word = names[i];
                    names[i] = names[j];
                    names[j] = word;
                }
            }
            System.out.println(names[i]);
        }
    }


    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000 und gib den durchschnittswert aus.
    public static void randomDurchschnitt() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;
        int summe = 0;
        double durchschnitt = 0;
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        durchschnitt = summe / (double) zahlen.length;

        System.out.println(Arrays.toString(zahlen));
        System.out.println("Der durchschnittswert der Zahlen ist " + durchschnitt);
    }

    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000 und gib den kleinsten Wert aus.
    public static void randomNumbersThMin() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;
        int pos = 0;
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        int min = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
                pos = i;
            }
        }
        System.out.println(Arrays.toString(zahlen));
        System.out.println(Arrays.toString(new String[]{"Kleinste Zahl: " + min + " auf Position: " + pos}));
    }


    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000 und gib den grössten Wert aus.
    public static void randomNumbersThMax() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;
        int pos = 0;
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        int max = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
                pos = i;
            }
        }
        System.out.println(Arrays.toString(zahlen));
        System.out.println(Arrays.toString(new String[]{"Grösste Zahl: " + max + " auf Position: " + pos}));
    }


    //Gibt den ganzen Array aus
    public static void randomNumbers() {
        int[] zahlen = new int[10];
        int obergrenze = 100;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }

        System.out.println(Arrays.toString(zahlen));

    }

    //Gibt den 2, 5, 10 Wert des Arrays aus
    public static void randomNumbers1() {
        int[] zahlen = new int[10];
        int obergrenze = 100;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        //Gibt bestimmte Positionen des  Array aus
        System.out.print(zahlen[1] + ", ");
        System.out.print(zahlen[6] + ", ");
        System.out.print(zahlen[9]);
    }

    //Gibt jeden zweiten Index des Arrays aus
    public static void randomNumbers2() {
        int[] zahlen = new int[10];
        int obergrenze = 100;
        System.out.println("Gibt jeden zweiten Index aus: ");
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
            if (i % 2 == 1) {
                System.out.print(zahlen[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Zum vergleichen das ganze Array: \n" + Arrays.toString(zahlen));
    }


    //Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
    public static void randomNumbersCrazyRange() {
        int[] zahlen = new int[10];
        int obergrenze = 100;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze) - 50;
        }
        System.out.println(Arrays.toString(zahlen));
    }

    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000.
    public static void randomNumbersTh() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        System.out.println(Arrays.toString(zahlen));
    }

    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000 BubbleSort aufsteigend.
    public static void randomBubbleSortAufsteigen() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        int n = zahlen.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (zahlen[j] > zahlen[j + 1]) {
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(zahlen));
    }

    //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000 BubbleSort absteigend.
    public static void randomBubbleSortAbsteigend() {
        int[] zahlen = new int[10];
        int obergrenze = 1000;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = new Random().nextInt(obergrenze);
        }
        int n = zahlen.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (zahlen[j] < zahlen[j + 1]) {
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(zahlen));
    }


    /**
     * Methoden & Schleifen
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
