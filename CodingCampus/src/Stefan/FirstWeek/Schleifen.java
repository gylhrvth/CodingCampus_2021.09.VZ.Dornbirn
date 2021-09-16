package Stefan.FirstWeek;

public class Schleifen {

    public static void main(String[] args) {
//        for (int a = 5, b = 2;b <= 10; b++){
//            System.out.println(a*b);
//        }

//        for (int m = 0; m < 5; m++) {
//            for (int l = 0; l < m; l++) {
//                System.out.print("X");
//            }
//            System.out.println("X");
//        }


        int width = 10;
        int height = 10;

        for (int a = 0; a < width; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int c = height; c > 0; c--) {
            for  (int d = 0; d < c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
