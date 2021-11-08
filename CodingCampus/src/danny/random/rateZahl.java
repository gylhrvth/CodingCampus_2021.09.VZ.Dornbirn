package danny.random;

import java.util.Random;
import java.util.Scanner;

public class rateZahl {


    public static void main(String[] args) {

        Random pcZahl = new Random();
        int rm = pcZahl.nextInt(10);

        System.out.println("Welche Zahl habe ich mir ausgedacht?");

        Scanner eingabe = new Scanner(System.in);
        int eingabeZahl = eingabe.nextInt();

        while (eingabeZahl != rm) {
                System.out.println("Das ist nicht die Zahl");
                eingabeZahl = eingabe.nextInt();
        }
        System.out.println("Das ist die Zahl");
    }
}
