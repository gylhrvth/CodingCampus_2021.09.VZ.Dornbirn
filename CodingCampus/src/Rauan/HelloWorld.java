package Rauan;

import java.util.Calendar;

public class HelloWorld {

    public static void main(String[] args) {

        //christbaumkrone

        int height = 7;
        int stars = 1;
        int space = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            space--;
        }
        //christbaumkugeln
        int width = stars - 2;
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //christbaumstamm
        int trunkheight = height / 4;
        int trunkwidth = width / 3;
        int center = width / 2;

        int trunkleftspace = center - (trunkwidth / 2);
        for (int i = 0; i < trunkheight; i++) {
            for (int j = 0; j < trunkleftspace; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < trunkwidth; k++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}



