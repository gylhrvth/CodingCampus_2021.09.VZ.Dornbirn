package Bartosz.oldStuff.week1.loops;

import Bartosz.oldStuff.week1.loops.functions.CreateBox;

import java.util.Scanner;

public class LoopsEx5 {
    public static void main(String[] args) {

        System.out.println("Wie hoch soll die Box sein?");
        Scanner boxHeight = new Scanner(System.in);
        int height = boxHeight.nextInt();

        System.out.println("Wie breit soll die Box sein?");
        Scanner boxWidth = new Scanner(System.in);
        int width = boxWidth.nextInt();

        CreateBox.CreateConsoleBox(height, width);
        System.out.println();

        System.out.println("WHATS INSIDE THE BOX?!?");

//          Knees weak Arms are heavy, Mom's .......
//        int height = 5;
//        int width = 5;
//
//        for (int i = 0; i < height; i++) {      // solange laufen lassen bis counter == height
//            if (i == 0 || i == height - 1) {    // Wenn erste oder letzte Reihe
//                for (int j = 0; j < width; j++) {       //solange laufen lassen bis Zeilenbreite erreicht
//                    System.out.print("X");
//                }
//
//            } else {                            // Alle Zeilen dazwischen
//
//                for (int k = 0; k < width; k++) {       //solange laufen lassen bis Zeilenbreite erreicht
//                    if (k <= 0 || k == width - 1) {
//                        System.out.print("X");
//                    } else {
//                        System.out.print(".");
//                    }
//                }
//
//            }
//            System.out.println();
//        }

    }
}


