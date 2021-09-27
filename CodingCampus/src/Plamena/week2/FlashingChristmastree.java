package Plamena.week2;


import Plamena.week1.Methods;

import java.sql.Time;

public class FlashingChristmastree {
    public static void main(String[] args) {
        int height = 20;
        for ( int i = 0; i<=20; i++){
            clearScreen();
            if (i%2 == 0){
                Methods.drawChristmasTree(height);
            } else {
                Methods.YellowChristmastree(height);
            }
            Timer();
        }

    }


    public static void Timer (){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {

        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }



}
