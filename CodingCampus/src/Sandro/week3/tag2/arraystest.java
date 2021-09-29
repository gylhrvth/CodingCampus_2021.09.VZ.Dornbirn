package Sandro.week3.tag2;

import java.util.Random;
import java.util.Arrays;

public class arraystest {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        int min = 0;

        //Leerzeile und farbige Unterstreichung
        {
            System.out.println();
            System.out.println("\u001B[36m" + "Aufgabe 1: Array mit Größe 20 erstellen, und mit Zufallszahlen initalisieren:" + "\u001B[0m");
        }
        //Leerzeile und farbige Unterstreichung

        //TODO: Array mit Größe 20 erstellen, und mit Zufallzahlen initalisieren
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        //Leerzeile und farbige Unterstreichung
        {
            System.out.println();
            System.out.println("\u001B[35m" + ("____________________________________________________________________________________________________________________________") + "\u001B[0m");
            System.out.println("\u001B[36m" + ("Aufgabe 2: Array auflisten mit Arrays.toString() und manuell") + "\u001B[0m");
        }
        //Leerzeile und farbige Unterstreichung

        //TODO: Array auflisten mit Arrays.toString() und manuell
        System.out.println(Arrays.toString(array));

        //TODO: Array manuell
        for (int f = 0; f < array.length; f++) {
            System.out.print(array[f] + ", ");
        }
        //Leerzeile und farbige Unterstreichung
        {
            System.out.println();
            System.out.println("\u001B[35m" + ("____________________________________________________________________________________________________________________________") + "\u001B[0m");
            System.out.println("\u001B[36m" + ("Aufgabe 3: Alle gerade Zahlen auflisten") + "\u001B[0m");
            System.out.println();
            System.out.println("Gerade Zahlen aller Zeilen: ");
        }
        //Leerzeile und farbige Unterstreichung

        //TODO: Kleinste Zahl aus der Array (und deren Index)
        for (int z = 0; z < array.length; z++) {
            if (array[z] % 2 == 0) {
                System.out.print(array[z] + " ");
            }
        }
        //Leerzeile und farbige Unterstreichung
        {
            System.out.println();
            System.out.println("\u001B[35m" + ("____________________________________________________________________________________________________________________________") + "\u001B[0m");
            System.out.println("\u001B[36m" + ("Aufgabe 4: Kleinste Zahl aus der Array (und deren Index)") + "\u001B[0m");
            System.out.println();
        }
        //Leerzeile und farbige Unterstreichung

        //TODO: Kleinste Zahl aus der Array (und deren Index)
        for (int j = 0; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            System.out.println("Auf Index" + min + " ist der kleinste Wert " + array[min]);
        }
    }








