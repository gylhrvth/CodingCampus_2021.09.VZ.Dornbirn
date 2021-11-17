package Plamena;

import Plamena.week1.Methods;
import Plamena.week4.StringExercise;

import java.lang.invoke.MethodHandle;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

import Plamena.week5.TextExcercise;

public class Trial {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib drei Zahlen ein!");

        int Zahl1 = scanner.nextInt();
        String Zahl2 = scanner.next();
        int Zahl3 = scanner.nextInt();

        switch (Zahl2) {
            case "*":
                System.out.println("Dein Ergebnis ist" + (Zahl1 * Zahl3));
                break;
        }*/
//        String s = "Hello World";
//        System.out.printf("The String object %s is at hash code %h%n", s, s);

//        int distance = 1000;
//        double fuelStand = 50.0;
//        double consumption = 7.5;
//        double avDistance = (fuelStand / consumption) * 100;
//        System.out.println("Available distance: " + (int)avDistance);
//        double distanceLeft = distance - avDistance;
//        System.out.println("Distance left: " + (int)distanceLeft);
//
//        if (distanceLeft > 0 && avDistance > 0 && avDistance >= distanceLeft) {
//            for (int i = 0; i < avDistance; i++) {
//                if (i % 100 == 0 || i == (int) avDistance)
//                    System.out.println("---->driving " + i + "km");
//            }
//            System.out.println(distanceLeft - avDistance);
//        }
//        if (distanceLeft > 0 && avDistance > 0 && avDistance <= distanceLeft) {
//            for (int i = 0; i < avDistance; i++) {
//                if (i % 100 == 0 || i == (int) avDistance)
//                    System.out.println("---->driving " + i + "km");
//            }
//            System.out.println(distanceLeft - avDistance);
//        } else if (distanceLeft < 0 && avDistance > 0) {
//            for (int i = 0; i < distance; i++) {
//                if (i % 100 == 0 || i == distance)
//                    System.out.println("---->driving " + i + "km");
//            }
//        }
//
//        if(distance == avDistance){for (int i = 0; i <= distance; i++) {
//            System.out.println("Driving distance");
//            for (int j = 0; j <= distance; j++) {
//                if (j % 100 == 0 || j == distance)
//                    System.out.println("---->driving " + j + "km");
//            }
//        }
//
//        }
//        if(distanceLeft< 0){
//            System.out.println("Driving distance with fuel left");
//            for (int j = 0; j <= distance; j++) {
//                if (j % 100 == 0 || j == distance)
//                    System.out.println("---->driving " + j + "km");
//            }
//        }
//        if(distanceLeft > 0){
//            System.out.println();
//        }


        double sideA = 6.0;
        double sideB = 6.0;
        double sideC = 6.0;

        double area = sideC * (Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC))) / 2 ;

        System.out.println(area);
    }



}
