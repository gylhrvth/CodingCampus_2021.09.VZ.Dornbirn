package Lukas.week1.tag3;

import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
//        XXXXX
//        XXXXX
//        XXXXX
//        XXXXX

        int rows = 10;
        int columns = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        int i = 0;
        int j = 0;

        while (i < rows) {
            while (j < columns) {
                System.out.print("x");
                j++;
            }
            System.out.println();
            i++;
        }

        Random random = new Random();
        while(true) {
            int zufallszahl = random.nextInt(10);
            System.out.println(zufallszahl);
            if(zufallszahl == 5) {
                break;
            }
        }

        while(random.nextInt(10) != 5) {
            System.out.println("War nicht 5!");
        }
    }
}
