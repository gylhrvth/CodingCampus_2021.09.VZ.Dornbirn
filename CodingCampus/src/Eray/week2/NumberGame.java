package Eray.week2;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe ein Zahl zwischen 1 - 10 ein");
        int input = scanner.nextInt();


       int number = rnd.nextInt(11);

        while(number != input){
            System.out.println("Bitte gebe ein Zahl zwischen 1 - 10 ein");
         input = scanner.nextInt();
        }
        System.out.println("Du hast Gewonnen");


    }
}
