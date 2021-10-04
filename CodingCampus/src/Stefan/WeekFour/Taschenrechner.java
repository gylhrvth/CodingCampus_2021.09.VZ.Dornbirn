package Stefan.WeekFour;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        double input1;
        String input2;
        double input3;

        Scanner taschenrechner = new Scanner(System.in);


        System.out.println("Gib deine erste Zahl ein");
        input1 = taschenrechner.nextDouble();

        System.out.println("Gib den Operator ein (+, -, *, /");
        input2 = taschenrechner.next();

        System.out.println("Gib die zweite Zahl ein");
        input3 = taschenrechner.nextDouble();
        double result = 0;
        switch (input2) {
            case "+":
                result = input1 + input3;
                System.out.println("Das Ergebnis = " + (input1 + input3) + " EURO");
                break;
            case "-":
                result = input1 - input3;
                System.out.println("Das Ergebnis = " + (input1 - input3) + " EURO");
                break;
            case "*":
                result = input1 * input3;
                System.out.println("Das Ergebnis = " + (input1 * input3) + " EURO");
                break;
            case "/":
                result = input1 / input3;
                System.out.println("Das Ergebnis = " + (input1 / input3) + " EURO");
                break;
        }
        System.out.println();

        System.out.println("In welche Währung soll der Betrag Getauscht werden! (geben Sie bitte die entsprechende " +
                "Zahl ein).\n1: Euro zu Yen\n2: Euro zu Dollar");

        int input4;

        Scanner währung = new Scanner(System.in);
        input4 = währung.nextInt();


        switch (input4) {
            case 1:
                System.out.println(result + " Euro sind " + (result * 107.2)  + " Yen");
                break;
            case 2:
                System.out.println(result + " Euro sind " + (result * 1.16)  + " Dollar");
                break;
        }

    }




}
