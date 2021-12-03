package Gerhard.week10.selbstKontrolle;

import java.util.Scanner;

public class uebung1 {


    public static void main(String[] args) {

        String satz;
        int anzahl;

        System.out.println();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein: ");
        satz = scanner1.nextLine();
        System.out.println();
        System.out.println("Wie oft soll der Satz ausgegeben werden: ");
        Scanner scanner2 = new Scanner(System.in);
        anzahl = scanner2.nextInt();
        System.out.println();
        System.out.println("Sie haben den folgenden Satz eingegeben:");
        System.out.println(satz);
        System.out.println();
        System.out.println("und wünschen das dieser " + anzahl + " mal ausgegeben wird");
        System.out.println();

        int i = 0;
        while (i < anzahl) {
            System.out.println(satz);
            i++;
        }


    }
}





