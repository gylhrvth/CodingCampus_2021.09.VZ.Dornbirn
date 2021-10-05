package Sandro.Programme;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Calculator {


    public static void main(String[] args) {


        Scanner benutzereingabe = new Scanner(System.in);

        double ersteZahl;
        double zweiteZahl;
        char operator;

        while (true) {

            System.out.println("Geben Sie Ihre erste Zahl (Bei Kommazahlen bitte ',' verwenden):");
            ersteZahl = benutzereingabe.nextDouble();

            System.out.println("Geben Sie Ihre zweite Zahl ein:");
            zweiteZahl = benutzereingabe.nextDouble();

            System.out.println("Geben Sie ein Rechenoperator ein (*, /, +, -):");
            operator = benutzereingabe.next().charAt(0);

            if (operator == '*') {
                System.out.println("Ihr Ergebnis ist: " + (ersteZahl * zweiteZahl) + "\n");

            } else if (operator == '/') {
                System.out.println("Ihr Ergebnis ist: " + (ersteZahl / zweiteZahl) + "\n");

            } else if (operator == '+') {
                System.out.println("Ihr Ergebnis ist: " + (ersteZahl + zweiteZahl) + "\n");

            } else if (operator == '-') {
                System.out.println("Ihr Ergebnis ist: " + (ersteZahl - zweiteZahl) + "\n");
            } else {
                System.out.println("Ungültiger Rechenoperator");

            }

            }
        }
    }

