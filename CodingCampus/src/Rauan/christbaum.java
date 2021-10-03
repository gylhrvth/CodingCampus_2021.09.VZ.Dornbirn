package Rauan;

class christbaum {
    public static void main(String[] args) {

        //christbaumkrone
        int height = 10;
        int stars = 1;
        int space = height - 1;
        for (int i = 0; i < height; i++) {
            for (int J = 0; J < space; J++) {
                System.out.print(" ");
            }
            for (int f = 0; f < stars; f++) {
                System.out.print("*");
            }
            stars += 2;
            space--;
            System.out.println();
        }
        //christbaumkugeln
        int width = stars - 2;

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //christbaumstamm
        int trunkHeight = height / 4;
        int trunkWidth = width / 3;

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
