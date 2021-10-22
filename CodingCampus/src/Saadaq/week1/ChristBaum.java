package Saadaq.week1;

public class ChristBaum {

    public static void main(String[] args) {


        int height = 50;
        //BaumKrone

        int stars = 1;
        int spaces = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.println("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;

        }
    }
}
