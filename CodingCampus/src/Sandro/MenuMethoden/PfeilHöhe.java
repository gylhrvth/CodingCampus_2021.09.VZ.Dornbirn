package Sandro.MenuMethoden;

public class PfeilHöhe {

    public static void main(String[] args) {

        printArrow(0);

    }


    public static void printArrow(int height) {

/*        {
            // SANDROS CODE

            int l = 5;
            while (l <= ) {
                l = l + 1;


                for (int m = 0; m <= l; m++) {

                    System.out.print("*");
                }
                System.out.println();
            }

            int p = 10;
            while (p >= 0) {
                p = p - 1;

                for (int o = 2; o <= p; o++) {

                    System.out.print("*");
                }
                System.out.println();*/



            //Arrow solution ERRAYS CODE

            int upperHeight = height / 2;

            for (int i = 0; i < upperHeight; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            int lowerHeight = height - upperHeight;

            for (int j = lowerHeight; j > 0; j--) {
                for (int i = 0; i < j; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


