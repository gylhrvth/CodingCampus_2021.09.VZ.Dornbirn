package Danny.menu;

//Was möchtest du tun?
//1) Print christmastree
//2) Print arrow
//3) Print calendar
//4) Rhombus
//5) Exit

//Auswahl ist 1)
//Höhe des Christbaums erfragen
//Christbaum ausgeben -> Bestehende Methode verwenden aus anderer Klasse
//zurück ins Menü

//import java.util.Scanner;
//
//public class UserInput {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //Solange eine Eingabe einfordern, solange es keine Zahl ist
//        System.out.println("Geben Sie eine Zahl ein!!!");
//        while (!scanner.hasNextInt()) {
//            System.out.println("Geben Sie eine Zahl ein!!!");
//            scanner.nextLine();
//        }
//        int input = scanner.nextInt();
//        System.out.println("Sie haben die Zahl " + input + " eingegeben!");
//    }
//}


import Danny.calendars.CalendarMet;
import Danny.loop.Kreis;
import Danny.string.Methods;
import Danny.string.Tannenbaum;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean neverEnd = true;
        while (neverEnd) {

            System.out.println("---------------------");
            System.out.println("What do you want to do?");
            System.out.println("1 = Calculator");
            System.out.println("2 = Circle");
            System.out.println("3 = Christmastree");
            System.out.println("4 = Calendar");
            System.out.println("5 = Exit");
            System.out.println("---------------------");
            System.out.println("Please enter a number...");

            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1: {
                        System.out.println("Erste Zahl eingeben");
                        int Zahl1 = scanner.nextInt();
                        System.out.println("+,-,/,* eingeben");
                        String operation = scanner.next();
                        System.out.println("Zweite Zahl eingeben");
                        int Zahl2 = scanner.nextInt();
                        System.out.println();
                        Methods.simpleCal(Zahl1, operation, Zahl2);
                        break;
                    }
                    case 2: {
                        System.out.println("Radius eingeben");
                        int radius = scanner.nextInt();
                        Kreis.circle(radius);
                        break;
                    }
                    case 3: {
                        System.out.println("Höhe eingeben");
                        int kronenHoehe = scanner.nextInt();
                        Tannenbaum.christmastree(kronenHoehe);
                        break;
                    }
                    case 4: {
                        System.out.println("Jahr eingeben");
                        int yaer = scanner.nextInt();
                        System.out.println("Monat eingeben");
                        int month = scanner.nextInt();
                        System.out.println("Tag eingeben");
                        int day = scanner.nextInt();
                        CalendarMet.calendar(yaer, month, day);
                        break;
                    }
                    case 5: {
                        neverEnd = false;
                        break;
                    }
                    default: {
                        System.out.println("Bitte korrekte Zahl eingeben");
                    }
                }
            } else {
                System.out.println("Das ist keine Zahl...");
                System.out.println("Bitte korrekte Zahl eingeben");
            }
        }
    }
}
