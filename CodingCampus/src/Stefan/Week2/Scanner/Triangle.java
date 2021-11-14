package Stefan.Week2.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Triangle.triangle(10);
    }

    //Methoden
    public static void triangle(int width) {


//        if(upHeight % 2 == 0) {
//            upHeight++;
//        }

        for (int a = 0; a < width; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            if (a>0){
            System.out.println();
            }
        }

        for (int i = width; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
