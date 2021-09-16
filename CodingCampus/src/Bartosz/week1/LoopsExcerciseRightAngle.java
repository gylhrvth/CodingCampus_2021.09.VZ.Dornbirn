package Bartosz.week1;

public class LoopsExcerciseRightAngle {
    public static void main(String[] args) {

//        int breite = 5;
//        int höhe = 10;
//        for (int counter1 = 0; counter1 < höhe ; counter1++) {
//
//            for (int counter2 = 0; counter2 < breite ; counter2++) {
//                System.out.print("X");
//            }
//            System.out.println(" " + counter1);
//        }
        int height = 10;
        int width = 10;
        int jNumber = 0;

        for (int i = 0; i < height; i++) {      // solange laufen lassen bis counter == height
            if (i == 0 || i == height - 1) {    // Wenn erste oder letzte Reihe
                for (int j = 0; j < width; j++) {       //solange laufen lassen bis Zeilenbreite erreicht
                    System.out.print("X");
                }

            } else {                            // Alle Zeilen dazwischen

                for (int k = 0; k < width; k++) {       //solange laufen lassen bis Zeilenbreite erreicht
                    if (k <= 0 || k == width - 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(".");
                    }
                }

            }
            System.out.println();
        }

    }
}
