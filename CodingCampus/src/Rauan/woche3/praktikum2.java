package Rauan.woche3;

import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        // shreiben sie ein java-programm, das eine Gleitkommazahl liest und "Null"ausgibt,wenn die zahl null ist.
        // Ansonsten "positive" oder "negative" ausgeben.


      /*  Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie ein zahl");
        float num1 = input.nextFloat();
        if (num1== 0) {
            System.out.println(" null = " + num1);
        }  else{
            System.out.println("null ist positive");
        }

       */


      /*  Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie ein zahl");
        float num1 = input.nextFloat();
        if (num1< 0) {
            System.out.println(" null = " + num1);
        }  else{
            System.out.println("null ist negative");
        }


       */
/*
        Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie ein zahl");
        float num1 = input.nextFloat();
        if (num1> 0) {
            System.out.println(" null = " + num1);
        }  else{
            System.out.println("null ist positive");
        }

 */
        float large = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie eine zahl");
        float num1 = input.nextFloat();
        if (num1 < large){
            System.out.println("large" + num1);
        } else{
            System.out.println("large ist positive");
        }

    }
}
