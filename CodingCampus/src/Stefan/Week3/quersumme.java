package Stefan.Week3;

import java.util.Scanner;

public class quersumme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzhal ein: ");
        int zahl = input.nextInt();


        System.out.println("Quersumme = " + quersumme(zahl));

    }


    public static int quersumme(int zahl) {

        if (zahl <= 9) return zahl;

        return zahl%10 + quersumme(zahl/10);

    }
}
