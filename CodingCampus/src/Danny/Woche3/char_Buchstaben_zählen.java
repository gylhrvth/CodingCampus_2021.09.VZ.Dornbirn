package Danny.Woche3;

import java.util.Scanner;

public class char_Buchstaben_zählen {
    public static void main(String[] args) {
        //2)

        //Text aus Kommandozeile einlesen
        System.out.println("Bitte Text eingeben");
        Scanner eingabe = new Scanner(System.in);
        String aufgabe2S = eingabe.nextLine();
        //Buchstaben case insensitive Zählen (A zählt für a)
        char[] cout = aufgabe2S.toCharArray();
        int[] quantityLetters = new int[26];

        for (int o = 0; o <= cout.length - 1; o++) {
            if (cout[o] > 96 && cout[o] < 123) {
                quantityLetters[cout[o] - 97]++;
            }
        }
        for (int a = 0; a <= quantityLetters.length - 1; a++) {
            int f = a + 97;
            System.out.println(((char) f) + " ist " + quantityLetters[a] + " vorhanden");
        }

        //und ausgeben wie oft jeder Buchstabe vorkommt
        //TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen




    }

}
