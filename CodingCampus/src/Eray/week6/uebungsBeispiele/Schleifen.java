package Eray.week6.uebungsBeispiele;

public class Schleifen {
    public static void main(String[] args) {
        count();
        count2();
        count3();
        countReverse();
    }

    private static void count() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static void count2() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void count3() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void countReverse(){
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }

    }


}
