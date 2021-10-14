package Stjepan;

public class Schleifmaschinen {
    public static void main(String[] args) {

        int height = 200;
        int halfhight = height / 2;


        for (int i = 0; i < halfhight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        for (int j = halfhight; j > -1; j--) {
            for (int i = 0; i <= j; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}