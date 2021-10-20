package Eray.week6.uebungsBeispiele;

public class PrintX {
    public static void main(String[] args) {
        printXMainMenu();
    }

    private static void printXMainMenu() {
        //Gebe deine Höhe und ZeichenAuswahl ein
        printX(10, 'x');
    }

    private static void printX(int height, char character) {

        int halfHeight = height / 2;

        int spacesBeforeX = 0;
        int spacesAfterX = height - 2;
        //upperHalf
        for (int i = 0; i < halfHeight; i++) {
            for (int j = 0; j < spacesBeforeX; j++) {
                System.out.print(" ");
            }
            System.out.print(character);

            for (int j = spacesAfterX; i < j; j--) {
                System.out.print(" ");
            }
            System.out.print(character);

            spacesBeforeX++;
            spacesAfterX--;

            System.out.println();
        }

        spacesBeforeX = (height - 2) / 2;
        spacesAfterX = 0;

        //lowerHalf
        for (int i = 0; i < halfHeight; i++) {

            for (int j = spacesBeforeX; 0 < j; j--) {
                System.out.print(" ");
            }
            System.out.print(character);
            for (int j = 0; j < spacesAfterX; j++) {
                System.out.print(" ");
            }
            System.out.print(character);
            spacesBeforeX--;
            spacesAfterX+=2;

            System.out.println();

        }


    }
}
