package Stefan.Week1;

public class Tannenbaum {
    public static void main(String[] args) {

        int heightSpitze = 6;
        int widthAbstandRand = heightSpitze;

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
        int behang = (heightSpitze * 2 - 1) / 2;

        for (int m = 0; m <= behang; m++) {
            System.out.print("O ");
        }
        System.out.println("");


        //Baumstamm
        int stammAbstand = behang - 2;
        int widthStamm = heightSpitze / 3;
        int heightStamm = heightSpitze / 3;

        for (int i = 0; i < heightStamm; i++) {
            for (int k = 0; k < stammAbstand; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Fuss
//        int fussAbstand = behang - 3;
//        int widthFuss = (heightSpitze * 2 - 1) / 4;
//
//        for (int i = 0; i < 1; i++) {
//            for (int k = 0; k < fussAbstand; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= widthFuss; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}
