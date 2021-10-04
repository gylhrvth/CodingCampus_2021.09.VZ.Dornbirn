package Lena;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static Random rnd = new Random();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count =0;

        int number = rnd.nextInt(10);

        int input=0;

        while (number!=input){
            System.out.println("Welche Zahl habe ich mir ausgedacht? zwischen 0 und 10");
            input=scanner.nextInt();

            if(number>input){
                System.out.println("Meine Zahl ist größer als deine");
            }

            if(number<input){
                System.out.println("Meine Zahl ist kleiner als deine");
            }

            if(count==4){
                System.out.println("Du hast es leider nicht erraten!");
                System.out.println("Die Zahl wäre: "+number);
                break;
            }
            count++;
        }

        System.out.println("Super!! du hast die Zahl erraten!");
    }
}
