package Mahir.Week3;
//1)
//Leichte Aufgabe zum Aufwärmen
//Eine Zeile aus der Kommandozeile einlesen
//Zeile ausgeben
//Zeile in Character Array verwandeln und umdrehen
//Umgedrehte Zeile ausgeben

//Eine Zeile aus der Kommandozeile einlesen
//Zeile ausgeben
//Zeile in Character Array verwandeln und umdrehen
//Umgedrehte Zeile ausgeben
//Variante a) Direkt umgedreht ausgeben
//Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
//Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
//Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben

//2)
//Text aus Kommandozeile einlesen
//Buchstaben case insensitive Zählen (A zählt für a)
//und ausgeben wie oft jeder Buchstabe vorkommt
//TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen

import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String hallo = scanner.next();
        char[] arr = hallo.toCharArray();

        //1a)
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //1b)
        String hallo2 = "";


        for (int i = arr.length - 1; i >= 0; i--) {
            hallo2 += arr[i];

        }
        System.out.println(hallo2);

        //1c)

        char[] newArr = hallo2.toCharArray();

        for (int i = newArr.length - 1; i >= 0; i--) {

            System.out.println();
        }





    }

}





