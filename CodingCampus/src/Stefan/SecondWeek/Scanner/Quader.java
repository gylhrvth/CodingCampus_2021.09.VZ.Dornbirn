package Stefan.SecondWeek.Scanner;

public class Quader {
    public static void main(String[] args) {
        printStar(10);
    }

    //Methoden

    public static void printStar(int height) {
        int width = height;
        for (int a = 0; a < height; a++) {
            for (int b = width; b > 0; b--) {
                System.out.print("*  ");
            }
            System.out.println();
        }


    }

}
