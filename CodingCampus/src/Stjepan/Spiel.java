package Stjepan;

import java.util.Random;
import java.util.Scanner;

public class Spiel {

    public static void main(String[] args) {

        Random rn = new Random(50);
        int z = rn.nextInt();

        System.out.println("My Guess");

        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        for (int i = 0; i < z; i++) {
            
        }

        if(z < guess){
            System.out.println("Ist kleiner");
        }
        if(z > guess){
            System.out.println("Ist grösser");
        }
        else{
            System.out.println("Richtig");
        }


    }
}
