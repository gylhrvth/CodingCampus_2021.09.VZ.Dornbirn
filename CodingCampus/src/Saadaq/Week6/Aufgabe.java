package Saadaq.Week6;

import java.lang.*;

public class Aufgabe {
    public static void main(String[] args) {


        int nFor =10;
        int nWhile = 1;
        int exclusive = 10;


        // aufabe1

        for (int i=1; i<=nFor; i++)

        {
            System.out.println(i);
        }



        while (nWhile <= 10)
        {
            System.out.println(nWhile);
            nWhile ++;
        }

        // Aufgabe 2
        for (int i=1; i<exclusive; i++){

            System.out.println(i);
        }

        int a[]= {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        System.out.println("Odd numbers: ");

        for (int i=0; i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }

        System.out.println("Even Numbers: ");


        for (int i=0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }









    }//End of Main
}// End of Class
