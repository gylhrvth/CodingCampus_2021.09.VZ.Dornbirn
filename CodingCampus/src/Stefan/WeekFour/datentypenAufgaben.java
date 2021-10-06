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
        System.out.println("Geben Sie eine ganze Zahl zwischen 0 und 1000 ein: ");

        int summe = scanner.nextInt();
        for (int i = 0; i < summe; i++) {
            summe = summe +i;
        }
        System.out.println("Summe: " + summe);


    }
}
