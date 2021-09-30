package Rauan.woche3;

import java.util.Scanner;

public class praktikum {
    public static void main(String[] args) {


     /*   int result;
        int grüßeste = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie erste zahl ein");
        int num1 = input.nextInt();

        System.out.println("bitte geben sie zeite zahl ein");
        int num2 = input.nextInt();


        System.out.println("bitte geben sie dritte zahl ein");
        int num3 = input.nextInt();

        if (num1 > num2) {
            result = grüßeste;
        } else if (num1 > num3) {
            result = grüßeste;
        }
        System.out.println("Die zahl nummer ein ist grüßeste = " + num1);

        //...........
        if (num2 > num1) {
            result = grüßeste;
        } else if (num2 > num3) {
            result = grüßeste;
        } else {
            System.out.println("Die zahl nummer zwei ist grüßeste =" + num2);

        }

      */
        // shreiben sie ein java-programm, das eine Gleitkommazahl liest und "Null"ausgibt,
        //
        Scanner input = new Scanner(System.in);
        System.out.println("bitte geben sie ein zahl");
        float num1 = input.nextFloat();
        if (num1== 0) {
            System.out.println(" null = " + num1);
        }  else{
            System.out.println("null ist positive");
        }
        //


    }
}
