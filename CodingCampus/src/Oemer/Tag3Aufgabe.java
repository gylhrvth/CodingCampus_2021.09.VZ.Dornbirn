package Oemer;

public class Tag3Aufgabe {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int j = 5; j >= 0; j--) {

            for (int i = 0; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
