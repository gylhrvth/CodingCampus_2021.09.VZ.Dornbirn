package Ingo.week1;

public class Day5 {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int c = 0; c < 10; c++) {
            for (int b = 10; b > c; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
