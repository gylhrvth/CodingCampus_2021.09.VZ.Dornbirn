package Oemer.Week2;

public class Tag6 {
    public static void main(String[] args) {


        weinachtsBaum(20)  ;
    }


    public static void printChristmastree(int height) {
        baumDreieck(height);
        //kugeln(height)
        //stamm(height)
    }

    public static void baumDreieck(int height) {
        int stars = 1;
        int spaces = height - 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("*");
            }
            System.out.println();

            --spaces;
            stars += 2;
        }
    }

    public static void kugel(int hohe) {
        int breite = hohe * 2 - 1;
        for (int a = 0; a < breite; a++) {
            if (a % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }


        }
        System.out.println();
    }

    public static void baumStamm(int hohe) {
        int sterne = hohe * 2 - 1;
        int stammBreite = sterne / 4;
        int stammHohe = stammBreite / 3;
        int stammStart = sterne / 2 - stammBreite / 2;

        for (int a = 0; a < stammHohe; a++) {
            for (int b = 0; b < stammStart; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stammBreite; c++) {
                System.out.print("+");
            }
            System.out.println();
        }


    }

    public static void weinachtsBaum(int hohe) {
        int height = hohe;
        baumDreieck(height);
        kugel(height);
        baumStamm(height);
    }


}

