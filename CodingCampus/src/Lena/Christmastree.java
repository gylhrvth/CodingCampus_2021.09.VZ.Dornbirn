package Lena;

public class Christmastree {

    public static void main(String[] args) {

    }

    public static void drawChristmastree(int high) {
        int highTribe = high / 4;
        int count = 1;

        for (int i = 1; i <= high; i++) {
//Baum
            if (i < (high - highTribe)) {

                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j++) {
                    System.out.print("X");

                }
                count += 2;
                System.out.println();
            }
//Christbaumkugeln
            if (i == (high - highTribe)) {
                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j += 2) {
                    System.out.print("* ");
                }
                count += 2;
                System.out.println();
            }
//Stamm
            if (i > (high - highTribe)) {
                for (int n = high - 2; n >= 0; n--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < highTribe; j++) {
                    System.out.print("X");
                }
                System.out.println();


            }
        }
    }
}

