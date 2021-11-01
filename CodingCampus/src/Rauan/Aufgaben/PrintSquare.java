package Rauan.Aufgaben;

public class PrintSquare {
    public static void main(String[] args) {
         printSquare(10, "X");
        //printSquare1(3, "A");
    }

    private static void printSquare(int heigh, String character) {
        int height = 10;
        int space = height - 2;
        int squareLine = 1;
        for (int i = 0; i <= height; i++) {
            System.out.print("X");

        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < squareLine; j++) {
                System.out.print("X");

            }
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");

            }
            for (int n = 0; n < squareLine; n++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int i = 0; i <= height; i++) {
            System.out.print("X");

        }
        System.out.println();
    }

    private static void printSquare1(int heigh, String character) {
        int height = 3;
        int space = height - 2;
        int squareLine = 1;
        for (int i = 0; i <= height; i++) {
            System.out.print("A");
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < squareLine; j++) {
                System.out.print("A");
            }
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < squareLine; j++) {
                System.out.print("A");

            }
            System.out.println();
        }
        for (int j = 0; j <= height; j++) {
            System.out.print("A");

        }
        System.out.println();
    }
}

