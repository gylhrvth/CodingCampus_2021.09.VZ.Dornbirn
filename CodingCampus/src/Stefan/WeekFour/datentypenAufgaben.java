package Stefan.WeekFour;

import java.util.Scanner;

public class datentypenAufgaben {
    public static void main(String[] args) {
        //Schreiben Sie ein Java-Programm, um die Temperatur von Fahrenheit in Grad Celsius umzuwandeln.
        Scanner scanner = new Scanner(System.in);

        //Umrechnung Fahrenheit in Celsius
//        System.out.println("Geben Sie eine Temeratur in Fahrenheit ein: ");
//        double input = scanner.nextDouble();
//
//        double sum = (input - 32) / 1.8;
//        sum = Math.round(sum * 100);
//
//        System.out.println(input + " Fahrenheit sind " + sum / 100 + " Grad Celsius!");


        //Umrechnung von Zoll in Meter
//        System.out.println("Geben Sie einen Wert für Zoll ein: ");
//        double input = scanner.nextDouble();
//
//        double sum = input * 0.0254;
//        sum = Math.round(sum * 100);
//
//        System.out.println(input + " Zoll sind " + sum / 100 + " Meter");


        // Schreiben Sie ein Java-Programm, das eine ganze Zahl zwischen 0 und 1000
        // liest und alle Ziffern der ganzen Zahl hinzufügt.
//        Testdaten
//        Geben Sie eine ganze Zahl zwischen 0 und 1000 ein: 565
//        Erwartete Ausgabe :
//        Die Summe aller Ziffern in 565 ist 16


        //Quersumme einer Eingegebenen Zahl
//        System.out.println("Geben Sie eine ganze Zahl zwischen 0 und 1000 ein: ");
//        int summe = scanner.nextInt();
//
//        while (summe < 0 || summe > 1000) {
//            System.out.println("Gib eine Zahl zwischen 1 - 1000 ein!!!");
//            while (!scanner.hasNextInt()) {
//                System.out.println("Sie müssen eine Zahl eingeben");
//                scanner.nextLine();
//            }
//            summe = scanner.nextInt();
//            scanner.nextLine();
//        }
//
//        System.out.println("Quersumme = " + quersumme(summe));
//
//        }

//        public static int quersumme(int zahl) {
//            if (zahl <= 9) return zahl;
//            return zahl%10 + quersumme(zahl/10);
//
//        }

        //Ausgabe der eingegebenen Minuten in Jahren, Tagen und Stunden
        System.out.println("Geben sie dei Minuten ein die Sie umrechenen wollen!");
        int input = scanner.nextInt();

                                                 //int sek = input;
        int min = input;                         //sek/60%60;
        int std = min/60%24;                     //sek/60/60%24;
        int tag = min/60/24%365;                 //sek/60/60/24%365;
        int jah = min/60/24/365;                 //sek/60/60/24/365;

        System.out.println(min + " Minuten entsprechen: " + jah + " Jahren und " + tag + " Tagen " + std + " Stunden!");
    }
}
