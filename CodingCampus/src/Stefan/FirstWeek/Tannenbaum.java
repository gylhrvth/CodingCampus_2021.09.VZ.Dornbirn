package Stefan.FirstWeek;

public class Tannenbaum {
    public static void main(String[] args) {

        //Baumspitze
        int widthLeerSpitze = 10;
        int widthAbstandRand = 4;

        for (int i = 1; i < widthLeerSpitze; i += 2) {
            for (int k = 0; k < (widthAbstandRand - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Kreise
        int behang = 4;

        for (int m = 0; m <= behang; m++) {
            System.out.print("O ");
        }
        System.out.println("");

        //Baumstamm
        int widthStamm = 3;
        int widthLeerStamm = 3;

        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < widthLeerStamm; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < widthLeerStamm; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Halterung
        int widthFuss = 4;
        int heightFuss = 1;
        int widthLeerFuss = 2;

        for (int i = 1; i <= heightFuss; i++) {
            for (int k = 0; k < widthLeerFuss; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= widthFuss; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
