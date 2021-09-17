package Bartosz.week1.loops.functions;

public class CreateBox{
    public static void CreateConsoleBox(int height, int width) {
        for (int i = 0; i < height; i++) {  //Reienschleife

            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {    //Breitenschleife oben & unten
                    System.out.print("X");
                }
                System.out.println();
            } else {
                for (int k = 0; k < width; k++) {       //solange laufen lassen bis Zeilenbreite erreicht
                    if (k <= 0 || k == width -1) {     // Wenn Erste oder letzte Stelle
                        System.out.print("X");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }
}
