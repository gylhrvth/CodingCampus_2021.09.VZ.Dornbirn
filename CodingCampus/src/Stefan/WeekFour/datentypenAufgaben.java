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
        System.out.println("Geben Sie einen Wert für Zoll ein: ");
        double input = scanner.nextDouble();

        double sum = input * 0.0254;
        sum = Math.round(sum * 100);

        System.out.println(input + " Zoll sind " + sum / 100 + " Meter");
    }
}
