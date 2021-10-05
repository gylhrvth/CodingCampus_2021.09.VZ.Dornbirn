package Stefan.WeekFour;

import java.util.Scanner;

public class einMalEins {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein: ");
        int zahl = input.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(zahl + " x " + (i + 1) + " = " + (zahl * (i+1)));
        }


    }
}
