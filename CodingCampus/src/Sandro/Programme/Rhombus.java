package Sandro.Programme;

public class Rhombus {

    public static void main(String[] args) {

        int height = 10;
        int upperheight = height / 2;
        int lowerheight = height - upperheight;
        int spaces = 0;
        int stars = 0;

        // upperhight
        for (int i = 0; i < upperheight; i++) {
            for (int j = upperheight; spaces < j; j--) {
                System.out.print(" ");
            }

            for (int j = -1; j < stars; j++) {
                System.out.print("*");
            }

            stars += 2;
            spaces++;

            System.out.println();
        }

        spaces = 3;
        stars = 6;
        for (int i = 0; i < lowerheight; i++) {
            for (int j = lowerheight; spaces < j; j--) {
                System.out.print(" ");
            }

            for (int j = -1; j < stars; j++) {
                System.out.print("*");
            }

            stars -= 2;
            spaces--;

            System.out.println();
        }
    }
}


