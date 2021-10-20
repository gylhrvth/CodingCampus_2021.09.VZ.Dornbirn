package Eray.week6.uebungsBeispiele;

public class Quader {
    public static void main(String[] args) {
        printQuader();
    }

    private static void printQuader() {
        int height = 5;
        int spaces = height - 2;
        int quaderLine = 1;

        for (int i = 0; i <= height; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < quaderLine; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < quaderLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= height; i++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
