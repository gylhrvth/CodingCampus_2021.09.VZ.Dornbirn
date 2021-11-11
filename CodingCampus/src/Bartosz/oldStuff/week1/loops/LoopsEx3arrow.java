package Bartosz.oldStuff.week1.loops;

import Bartosz.oldStuff.week1.loops.loopFunctions.Ex3Arrow;

import java.util.Scanner;

public class LoopsEx3arrow {
    public static void main(String[] args) {

        System.out.println("Wie groß soll er Pfeil sein?");
        Scanner heightArrow = new Scanner(System.in);
        int arrowHeight = heightArrow.nextInt();

        Ex3Arrow.printArrow(arrowHeight);

        // Spaghetti Code
//        int counter = 0;
//        int rows = 9;
//
//        while (counter < rows ) {
//
//            if (counter < 5) {
//                for (int kontroller = 0; kontroller <= counter; kontroller++) {
//                    System.out.print("*");
//                }
//            } else {
//                for (int kontroller = rows; kontroller > counter; kontroller--) {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//            counter++;
//        }

    }   //End Main

}


