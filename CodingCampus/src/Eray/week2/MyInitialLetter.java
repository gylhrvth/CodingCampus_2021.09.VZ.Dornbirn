package Eray.week2;

import Eray.week1.Circle;

public class MyInitialLetter {
    public static void main(String[] args) {
        int height = 10;
        int half = height / 2;
        int nameWidth = 7;



        for (int a = 0; a <= height; a++) {
            if (a == 0) {
                for (int b = 0; b < nameWidth; b++) {
                    System.out.print("*");
                }
            }


            if(a== half){
                for(int c = 0; c<nameWidth; c++ ){
                    System.out.print("*");
                }
            }

            if(a == height){
                for(int d = 0; d< nameWidth; d++){
                    System.out.print("*");
                }
            }

            System.out.println("*");


        }
    }
}
