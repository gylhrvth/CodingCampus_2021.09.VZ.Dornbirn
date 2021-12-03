package Saadaq.week5.Weekend;

import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice of char: ");

        int n2= sc.nextInt();
*/
/*
        // Square Pattern
        int n=10;


        for (int i=1; i<= n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_________");

        // Increasing Pattern
        int n2=5;

        for (int i=1; i<=n2; i++){
            for (int j=1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Next Pattern");*/

        int nn = 10;


        for(int i=0; i<=nn; i++  ){

            for(int j=i; j<=nn; j++){
                System.out.print("  ");

            }

            for (int l=1; l<=i; l++){
                System.out.print("* ");

            }

            for (int k=i; k<=nn; k++){
                System.out.print("* ");

            }

            for (int s=nn; s<=i; s++){
                System.out.print("  ");
            }



            System.out.println();

        }








    }// End of Main


}// End of Class
