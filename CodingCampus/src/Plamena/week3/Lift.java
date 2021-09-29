package Plamena.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxWeight = 0;
        int maxNumberPass = 16;
        int[] passWeight = new int[maxNumberPass];

        for (int i = 0; i <= maxNumberPass-1; i++) {

            System.out.println("Passenger " + (i+1) + " please enter your weight");
            int weight = sc.nextInt();
            passWeight[i] = weight;
            maxWeight = maxWeight + passWeight[i];

            System.out.println(Arrays.toString(passWeight));

            if(i == maxNumberPass-1){
                System.out.println("Maximal allowed passenger number reached");
            }
            if( maxWeight >1600){
                System.out.println("Maximal allowed passenger weight reached");
                break;
            }
        }

    }
}
