package Plamena.week2;

import java.util.Random;
import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int rnm = rn.nextInt(100);
        int i = 10;
        boolean inputTrue = false;
        int number = 0;


        while (i >= 0) {
            while (!inputTrue) {
                System.out.println("Choose a number between 0 and 100: ");
                number = sc.nextInt();
                if (number > 0 && number < 100) {
                    inputTrue = true;
                }
            }

            inputTrue=false;

                i--;

                if (number < rnm) {
                    System.out.println("Try again! Random number is higher! You've got " + i + " tries left!");
                }
                if (number > rnm && i > 0) {
                    System.out.println("Try again! Random number is lower! You've got " + i + " tries left!");
                }
                if (number == rnm) {
                    System.out.println("Congratulations! You won! To start over enter YES");
                    String input = sc.next();
                    String startOver = "YES";
                    if (input.equalsIgnoreCase(startOver)) {
                        i = 10;
                        rnm = rn.nextInt(100);
                    }
                } else {
                    if (i == 0) {
                        System.out.println("You lost! Right number was " + rnm + ". To start over enter YES");
                        String input = sc.next();
                        String startOver = "YES";
                        if (input.equalsIgnoreCase(startOver)) {
                            i = 10;
                            rnm = rn.nextInt(100);
                        } else {
                            break;
                        }
                    }
                }

        }
    }
}