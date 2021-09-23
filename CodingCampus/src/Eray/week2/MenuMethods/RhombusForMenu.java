package Eray.week2.MenuMethods;

public class RhombusForMenu {
    public static void main(String[] args) {

    }

    public static void printRhombus(int height){
        int upperHeight = height / 2;
        int lowerHeight = height - upperHeight;

        for (int a = 0; a < upperHeight; a++) {

            for (int b = upperHeight; a < b; b--) {
                System.out.print(" ");
            }

            for (int c = 0; c < a; c++) {
                System.out.print("*");
            }

            for (int d = 0; d < a; d++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int a = 0; a < lowerHeight; a++) {

            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }

            for (int c = lowerHeight; a < c; c--) {
                System.out.print("*");
            }

            for (int d = upperHeight; a < d; d--) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
