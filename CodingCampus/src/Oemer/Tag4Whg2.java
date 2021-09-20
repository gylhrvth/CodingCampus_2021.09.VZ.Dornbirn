package Oemer;

public class Tag4Whg2 {
    public static void main(String[] args) {

        int hohe = 10;
        int leerzeichen = hohe;

        int sterne = 1;

        for (int i = 0; i < hohe; i++) {
            for (int s = 0; s < leerzeichen; s++) {
                System.out.print(" ");
            }
            for (int u = 0; u < sterne; u++) {
                System.out.print("x");
            }
            System.out.println();

            leerzeichen--;
            sterne += 2;


        }
        int breite = sterne - 2;
        System.out.print(" ");

        for (int i = 0; i < breite; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }


        }
        System.out.println();
        int stammBreite = breite / 3;
        int stammHohe = hohe / 4;

        int zentrum = hohe;
        int stammleft = zentrum - (stammBreite / 2);

        for (int i = 0; i < stammHohe; i++) {
            for (int u = 0; u < stammleft; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < stammBreite; f++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
