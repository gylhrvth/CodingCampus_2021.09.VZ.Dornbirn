package Ingo;

public class IngoTag3schleife {
    public static void main(String[] args) {
        for (int a = 0; a <= 8; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int a = 8; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int c = 6; c >= 6; c++) {
            for (int d = 0; d <= d; d++) {
                System.out.print("X");
            }
        }
        System.out.println();

        for (int c = 6; c >= 0; c--) {
            for (int d = 0; d <= c; d++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}

