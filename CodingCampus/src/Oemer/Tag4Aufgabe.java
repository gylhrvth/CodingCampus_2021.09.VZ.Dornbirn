package Oemer;

public class Tag4Aufgabe {
    public static void main(String[] args) {

        //Dreieck vom baum

        int height = 20;
        int Spaces = height;

        int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int f = 0; f < Spaces; f++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }
            System.out.println();

            Spaces--;
            stars += 2;

        }
        
        //ChristBaumKugel

        int width = stars - 2;

        System.out.print(" ");

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //Baumstamm trunk
        int trunkWight = width / 3;
        int trunkHeight = height / 4;

        int center = height;
        int trunkLeftSpaces = center - (trunkWight / 2);

        for (int i = 0; i < trunkHeight; i++) {
            for (int u = 0; u < trunkLeftSpaces; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWight; f++) {
                System.out.print("+");


            }
            System.out.println();
        }
    }
}