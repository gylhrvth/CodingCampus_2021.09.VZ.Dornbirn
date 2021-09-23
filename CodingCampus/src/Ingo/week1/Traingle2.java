package Ingo.week1;

public class Traingle2 {
    public static void main(String[] args) {
        int height = 9;
        int half = height / 2;

        boolean inUpperHalf = true;

        int stars = 1;

        if(height % 2 == 0) {
            height++;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            if (half == i) {
                inUpperHalf = false;
            }

            if (inUpperHalf) {
                stars++;
            } else {
                stars--;
            }
            System.out.println();
        }

    }
}
