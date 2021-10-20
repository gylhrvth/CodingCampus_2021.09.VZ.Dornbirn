package Ingo.week5.home;

public class HomeTest {
    public static void main(String[] args) {

        int size = 5;
        String text = "I";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2; j++) {
                if (j <= i) {
                    System.out.print("*");
                }

            }System.out.println();
        }
        for (int i = size; i >= 0 ; i--) {
            for (int j = 0; j < size*2 ; j++) {
                if (j <= i){
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        for (int i = 5-1; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


