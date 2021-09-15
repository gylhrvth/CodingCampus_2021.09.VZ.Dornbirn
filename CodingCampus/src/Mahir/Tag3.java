package Mahir;

public class Tag3 {
    public static void main(String[] args) {


        for (int a = 0; a <= 10; a = ++a) {

            System.out.println(a * 5);
        }
        int b = 0;
        while (b <= 10) {
            System.out.println(b * 5);
            b++;
        }
        System.out.println();

        for (int c = 0; c < 5; c++) {

            for (int d = 0; d < 4; d++) {
                System.out.print("x");
            }
            System.out.println();
        }
        int m = 0;
        while (m <= 5) {

            int n = 0;
            while (n < m) {
                n++;
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
        System.out.println();

        for (int p = 0; p <= 5; p++) {
            for (int l = 0; l < p; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z = 5; z >= 0; z--) {

            for (int r = 0; r <= z; r++) {

                System.out.print("*");
            }
            System.out.println();
        }


        for(int x = 0;x <=10; x++){

            for(int y = 0;y < x; y++){

                System.out.print(" ");

                for(int z = 5;z < y; z++){

                    System.out.print("x");

                }
            }
            System.out.println();


        }
    }


}




