package Oemer;

public class Tag4Aufgabe {
    public static void main(String[] args) {

        int maxTreeHeight = 50;

        int stars = 1;

        for (int i = 0; i < maxTreeHeight; i++) {
            for (int f = 0; f < maxTreeHeight; f++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }
            System.out.println();


            stars += 2;

        }
        for (int i = 0; i >= stars; i--) {
            for (int j = 0; j <= stars; i--) {

            }
            System.out.println();

            maxTreeHeight--;
            stars -= 2;

        }

    }
}
