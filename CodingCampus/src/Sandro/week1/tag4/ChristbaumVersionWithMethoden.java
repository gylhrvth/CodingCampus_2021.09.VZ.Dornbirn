package Sandro.week1.tag4;

public class ChristbaumVersionWithMethoden {
    public static void main(String[] args) {


        //Baumkrone
        int height = 5;                                      // Wie hoch wird der Baum ?
        int spaces = height - 1;                             // Wie viele Spaces brauchen wir von links am Anfang ? Wird dann mit Operation spaces-- immer um 1 reduziert (solange Schleife Height true ist)
        int width = height * 2 - 1;
        int stars = 1;


        spacesWithStars(height, spaces, stars);
        christBaumKugeln(width);
        trunk(width, height);

    }


    // Oberer Teil Christbaum

    public static void spacesWithStars(int spaces, int height, int stars) {
        for (int i = 0; i < height; i++) {                  // Wie hoch wird der Baum ? Definiert: height / gesamte verschachtelte Schleife wird 5x durchlaufen
            for (int j = 0; j < spaces; j++) {              // Wie viele Abstände hat der Baum von links aus am Anfang ? Definiert: spaces / Schleife wird 4x durchlaufen und wird immer 1x weniger
                System.out.print(" ");                      // Ausgabe Spaces
            }

            for (int j = 0; j < stars; j++) {               // Wie viele Sterne bekommt der Baum ? Definiert Stars / Schleife wird 1x durchlaufen und wird immer 2x mehr
                System.out.print("*");
            }

            System.out.println();

            stars += 2;                                    // Operationen
            spaces--;
        }

    }

    //Christbaumkugeln

    //int width = height * 2 - 1;


    public static void christBaumKugeln(int width) {
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    //Baumstamm

    public static void trunk(int width, int height) {

        int trunkWidth = width / 3;
        int trunkHeight = height / 4;

        int center = width / 2;
        int trunkLeftSpaces = center - (trunkWidth / 2);

        for (int i = 0; i < trunkHeight; i++) {
            for (int u = 0; u < trunkLeftSpaces; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("+");
            }
            System.out.println();
        }

    }
}



