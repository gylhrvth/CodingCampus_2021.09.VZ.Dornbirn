package Lukas.week1.tag4;

public class Christbaum {
    public static void main(String[] args) {
        int maxTreeHeight = 40;

        for (int a = 1; a < maxTreeHeight; a += 4) {
            int height = a;

            int stars = 1;
            int spaces = maxTreeHeight - 1;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
                stars += 2;
                spaces--;
            }
            System.out.println();
        }
    }
}
