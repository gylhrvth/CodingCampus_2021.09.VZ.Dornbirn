package Stefan.Week5;

import java.util.Scanner;

public class DurchschnittZahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein: ");
        double a = input.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double b = input.nextDouble();
        System.out.println("Geben Sie die dritte Zahl ein: ");
        double c = input.nextDouble();

        System.out.println("Der Durchschitt der eingegebenen Zahlen ist: " + durchschnitt(a, b, c));

    }

    public static double durchschnitt (double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
