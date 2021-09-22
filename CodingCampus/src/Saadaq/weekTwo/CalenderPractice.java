package Saadaq.weekTwo;

import javax.swing.*;

public class CalenderPractice {

    public static void main(String[] args) {


        String headline = "| IS | TA | AR | KH | JIM | SA | AX |";
        System.out.println(headline);

        int DaysOffTheMonth = 31;


        System.out.print("| ");
        for(int i=1; i<= DaysOffTheMonth; i++){
            System.out.printf("%2d",i);
            System.out.print("| ");

            if (i % 7 == 0){
                System.out.println();
                System.out.print("|< ");
            }




        }







    }
}









