package Stefan.FirstWeek;

public class Tannenbaum {
    public static void main(String[] args) {

        int heightSpitze = 10;
        int widthAbstandRand = heightSpitze;
        int behang = (heightSpitze * 2 - 1) / 2;
        int stammAbstand = behang - 2;
        int widthStamm = heightSpitze / 3;
        int fussAbstand = behang - 3;
        int widthFuss = (heightSpitze * 2 - 1) / 4;


        //Baumspitze
        for (int i = 0; i < heightSpitze; i++) {
            for (int k = 1; k < (widthAbstandRand - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //Kreise
        for (int m = 0; m <= behang; m++) {
            System.out.print("O ");
        }
        System.out.println("");


        //Baumstamm
        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < stammAbstand; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < stammAbstand; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //Fuss
        for (int i = 0; i < 1; i++) {
            for (int k = 0; k < fussAbstand; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= widthFuss; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
