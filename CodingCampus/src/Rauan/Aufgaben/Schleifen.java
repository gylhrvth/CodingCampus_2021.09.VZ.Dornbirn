package Rauan.Aufgaben;

public class Schleifen {
    public static void main(String[] args) {
       // count1();
       // count2();
      //  count3();
        count4();
    }

    private static void count1() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
    }

    private static void count2() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static void count3() {
        for (int i = 0; i <= 10; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }
    }

    private static void count4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
}
