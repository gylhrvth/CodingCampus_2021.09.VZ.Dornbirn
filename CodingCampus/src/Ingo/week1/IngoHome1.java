package Ingo.week1;


    public class IngoHome1 {
        public static void main(String[] args) {

            int hight = 10;
            int upperHight = hight / 2;

            for (int i = 0; i < upperHight; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            int lowerHight = hight - upperHight;

            for (int j = lowerHight; j > 0; j--) {
                for (int i = 0; i < j; i++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (int m = -10; m <= 100; m++) {
                System.out.println(m);
            }
        }
    }
