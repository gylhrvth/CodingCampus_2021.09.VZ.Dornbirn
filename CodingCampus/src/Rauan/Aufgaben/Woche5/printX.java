package Rauan.Aufgaben.woche5;

public class printX {
    public static void main(String[] args) {

        printX(10, "X");

    }

    private static void printX(int height, String character) {
        int heightHalf = height / 2;
        int spaceBeforeX = 0;
        int spaceAfterX = height - 2;
        for (int i = 0; i < heightHalf; i++) {
            for (int j = 0; j < spaceBeforeX; j++) {
                System.out.print(" ");
            }
            System.out.print(character);
            for (int j = spaceAfterX; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(character);

            spaceBeforeX++;
            spaceAfterX--;
            System.out.println();
        }

        spaceBeforeX = (height - 2) / 2;
        spaceAfterX = 0;
        for (int i = 0; i < heightHalf; i++) {
            for (int j = spaceBeforeX; 0 < j; j--) {
                System.out.print(" ");
            }
            System.out.print(character);
            for (int j = 0; j < spaceAfterX; j++) {
                System.out.print(" ");
            }
            System.out.print(character);

            spaceBeforeX--;
            spaceAfterX +=2;
            System.out.println();
        }
    }
}
